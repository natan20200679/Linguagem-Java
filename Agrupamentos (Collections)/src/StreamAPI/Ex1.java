package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {

        System.out.println("\n-- Imprima todos os elementos dessa lista de String --");

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        numerosAleatorios.stream().forEach(System.out::println);

        // Utilizando Método de Referência
        System.out.println("\n-- Pegue os 5 primeiros números e coloque dentro de um Set --");

        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("\n-- Transforme esta lista de String em uma lista de números inteiros --");

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(numerosAleatoriosInteger);

        System.out.println("\n-- Pegue os números pares e maiores que 2 e coloque em uma lista --");

        numerosAleatorios.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList())
                .forEach(System.out::println);
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("\n-- Mostre a média dos números --");

        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares: ");

        numerosAleatoriosInteger.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosAleatoriosInteger);
        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatoriosInteger);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");

        numerosAleatoriosInteger.stream().skip(2).forEach(System.out::println);

        System.out.print("\n-- Mostre o menor valor da lista --");

        numerosAleatoriosInteger.stream().mapToInt(Integer::intValue).min().ifPresent(System.out::println);

        System.out.print("\n-- Mostre o maior valor da lista --");

        numerosAleatoriosInteger.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);

        System.out.println("\n-- Pegue apenas os números ímpares e some --");

        int somaDosNumerosImPares = numerosAleatoriosInteger.stream().filter(i -> (i % 2 != 0)).mapToInt(Integer::intValue)
                .sum();
        System.out.println(somaDosNumerosImPares);

        System.out.println("\n-- Mostre a lista na ordem númerica --");

        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream().sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");

        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3Ou5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3Ou5);

//      Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
//      System.out.println(numerosAleatorios5Primeiros); // Método mais tradicional

    }
}