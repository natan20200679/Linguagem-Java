// Interface Funcionais: Exemplos das aulas de Rinaldo Júnior (Youtube), com pequenas modificações.

package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {

        // Exemplo de Supplier (apenas fornece valores)
        Stream.generate(() -> new Random().nextInt())
                .limit(3)
                // Exemplo de Consumer (apenas recebe valores)
                .forEach((e -> System.out.println(e)));

        System.out.println("----------------");

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream()
                // Exemplo de predicate (recebe valores e retorna booleano)
                .filter(e -> e % 3 == 0)
                // Exemplo de function (recebe e retorna um valor)
                .map(e -> e.doubleValue())
                // Exemplo de Binary Operator (recebe dois valores e retorna um valor do mesmo tipo)
                .reduce((e1,e2) -> e1 + e2)
                .ifPresent(System.out::println);
    }
}
