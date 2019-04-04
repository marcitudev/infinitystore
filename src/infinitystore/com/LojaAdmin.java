package infinitystore.com;

import java.util.ArrayList;
import java.util.List;

public class LojaAdmin {
	private List<Usuario> usuarios;
	private List<Produto> produtos;
	
	public String addUsuario(String nome, String sobrenome, String nomeDeUsuario, String senha) {
		for(Usuario usuTeste: usuarios) {
			if(usuTeste.getNomeDeUsuario().equals(nomeDeUsuario)) {
				return "Nome de usuário em uso.";
			}
		}
		Usuario novoUsuario = new Usuario(nome, sobrenome, nomeDeUsuario, senha);
		usuarios.add(novoUsuario);
		return "Usuário " + novoUsuario.getNomeDeUsuario() + " adicionado ao banco de dados.";
	}
	
	public Usuario procurarUsuario(String nomeDeUsuario) {
		for(Usuario usuTeste: usuarios) {
			if(usuTeste.getNome().equals(nomeDeUsuario)) {
				return usuTeste;
			}
		}
		throw new RuntimeException("Usuário não encontrado na base de dados.");
	}
	
	public String removeUsuario(String nomeDeUsuario) {
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
	
	public String removeProduto(String nomeProduto) {
		for(Produto proTeste: produtos) {
			if(proTeste.getNome().equals(nomeProduto)) {
				produtos.remove(proTeste);
				return nomeProduto+" removido.";
			}
		}
		return "Produto não existente.";
	}
	
}
