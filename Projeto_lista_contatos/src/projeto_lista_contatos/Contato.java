package projeto_lista_contatos;

import java.util.ArrayList;

public class Contato {
    //Atrbutos
    private String nome;
    private Endereco endereco;
    private Telefone[] telefone; 
    
    //Construtor
    public Contato(String nome, Endereco endereco, Telefone[] telefone) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }

    //Métodos
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    private void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefone() {
        return telefone;
    }

    private void setTelefone(Telefone[] telefone) {
        this.telefone = telefone;
    }
}
