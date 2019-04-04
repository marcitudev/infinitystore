package infinitystore.com;

import java.util.List;

public class Produto {
	private String nome;
	private String marca;
	private String objeto;
	private String categoria;
	private List<Avaliacao> avaliacoes;
	private double valor;
	
	public Produto(String nome, String marca, String objeto, String categoria, double valor) {
		this.nome = nome;
		this.marca = marca;
		this.objeto = objeto;
		this.categoria = categoria;
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
	
	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Avaliacao> avaliacoes(){
		return avaliacoes;
	}

}