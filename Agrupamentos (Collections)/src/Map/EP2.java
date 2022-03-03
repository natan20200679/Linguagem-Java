/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene. Depois, mostre quantas vezes
cada valor foi conseguido.
*/

package Map;

import java.util.*;

public class EP2 {
    public static void main(String[] args) {

        // Criação da lista contendo os números lançados através da chamada do método "lancamentoDeDados"
        List<Integer> resultadoDosLancamentos = lancamentoDeDados();
        System.out.println(resultadoDosLancamentos);

        // Criação do dicionário de par de valores contendo a frequência de cada número do dado, através da
        // Chamada do método "lancamentosOrganizados", que se referencia ao resultado do método "lancamentoDeDados"
        Map<Integer, Integer> lancamentosOrganizadosPorGrupo = lancamentosOrganizados(lancamentoDeDados());
        System.out.println(lancamentosOrganizadosPorGrupo);

        // Chamada do método "simulacaoDeProcessamento"
        simulacaoDeProcessamento();

        // Chamada do método "exibindoResultadoDosLancamentosAgrupados", que se referencia ao resultado do método
        // "lancamentosOrganizadosPorGrupo"
        exibindoResultadoDosLancamentosAgrupados(lancamentosOrganizadosPorGrupo);

    }

    //Método que irá gerar os números aleatórios simulando o lançamento de um dado 100 vezes.
    private static List<Integer> lancamentoDeDados() {

        //Classe Java que gera números aleartórios
        Random lancadorDeDados = new Random();

        //Lista que irá armazenar todos os valores gerados
        List<Integer> todosResuldadoDosLancamentos = new ArrayList<>();

        for(int i = 0; i < 100; i++) {

            //Esse valor deverá ser entre 1 e 6.
            int resuldadoDoLancamento = lancadorDeDados.nextInt(6) + 1;

            //Adicionando o resuldadoDoLancamento dentro da lista de lançamentos
            todosResuldadoDosLancamentos.add(resuldadoDoLancamento);
        }

        return todosResuldadoDosLancamentos;
    }

    //Método que irá organizar os resultados dos lançamentos em grupos de 1 a 6 (resultados possíveis de um dado),
    // que se referencia à lista com os lançamentos do dado
    private static Map<Integer, Integer> lancamentosOrganizados(List<Integer> lancamentosDeDados) {

        //Map que irá armazenar os resultados dos lançamentos de acordo com o resultado.
        Map<Integer, Integer> resultadoDosLancamentosOrganizados = new HashMap<Integer, Integer>();

        //Vamos pegar a lista com todos os lançamentos e organizar dentro de um map chave e valor.
        for (Integer resultadoDoLancamento : lancamentosDeDados) {

            //Se ao navegar na lista, o elemento armazenado na lista (que é o resultado do lançamento) já tiver aparecido:
            if (resultadoDosLancamentosOrganizados.containsKey(resultadoDoLancamento)) {

                //Pega esse resultado e coloca dentro do Map como key e informa, acrescentando +1 no value para indicar
                // que esse resultado apareceu mais uma vez.
                resultadoDosLancamentosOrganizados.put(resultadoDoLancamento, (resultadoDosLancamentosOrganizados
                        .get(resultadoDoLancamento) + 1));
            } else {

                //Se foi a primeira vez que o resultado apareceu na lista
                //Pega esse resultado e coloca como key de um elemento do Map, e informa no valor que ele apareceu pela
                // primeira vez, indicando 1.
                resultadoDosLancamentosOrganizados.put(resultadoDoLancamento, 1);
            }
        }

        return resultadoDosLancamentosOrganizados;
    }

    //Simulando como se o lançador demorasse um tempo para lançar e contabilizar.
    private static void simulacaoDeProcessamento() {
        System.out.print("Processando");

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //Exibindo o resultado dos lançamentos agrupados.
    private static void exibindoResultadoDosLancamentosAgrupados(Map<Integer, Integer> resuldadoDosLancamentosAgrupados) {
        System.out.println("\nValor " + " Quant. de vezes");

        for (Map.Entry<Integer, Integer> entry : resuldadoDosLancamentosAgrupados.entrySet()) {
            //Formatando a saída no console com espaçamento.
            // Pegando Key (Valor da face do dado) e Value (quantas vezes deu o número dessa face nos lançamentos.)
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }

}