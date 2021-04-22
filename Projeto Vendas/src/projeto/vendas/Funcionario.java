package projeto.vendas;

import java.util.ArrayList;

public class Funcionario extends Pessoa {

   
	private String dataAdmissao;
	private String dataRecisao;
	
        private final ArrayList<Cliente> clientes = new ArrayList<>();
       
         
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public String getDataRecisao() {
		return dataRecisao;
	}
        
        public int quantidadeClientes(){
            return clientes.size();
        }
	
	public void setDataRecisao(String dataRecisao) {
		this.dataRecisao = dataRecisao;
	}
	
	public void cadastraCliente(Cliente cliente) {
		
                clientes.add(cliente);
        }

	public Cliente getCliente(int posicao) {
	
              return clientes.get(posicao);
        }
	
	public void alteraCliente(Cliente cliente) {
            
		clientes.remove(cliente);
                  
	}
	
	
}
