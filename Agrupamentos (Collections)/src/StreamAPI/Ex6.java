// Streams Paralelos: Exemplos das aulas de Rinaldo Júnior (Youtube), com pequenas modificações. Nota: Essas
// ferramentas devem ser usadas apenas quando precisa-se ganhar performance em códigos com milhares de linhas
// de instruções ou mais.

package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex6 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);
        // paralellStream é usado com estruturas em Lista
        list.parallelStream();

        // paralell é usado com outros tipos de estruturas
        IntStream.range(0,10).parallel().forEach(System.out::println);

        System.out.println("------------------");

        // Ordem aleatória
        list.parallelStream().forEach(System.out::println);

        System.out.println("------------------");

        // Mesma ordem da criação
        list.parallelStream().forEachOrdered(System.out::println);

        System.out.println("------------------");

        // findAny. No paralellStream, pelo fato de nessa Lista este método executar várias threads de acordo com
        // a quantidade de elementos da Lista, a saída sempre mostrará um elemento diferente (o primeiro a ser lido).
        // Sem o uso deste método, será apenas 1 thread por Lista, mostrando sempre um mesmo elemento.
        list.parallelStream().findAny().ifPresent(System.out::println);

        System.out.println("------------------");

        // unordered. Para garantir a máxima performance, recomenda-se o uso desse método na utilização dos métodos
        // skip e limit
        list.parallelStream().unordered().skip(1).limit(2).forEach(System.out::println);

        System.out.println("------------------");

        // collect. Recomenda-se o uso de toConcurrentMap e groupingByConcurrent para permitir várias thread executando
        // alterações num mesmo Map. Esses métodos em códigos sequenciais simples não são recomendados devido à performance
        Map<Integer,Boolean> collect = list.parallelStream().collect(Collectors.toConcurrentMap(n -> n, n -> n % 2 == 0));
        System.out.println(collect);

        Map<Boolean,List<Integer>> collect2 = list.parallelStream().collect(Collectors.groupingByConcurrent(n -> n % 2 == 0));
        System.out.println("\n" + collect2);

    }
}