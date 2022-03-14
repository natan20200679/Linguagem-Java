/*
Mentoria GFT QA 1
 */

package aulas.oo.colaboradores;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Endereço para esta rua");
        System.out.println(endereco.getRua());

        // Outra forma de imprimir informações
//        Endereco endereco = new Endereco("Rua funcionário","Complemento endereco funcionario",
//                "Bairro funcionário");
//        System.out.println(endereco);

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Camila Vendedora");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Camila Op Caixa","789.456.123-00",
                2000d,endereco);
        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("Camila Gerente");
        gerente.setDocumento("456.123.789-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);


    }
}