package infinitystore.com;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Produto implements Serializable{
    
	private String nome;
	private String marca;
	private String categoria;
        private String descricao;
        private int quantidade;
        private String urlImagem;
	private double valor;
	
	public Produto(String nome, String marca, String categoria, String descricao, int quantidade, String url, double valor) {
		this.nome = nome;
		this.marca = marca;
                this.categoria = categoria;
                this.descricao = descricao;
                this.quantidade = quantidade;
                this.urlImagem = url;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
        
        public String getDescricao(){
            return descricao;
        }
        
        public void setDescricao(String descricao){
            this.descricao = descricao;
        }
        
        public int getQuantidade(){
            return this.quantidade;
        }
        
        public void setQuantidade(int quantidade){
            this.quantidade = quantidade;
        }
        
        public String getImagem(){
                return this.urlImagem;
        }

	public String getCategoria() {
		return this.categoria;
	}

	public void addCategoria(String categoria) {
                this.categoria = categoria;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}