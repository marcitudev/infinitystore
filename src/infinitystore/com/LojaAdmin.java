package infinitystore.com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LojaAdmin {
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Produto> produtos = new ArrayList<Produto>();

	public String addUsuario(String nome, String sobrenome, String nomeDeUsuario, String senha) {
		if(nome.length() > 2 && sobrenome.length() > 2 && nomeDeUsuario.length() > 0 && senha.length() >= 6) {
			boolean existe = nomeDeUsuarioExiste(nomeDeUsuario);
			if (existe) {
				return "Nome de usuário já existe.";
			} else {
				Usuario novoUsuario = new Usuario(nome, sobrenome, nomeDeUsuario, senha);
				usuarios.add(novoUsuario);
			}
			return "\nUsuário " + nomeDeUsuario + " adicionado ao banco de dados.";
		}
		return "\nVerifique suas informações e tente novamente.";
	}

	// Verifica se o nome de usuário já existe para evitar cadastro redundante
	public boolean nomeDeUsuarioExiste(String nomeDeUsuario) {
		for (Usuario usuTeste : usuarios) {
			if (usuTeste.getNomeDeUsuario().equals(nomeDeUsuario)) {
				return true;
			}
		}
		return false;
	}

	// Retorna se o login é de usuário ou administrador
	public String EntrarUsuario(String nomeDeUsuario, String senha) {
		if (nomeDeUsuario.equals("admin") & senha.equals("admin")) {
			return "admin";
		} else {
			for (Usuario usuTeste : usuarios) {
				if (usuTeste.getNomeDeUsuario().equals(nomeDeUsuario) & usuTeste.getSenha().equals(senha)) {
					return "usuario";
				}
			}
		}
		return "nenhum";
	}

	public List<Usuario> listarUsuarios() {
		return this.usuarios;
	}

	public Usuario procurarUsuario(String nomeDeUsuario) {
		for (Usuario usuTeste : usuarios) {
			if (usuTeste.getNomeDeUsuario().equals(nomeDeUsuario)) {
				return usuTeste;
			}
		}
		return null;
	}

	public String removerUsuario(String nomeDeUsuario) {
		Usuario usuario = procurarUsuario(nomeDeUsuario);
		if (usuario != null) {
			usuarios.remove(usuario);
			return "Usuário " + nomeDeUsuario + " removido com sucesso.";
		}
		return "Usuário não existe na base de dados.";
	}

	public String addProduto(Produto produto) {
		produtos.add(produto);
		return produto.getNome() + " adicionada à loja";
	}

	public List<Produto> procurarProduto(String nomeProduto) {
		List<Produto> produtosEncontrados = new ArrayList<Produto>();
		ArrayList<String> pesquisaSeparada = quebraNome(nomeProduto.toLowerCase());
		for (Produto proTeste: produtos) {
			ArrayList<String> nomeProdutoSeparado = quebraNome(proTeste.getNome().toLowerCase());
			if(nomeProdutoSeparado.containsAll(pesquisaSeparada)) {
				produtosEncontrados.add(proTeste);
			}
		}
		return produtosEncontrados;
	}

	public ArrayList<String> quebraNome(String nomeProduto) {
		ArrayList<String> nomeSeparado = new ArrayList<String>();
		String[] nomePartes = nomeProduto.split(" ");
		for (String parte : nomePartes) {
			nomeSeparado.add(parte);
		}
		return nomeSeparado;
	}
	
	public List<String> analiseDeRemocao(String nomeProduto) { //Listar produto por índice para depois removê-lo
		List<String> listaProdutos = new ArrayList<String>();
		List<Produto> produtosListados = procurarProduto(nomeProduto);
		if(produtosListados.size() > 0) {
			for (Produto proTeste: produtosListados) {
				int indice = this.produtos.indexOf(proTeste);
				listaProdutos.add(indice + ". " + proTeste.getNome() + "\nR$ " + proTeste.getValor() + "\n====================");
			}
		}
		return listaProdutos;
	}
	
	public String removerProduto(int indice) {
		String nomeProduto = produtos.get(indice).getNome();
		produtos.remove(indice);
		return nomeProduto;
	}
	
	public void gravaDados() {
		Gravador bancoDados = new Gravador();
		try {
			bancoDados.gravaUsuarios(usuarios);
		} catch (IOException e) {
			System.out.println("Error 404 Not found");;
		}
		
		try {
			bancoDados.gravaProdutos(produtos);
		} catch (IOException e) {
			System.out.println("Error 404 Not found");;
		}
	}
	
	public void recuperaDados() {
		Gravador bancoDados = new Gravador();
		try {
			this.usuarios = bancoDados.recuperaUsuarios();
		} catch (IOException e) {
			System.out.println("Dados dos usuários carregados... \n");;
		}
		
		try {
			this.produtos = bancoDados.recuperaProdutos();
		} catch (IOException e) {
			System.out.println("Dados dos produtos carregados... \n");;
		}
	}

}
