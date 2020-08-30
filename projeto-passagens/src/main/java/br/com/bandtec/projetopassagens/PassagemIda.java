package br.com.bandtec.projetopassagens;

public class PassagemIda extends Passagem {

    // Construtor
    public PassagemIda(String nome, String cpf, Integer codigo, String aeroOrigem, String aeroDestino, Integer qtdPassageiroAdulto, Integer qtdPassageiroCrianca,
                       Integer dia, Integer mes, String classe, Double preco, Integer qtdBagagens) {
        super(nome, cpf, codigo, aeroOrigem, aeroDestino, qtdPassageiroAdulto, qtdPassageiroCrianca,
                dia, mes, classe, preco, qtdBagagens);
    }

    // Método
    @Override
    public Double getAdicionalBag() {
        return (getQtdBagagens() * 30) + getPreco();
    }

    // toString
    @Override
    public String toString() {
        return super.toString();

    }
}
