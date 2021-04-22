
package projeto.vendas;


public class ProjetoVendas {
    Cliente cliente = new Cliente();
    Funcionario funcionario = new Funcionario();
    
public static void main(String[] args) {
    Funcionario funcionario1= new Funcionario();
    funcionario1.setCodigo(12);
    funcionario1.setDataAdmissao("10-06-2005");
        
    Cliente cliente1= new Cliente();
    cliente1.setNome("paloma");
    cliente1.setCodigo(123);
    cliente1.setData_de_nascimento("12052000");
    
    cliente1.setFuncionario(funcionario1);
    funcionario1.cadastraCliente(cliente1);
    
    Cliente cliente2= new Cliente();
    cliente2.setNome("matheus");
    cliente2.setCodigo(124);
    cliente2.setData_de_nascimento("13052001");
    
    cliente2.setFuncionario(funcionario1);
    funcionario1.cadastraCliente(cliente2);
    
    Cliente cliente3= new Cliente();
    cliente3.setNome("vini");
    cliente3.setCodigo(125);
    cliente3.setData_de_nascimento("16062000");
    
    cliente3.setFuncionario(funcionario1);
    funcionario1.cadastraCliente(cliente3);
    
    System.out.println("Dados do Cliente cadastrado");	
    System.out.println(cliente1.getNome());
    System.out.println(cliente1.getCodigo());
    System.out.println(cliente1.getData_de_nascimento());
    System.out.println(cliente1.getFuncionario().getCodigo());
    
    System.out.println("Clientes Cadastrados: ");
    for(int i=0; i< funcionario1.quantidadeClientes(); i++){
        System.out.println(funcionario1.getCliente(i).getNome()); 
    }
}

}
