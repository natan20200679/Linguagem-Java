// Métodos de Referência: Exemplos das aulas de Rinaldo Júnior (Youtube), com pequenas modificações. Nota: Podem ser
// convertidos em Funções Lambda e vice-versa

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        // Métodos Estáticos
        list.stream().map(n -> multipliquePorDois(n)).forEach(n -> System.out.println(n));
        System.out.println("----------");
        list.stream().map(Ex2::multipliquePorDois).forEach(System.out::println);
        System.out.println("----------");

        // Construtores
        list.stream().map(n -> new BigDecimal(n)).forEach(n -> System.out.println(n));
        list.stream().map(BigDecimal::new).forEach(System.out::println);
        System.out.println("----------");

        // Várias Instâncias
        list.stream().map(n -> n.doubleValue()).forEach(n -> System.out.println(n));
        list.stream().map(Integer::doubleValue).forEach(System.out::println);
        System.out.println("----------");

        // ùnica instãncia
        BigDecimal dois = new BigDecimal(2);
        list.stream().map(n -> new BigDecimal(n)).map(b -> dois.multiply(b)).forEach(n -> System.out.println(n));
        list.stream().map(BigDecimal::new).map(dois::multiply).forEach(System.out::println);

    }
    private static Integer multipliquePorDois(Integer i) {

        return i * 2;
    }
}