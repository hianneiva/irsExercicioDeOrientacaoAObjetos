package exercicio3;

public class Pagamento {
	
	protected double valor;
	protected FormaPagamento tipoPagamento;
	
	public Pagamento() {
		this.valor = 0;
		this.tipoPagamento = null;
	}

	protected enum FormaPagamento{
		CHEQUE("Cheque"),
		DINHEIRO("Dinehiro"),
		CARTAO("Cart�o");
		
		String forma;
		
		private FormaPagamento(String forma) {
			this.forma = forma;
		}
		
		public String toString(){
			return this.forma;
		}
	}
	
	protected void pagar(FormaPagamento forma, double valorTotal){
		this.tipoPagamento = forma;
		this.valor = valorTotal;
	}

}
