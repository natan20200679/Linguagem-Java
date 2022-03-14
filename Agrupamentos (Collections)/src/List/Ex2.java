/*
Crie uma lista e execute as seguintes operações:
- Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João (R)
- Navegue na lista exibindo cada nome no console (R)
- Substitua o nome Carlos por Roberto (R)
- Retorne o nome da posição 1 (R)
- Remova o nome da posição 4 (R)
- Remova o nome João (R)
- Retorne a quantidade de ítens na lista (R)
- Verifique se o nome Juliano existe na lista (R)
- Crie uma nova lista com os nomes Ismael e Rodrigo. Adicione todos os ítens da nova lista na primeira criada (R)
- Ordene os ítens da lista por ordem alfabética (R)
- Verifique se a lista está vazia (R)
 */

package List;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("\n-- Adicionamento dos 5 nomes --");
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        System.out.println(nomes);

        System.out.println("\n-- Navegação na lista exibindo os nomes na saída --");
        Iterator<String> i = nomes.iterator();

        for (String nome: nomes) {
            System.out.println(nome);
        }

        System.out.println("\n-- Substituição de Carlos por Roberto --");
        System.out.println(nomes);
        nomes.set(2,"Roberto");
        System.out.println(nomes);

        System.out.println("\n-- Retorno do nome da posição 1 --");
        System.out.println(nomes);
        System.out.println(nomes.get(1));

        System.out.println("\n-- Remoção do nome da posição 4 --");
        System.out.println(nomes);
        System.out.println(nomes.remove(4));

//        A saída abaixo será False, pois foi o elemento de índice 4 removido
        System.out.println("\n-- Remoção do nome João --");
        System.out.println(nomes);
        System.out.println(nomes.remove("joão"));

        System.out.println("\n-- Retorno da quantidade de ítens da lista --");
        System.out.println(nomes);
        System.out.println(nomes.size());

        System.out.println("\n-- Verificação do nome Juliano na lista --");

        System.out.println(nomes.contains("Juliano"));

        System.out.println("\n-- Nova lista com os nomes Ismael e Rodrigo, Adicionamento destes ítens na primeira" +
                " criada --");
        System.out.println(nomes);
        List<String> nomes2 = new ArrayList<>();
        Collections.addAll(nomes,"Ismael","Rodrigo");
        System.out.println(nomes);

        System.out.println("\n-- Ordenação dos ítens por ordem alfabética --");
        System.out.println(nomes);
        Set<String> nomes3 = new TreeSet<>(nomes);
        System.out.println(nomes3);

        System.out.println("\n-- Verificação de lista vazia --");
        System.out.println(nomes.isEmpty());

    }
}