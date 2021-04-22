package projeto_lista_contatos;

public class Endereco {
    
//Atributos
    private String nomeRua;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;    

    //Métodos
    public Endereco(String nomeRua, String numero, String complemento, String cep, String cidade, String estado) {
        this.setNomeRua(nomeRua);
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.setCep(cep);
        this.setCidade(cidade);
        this.setEstado(estado);
    }

    public String getNomeRua() {
        return nomeRua;
    }

    private void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getNumero() {
        return numero;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    private void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    private void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    private void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    private void setEstado(String estado) {
        this.estado = estado;
    }
    
}