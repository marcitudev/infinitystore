package infinitystore.com;

import java.util.ArrayList;
import java.util.List;

public class LojaAdmin {
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public String addUsuario(String nome, String sobrenome, String nomeDeUsuario, String senha) {
		boolean existe = nomeDeUsuarioExiste(nomeDeUsuario);
		if(existe) {
			return "Nome de usuário já existe.";
		} else {
			Usuario novoUsuario = new Usuario(nome, sobrenome, nomeDeUsuario, senha);
			usuarios.add(novoUsuario);
		}
		return "Usuário " + nomeDeUsuario + " adicionado ao banco de dados.";
	}
	
	public boolean nomeDeUsuarioExiste(String nomeDeUsuario) {
		for(Usuario usuTeste: usuarios) {
			if(usuTeste.getNomeDeUsuario().equals(nomeDeUsuario)) {
				return true;
			}
		}
		return false;
	}
	
	public String EntrarUsuario(String nomeDeUsuario, String senha) {
		if(nomeDeUsuario.equals("admin") & senha.equals("admin")) {
			return "admin";
		} else {
			for(Usuario usuTeste: usuarios) {
				if(usuTeste.getNomeDeUsuario().equals(nomeDeUsuario) & usuTeste.getSenha().equals(senha)) {
					return "usuario";
				}
			}
		}
		return "nenhum";
	}
	
	public List<Usuario> listarUsuarios(){
		return this.usuarios;
	}
	
	public Usuario procurarUsuario(String nomeDeUsuario) {
		for(Usuario usuTeste: usuarios) {
			if(usuTeste.getNomeDeUsuario().equals(nomeDeUsuario)) {
				return usuTeste;
			}
		}
		throw new RuntimeException("Não existe esse nome de usuário.");
	}
	
	public String removerUsuario(String nomeDeUsuario) {
		for(Usuario usuTeste: usuarios) {
			if(usuTeste.getNomeDeUsuario().equals(nomeDeUsuario)) {
				usuarios.remove(usuTeste);
				return "Usuário " + nomeDeUsuario + " removido.";
			}
		}
		return "Usuário não existe na base de dados.";
	}
	
	public String addProduto(String nome, String marca, String objeto, String categoria, double valor) {
		Produto novoProduto = new Produto(nome, marca, objeto, categoria, valor);
		produtos.add(novoProduto);
		return novoProduto.getNome();
	}
	
	public List<Produto> encontrarProduto(String nomeProduto){
		List<Produto> produtosEncontrados = new ArrayList<Produto>();
		for(Produto proTeste: produtos) {
			if(proTeste.getNome().equals(nomeProduto)) {
				produtosEncontrados.add(proTeste);
			}
		}
		if (produtosEncontrados == null)
			throw new RuntimeException("Produto não encontrado.");
		else
			return produtosEncontrados;
	}
	
	public String removerProduto(String nomeProduto) {
		for(Produto proTeste: produtos) {
			if(proTeste.getNome().equals(nomeProduto)) {
				produtos.remove(proTeste);
				return nomeProduto+" removido.";
			}
		}
		return "Produto não existente.";
	}
	
}
