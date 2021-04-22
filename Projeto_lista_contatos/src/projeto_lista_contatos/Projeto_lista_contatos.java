package projeto_lista_contatos;

public class Projeto_lista_contatos {

    public static void main(String[] args) {
      
      String nomeContato = "Mike Tyson";
      Endereco novoEndereco = new Endereco("Rua São João", "555","Apt 502", "50.000-130", "Recife", "Pernambuco");
      Telefone[] telefones = new Telefone[2];     
      telefones[0] = new Telefone("celular", "9998-7755");
      telefones[1] = new Telefone("fixo", "3361-2570");
      
      Contato contato = new Contato(nomeContato, novoEndereco, telefones); 
      
      // Exibir conteúdo das variáveis
      
      System.out.println(contato.getNome());
      
        if (contato != null && contato.getEndereco()!= null) {
            System.out.println(
                    "Endereço:"+ 
                    " " + contato.getEndereco().getNomeRua()+ 
                    " " + contato.getEndereco().getNumero() +  
                    " " + contato.getEndereco().getComplemento() +         
                    " " + contato.getEndereco().getCep() + 
                    " " + contato.getEndereco().getCidade()+
                    " " + contato.getEndereco().getEstado());
            
        } 
        if (contato != null && contato.getTelefone()!= null) {
            
            for(Telefone t: contato.getTelefone()){
                System.out.println(t.getTipo()+" " + t.getDdd()+ " " + t.getNumero());
            }   
        }
    }
}