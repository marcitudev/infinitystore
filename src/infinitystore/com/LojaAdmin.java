package infinitystore.com;

import java.util.ArrayList;
import java.util.List;

public class LojaAdmin {
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Produto> produtos = new ArrayList<Produto>();

	public String addUsuario(String nome, String sobrenome, String nomeDeUsuario, String senha) {
		boolean existe = nomeDeUsuarioExiste(nomeDeUsuario);
		if (existe) {
			return "Nome de usuário já existe.";
		} else {
			Usuario novoUsuario = new Usuario(nome, sobrenome, nomeDeUsuario, senha);
			usuarios.add(novoUsuario);
		}
		return "Usuário " + nomeDeUsuario + " adicionado ao banco de dados.";
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
			return "Usuário " + nomeDeUsuario + " removido.";
		}
		return "Usuário não existe na base de dados.";
	}

	public String addProduto(Produto produto) {
		produtos.add(produto);
		return produto.getNome() + " adicionada à loja.";
	}

	public List<Produto> procurarProduto(String nomeProduto) {
		List<Produto> produtosEncontrados = new ArrayList<Produto>();
		ArrayList<String> pesquisaSeparada = quebraNome(nomeProduto);
		for (Produto proTeste: produtos) {
			ArrayList<String> nomeProdutoSeparado = quebraNome(proTeste.getNome());
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

	public String removerProduto(String nomeProduto) {
		for (Produto proTeste : produtos) {
			if (proTeste.getNome().equals(nomeProduto)) {
				produtos.remove(proTeste);
				return nomeProduto + " removido.";
			}
		}
		return "Produto não existente.";
	}

}
