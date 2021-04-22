package projeto.vendas;

public class Cliente extends Pessoa {
	private String dataCadastro;
	private double valorEmAberto;
	
        Funcionario funcionario;
	Endereco endereco;
	Contatos contato;
      
	public String getDataCadastro() {
		return dataCadastro;
	}

        public Funcionario getFuncionario() {
                return funcionario;
        }

        public void setFuncionario(Funcionario funcionario) {
                this.funcionario = funcionario;
        }

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public double getValorEmAberto() {
		return valorEmAberto;
	}

	public void setValorEmAberto(double valorEmAberto) {
		this.valorEmAberto = valorEmAberto;
	}

	public void tiraExtrato() {
		
	}
	
	public void efetuarPagamento() {
		System.out.println("Pagamento efetuado.");
	}

   
}   

   
