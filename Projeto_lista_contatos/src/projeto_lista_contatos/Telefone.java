package projeto_lista_contatos;

public class Telefone {
   
   //Atributos
    private String tipo;
    private String ddd;
    private String numero;
    
   //Construtor 
    public Telefone(String tipo, String numero) {
       this.setTipo(tipo);
       this.setDdd("81");
       this.setNumero(numero);
    }
    
    //Métodos
    
     public String getTipo() {
        return tipo;
    }

    public String getDdd() {
        return ddd;
    } 

    public String getNumero() {
        return numero;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private void setDdd(String ddd) {
        this.ddd = ddd;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }
    
}