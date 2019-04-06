package infinitystore.com;

import java.util.ArrayList;
import java.util.List;

public class Produto {

	private String objeto;
	private String nome;
	private String marca;
	private String categoria;
	private List<Avaliacao> avaliacoes;
	private double valor;
	
	public Produto(String objeto, String nome, String marca, String categoria, double valor) {
		this.objeto = objeto;
		this.nome = nome;
		this.marca = marca;
		this.categoria = categoria;
		this.avaliacoes = new ArrayList<Avaliacao>();
		this.valor = valor;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
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
	
	public void addAvaliacao(Avaliacao avaliacao) {
		avaliacoes.add(avaliacao);
	}

	public List<Avaliacao> avaliacoes(){
		return avaliacoes;
	}

}