package infinitystore.com;

public class PagamentoDinheiro {

	int valorTotal;

	// compra com pagamento em dinheiro
	public PagamentoDinheiro(int valor, String dataPagamento) {
		this.valorTotal = valor;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	// boleto super simples
	void imprimeBoleto() {
		System.out.println("Loja InfinityStore  \npague: " + this.getValorTotal()
				+ "\nObrigado por escolher a InfinityStore!!\n");
	}

}