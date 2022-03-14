/*
Classe usada como exemplo de Passagem de Parâmetro (por Valor e por Referência), junto à classe Contato, mostrado por
Loiane Groner (Youtube)
 */

package Criacao;

public class PassagemValorParametro {
    public static void main(String[] args) {
        int valor = 10;
        Contato contato = new Contato("Contato 1", "1234-5678", "contato1@email.com");
        System.out.println(valor);
        System.out.println(contato);

        System.out.println("------------------");

        testePassagemValorReferencia(valor, contato);
        System.out.println(valor);
        System.out.println(contato);

        System.out.println("------------------");

//        testePassagemValorReferencia2(valor, contato);
//        System.out.println(valor);
//        System.out.println(contato);
    }
    private static void testePassagemValorReferencia(int valor, Contato contato) {
        int novoValor = valor + 10;
        valor = novoValor;
        contato = new Contato("Contato2", "2345-6789", "contato2@email.com");
    }
//    private static void testePassagemValorReferencia2(int valor, Contato contato) {
//        int novoValor = valor + 10;
//        valor = novoValor;
//        contato.setNome("Contato" + novoValor);
//    }
}
