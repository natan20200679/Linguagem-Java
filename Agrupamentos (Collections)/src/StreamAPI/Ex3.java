// Debug: Exemplos das aulas de Rinaldo Júnior (Youtube), com pequenas modificações.

package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,5,8,9);
        list.stream().map((n) -> new StringBuilder().append(n).append("s").append("a")).forEach(System.out::println);

        System.out.println("----------");

        // Transformando a Funçao Lambda em Blocos para permitir compreensao detalhada do seu comportamento
        list.stream()
                // peek permite melhor acompanhamento dos resultados do debug
                .peek(n -> System.out.println(n + "Ímpares"))
                .filter(n -> n % 3 == 0)
                .map((n) -> {
                    StringBuilder builder = new StringBuilder();
                    builder.append(n);
                    builder.append("s");
                    builder.append("a");
                    return builder;
        })
                .forEach(System.out::println);

    }
}
