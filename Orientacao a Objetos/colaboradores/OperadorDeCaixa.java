package aulas.oo.colaboradores;

public class OperadorDeCaixa extends FuncionarioCLT {
    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    public OperadorDeCaixa() {
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getComplemento() + // Aqui, opcionalmente impôs-se a impressão apenas do
                // Atributo complemento do Endereço
                '}';
    }
}