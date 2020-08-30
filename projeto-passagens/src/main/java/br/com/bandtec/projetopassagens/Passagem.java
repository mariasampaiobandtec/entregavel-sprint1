package br.com.bandtec.projetopassagens;

public abstract class Passagem extends Passageiro {

    // Atributos
    private Integer codigo;
    private String aeroOrigem;
    private String aeroDestino;
    private Integer qtdPassageiroAdulto;
    private Integer qtdPassageiroCrianca;
    private Integer dia;
    private Integer mes;
    private String classe;
    private Double preco;
    private Integer qtdBagagens;

    // Construtor
    public Passagem(String nome, String cpf, Integer codigo, String aeroOrigem, String aeroDestino, Integer qtdPassageiroAdulto,
                    Integer qtdPassageiroCrianca, Integer dia, Integer mes, String classe, Double preco, Integer qtdBagagens) {
        super(nome, cpf);
        this.codigo = codigo;
        this.aeroOrigem = aeroOrigem;
        this.aeroDestino = aeroDestino;
        this.qtdPassageiroAdulto = qtdPassageiroAdulto;
        this.qtdPassageiroCrianca = qtdPassageiroCrianca;
        this.dia = dia;
        this.mes = mes;
        this.classe = classe;
        this.preco = preco;
        this.qtdBagagens = qtdBagagens;
    }

    // Método Abstrato
    public abstract Double getAdicionalBag();

    // Getters
    public Integer getCodigo() {
        return codigo;
    }

    public String getAeroOrigem() {
        return aeroOrigem;
    }

    public String getAeroDestino() {
        return aeroDestino;
    }

    public Integer getQtdPassageiroAdulto() {
        return qtdPassageiroAdulto;
    }

    public Integer qtdPassageiroCrianca() {
        return qtdPassageiroCrianca;
    }

    public Integer getDia() {
        return dia;
    }

    public Integer getMes() {
        return mes;
    }

    public String getClasse() {
        return classe;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQtdBagagens() {
        return qtdBagagens;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                "\n--- Dados da Passagem ---" +
                "\nLocalizador: " + codigo +
                "\nAero Origem: " + aeroOrigem +
                "\nAero Destino: " + aeroDestino +
                "\nQtd Passageiro Adulto: " + qtdPassageiroAdulto +
                "\nQtd Passageiro Criança: " + qtdPassageiroCrianca +
                "\nDia: " + dia +
                "\nMês: " + mes +
                "\nClasse: '" + classe +
                "\nPreço: " + preco +
                "\nQtd Bagagens: " + qtdBagagens +
                "\nPreço total: " + getAdicionalBag();
    }
}
