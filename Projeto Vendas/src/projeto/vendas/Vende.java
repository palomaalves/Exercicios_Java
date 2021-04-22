package projeto.vendas;
public class Vende {
	private int codVenda;
	private int codClienteVenda;
	private String dataVenda;
	private int codProVenda;
	private int qtdVenda;
	private double precoVenda;
	private double subTotalVenda;
	private String formaPagamento;
	
	public int getCodVenda() {
		return codVenda;
	}
	
	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}
	
	public int getCodClienteVenda() {
		return codClienteVenda;
	}
	
	public void setCodClienteVenda(int codClienteVenda) {
		this.codClienteVenda = codClienteVenda;
	}
	
	public String getDataVenda() {
		return dataVenda;
	}
	
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	public int getCodProVenda() {
		return codProVenda;
	}
	
	public void setCodProVenda(int codProVenda) {
		this.codProVenda = codProVenda;
	}
	
	public int getQtdVenda() {
		return qtdVenda;
	}
	
	public void setQtdVenda(int qtdVenda) {
		this.qtdVenda = qtdVenda;
	}
	
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public double getSubTotalVenda() {
		return subTotalVenda;
	}
	
	public void setSubTotalVenda(double subTotalVenda) {
		this.subTotalVenda = subTotalVenda;
	}
	
	public String getFormaPagamento() {
		return formaPagamento;
	}
	
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
}
