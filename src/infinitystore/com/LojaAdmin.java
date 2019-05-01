package infinitystore.com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LojaAdmin {
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Produto> produtos = new ArrayList<Produto>();

	public String addUsuario(String nome, String sobrenome, String nomeDeUsuario, String senha, List<String> categorias) {
		if(nome.length() > 2 && sobrenome.length() > 2 && nomeDeUsuario.length() > 0 && senha.length() >= 6) {
			boolean existe = nomeDeUsuarioExiste(nomeDeUsuario);
			if (existe) {
				return "Infelizmente já usam este nome de usuário. :'(";
			} else {
				Usuario novoUsuario = new Usuario(nome, sobrenome, nomeDeUsuario, senha);
                                for(String cat: categorias){
                                    novoUsuario.addInteresse(cat);
                                }
				usuarios.add(novoUsuario);
			}
			return "Seja bem-vindo(a), amigo(a) " + nomeDeUsuario + ", à Infinity Store!";
		}
		return "Eita! Talvez você tenha errado alguma informação.";
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

	public List<Usuario> procurarUsuario(String nomeDeUsuario) {
            List<Usuario> listaUsuarios = new ArrayList<Usuario>();
            if(nomeDeUsuario.equals("")){
                for(Usuario u: usuarios){
                    listaUsuarios.add(u);
                }
            } else{
                for (Usuario usuTeste: usuarios) {
                    if (usuTeste.getNomeDeUsuario().equals(nomeDeUsuario)) {
			listaUsuarios.add(usuTeste);
                    }
		}
            } 
            return listaUsuarios;
	}
        
        public List<Integer> indiceUsuario(String nomeDeUsuario) { //Listar produto por índice para depois removê-lo
		List<Integer> indices = new ArrayList<Integer>();
		List<Usuario> usuariosAchados = procurarUsuario(nomeDeUsuario);
		if(usuariosAchados.size() > 0) {
			for (Usuario uTeste: usuariosAchados) {
				int indice = this.usuarios.indexOf(uTeste);
                                indices.add(indice);
			}
		}
		return indices;
	}
        
	public void removerUsuario(int indice) {
            usuarios.remove(indice);
	}

	public String addProduto(Produto produto) {
		produtos.add(produto);
		return produto.getNome() + " adicionado à loja";
	}

	public List<Produto> procurarProduto(String nomeProduto) {      
		List<Produto> produtosEncontrados = new ArrayList<Produto>();
                if(nomeProduto.equals("")){
                    for (Produto proTeste: produtos) {
                        produtosEncontrados.add(proTeste);
                    } 
                }
		ArrayList<String> pesquisaSeparada = quebraNome(nomeProduto.toLowerCase());
		for (Produto proTeste: produtos) {
			ArrayList<String> nomeProdutoSeparado = quebraNome(proTeste.getNome().toLowerCase());
			if(nomeProdutoSeparado.containsAll(pesquisaSeparada)) {
				produtosEncontrados.add(proTeste);
			}
		}
                return produtosEncontrados;
	}
        
        public List<Produto> procurarProdutoCategoria(String categoria){
            List<Produto> produtosAchados = new ArrayList<Produto>();
            for(Produto p: this.produtos){
                if(p.getCategoria().equals(categoria)){
                }else {
                    produtosAchados.add(p);
                }
            }
            return produtosAchados;
        }

	public ArrayList<String> quebraNome(String nomeProduto) {
		ArrayList<String> nomeSeparado = new ArrayList<String>();
		String[] nomePartes = nomeProduto.split(" ");
		for (String parte : nomePartes) {
			nomeSeparado.add(parte);
		}
		return nomeSeparado;
	}
	
	public List<Integer> indiceProduto(String nomeProduto) { //Listar produto por índice para depois removê-lo
		List<Integer> indices = new ArrayList<Integer>();
		List<Produto> produtosListados = procurarProduto(nomeProduto);
		if(produtosListados.size() > 0) {
			for (Produto proTeste: produtosListados) {
				int indice = this.produtos.indexOf(proTeste);
                                indices.add(indice);
			}
		}
		return indices;
	}
	
	public void removerProduto(int indice) {
		produtos.remove(indice);
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
