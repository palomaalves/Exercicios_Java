package projeto.vendas;
public class Fornecedor {
	private int codFornecedor;
	private String razao;
	private String nomeFantasia;
	private String inscEstadual;
	private int cnpj;
	
	Endereco endereco = new Endereco();
	Contatos contato = new Contatos();
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contatos getContato() {
		return contato;
	}

	public void setContato(Contatos contato) {
		this.contato = contato;
	}
	
	
	public int getCodFornecedor() {
		return codFornecedor;
	}
	
	public void setCodFornecedor(int codFornecedor) {
		this.codFornecedor = codFornecedor;
	}
	
	public String getRazao() {
		return razao;
	}
	
	public void setRazao(String razao) {
		this.razao = razao;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getInscEstadual() {
		return inscEstadual;
	}
	
	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	
	public int getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
}
