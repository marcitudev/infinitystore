package infinitystore.com;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Serializable{
	private String nome;
	private String sobrenome;
	private String nomeDeUsuario;
	private String senha;
	private List<String> interesses = new ArrayList<String>();
	private List<Produto> favoritos = new ArrayList<Produto>();
	
	public Usuario(String nome, String sobrenome, String nomeDeUsuario, String senha) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nomeDeUsuario = nomeDeUsuario;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}

	public String getSenha() {
		return senha;
	}
	
	public void addInteresse(String categoria) {
		if(!interesses.contains(categoria)) {
			interesses.add(categoria);
		}
	}
	
	public void addFavorito(Produto produto) {
		favoritos.add(produto);
	}
}
