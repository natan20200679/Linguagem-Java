package aulas.oo.colaboradores;

public abstract class FuncionarioPJ {
    private String nome;
    private String documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private double valorHora;
    private double valorRemuneracao;

    public void calculaRemuneracao() {
        this.valorRemuneracao = this.horasTrabalhadas * this.valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }

}