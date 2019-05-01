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
        private List<Produto> carrinho = new ArrayList<Produto>();
	
	public Usuario(String nome, String sobrenome, String nomeDeUsuario, String senha) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nomeDeUsuario = nomeDeUsuario;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}

	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void addInteresse(String categoria) {
                interesses.add(categoria);
	}
        
        public List<String> getInteresse(){
            return this.interesses;
        }
	
	public void addFavorito(Produto produto) {
		favoritos.add(produto);
	}
        
        public List<Produto> getFavoritos(){
            return this.favoritos;
        }
        
        public void removeFavorito(Produto produto){
            favoritos.remove(produto);
        }
        
        public void addProduto(Produto produto){
            carrinho.add(produto);
        }
        
        public List<Produto> getCarrinho(){
            return this.carrinho;
        }
        
        public void removeProduto(Produto produto){
            carrinho.remove(produto);
        }
}
