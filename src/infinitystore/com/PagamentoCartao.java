package infinitystore.com;

public class PagamentoCartao {

	int valorTotal;
	int numeroParcelas;
	int senhaDoCartao;
	String numeroCartao;
        
	// compra a vista no cartao de debito
	public PagamentoCartao( String numCartao,int valor, int parcelas, int senha ) {
		this.valorTotal = valor;
		this.numeroParcelas = parcelas;
		this.senhaDoCartao = senha;
		this.numeroCartao = numCartao;
	}
	// compra parcelada no cartao de credito
	public void PagamentoParcelado(int valorParcela, int qtParcelas, int senha, String numCartao) {
		this.valorTotal = (valorParcela * qtParcelas);
		this.numeroParcelas = qtParcelas;
		this.senhaDoCartao = senha;
		this.numeroCartao = numCartao;
	}

	public int getSenhaDoCartao() {
		return senhaDoCartao;
	}

	// valor da parcela
	public int getvalorParcela() {
		return valorTotal / numeroParcelas;

	}

	// valor total
	public int getValorTotal() {
		return valorTotal ;
	}

	// quantidade de parcelas
	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	// numero do cartao
	public String getNumerocartao() {
		return numeroCartao;
	}

	// comprovante super simples compra parcelada
	void imprimeComprovanteCompraParcelada() {
		System.out.println("Loja infinityStore  \nValor Pago pelo produto foi: " + this.valorTotal
				+ "\nNumero do seu cartão: " + this.getNumerocartao() + "\nTotal de parcelas foi $ "
				+ this.getNumeroParcelas() + "\nValor de cada parcela será $ " + this.getvalorParcela()
				+ "\nObrigado por escolher a InfinitStore!! !!\n");
	}

	// comprovante super simples compra a vista
	void imprimeComprovanteCompraAVista() {
		System.out.println("Loja infinityStore  \nValor Pago pelo produto foi: " + this.valorTotal
				+ "\nNumero do seu cartão: " + this.getNumerocartao() + "\nTotal de parcelas foi $ "
				+ this.getNumeroParcelas() + "\nValor da parcela será $ " + this.getvalorParcela()
				+ "\nObrigado por escolher a InfinitStore!! !!\n");
	}
}
