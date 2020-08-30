package br.com.bandtec.projetopassagens;

public abstract class Passageiro {

    // Atributos
    private String nome;
    private String cpf;

    // Construtor
    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // toString
    @Override
    public String toString() {
        return "--- \nPassageiro ---" +
                "\nNome: " + nome +
                "\nCPF: " + cpf;
    }
}
