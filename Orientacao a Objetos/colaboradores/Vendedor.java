package aulas.oo.colaboradores;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    private Double valorDaBonificação;

    @Override
    public void calculaBonificacao(double porcentagemBonificacao) {
        this.valorDaBonificação = this.valorSalario * (porcentagemBonificacao / 100d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                ", valorDaBonificação=" + valorDaBonificação +
                '}';
    }
}