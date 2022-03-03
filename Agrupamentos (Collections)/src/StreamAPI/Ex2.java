// Collect, Reduce e For Each: Exemplos das aulas de Rinaldo Júnior (Youtube), com pequenas modificações.

package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println("\nMúltiplos de 3:");
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream().filter(e -> e % 3 == 0).forEach(e -> System.out.println(e));

        System.out.println("\nPulo dos 2 Primeiros Números:");
        List<Integer> list2 = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
        list2.stream().skip(2).forEach(e -> System.out.println(e));

        System.out.println("\nMostrando Apenas os 2 Primeiros Números:");
        list2.stream().limit(2).forEach(e -> System.out.println(e));

        System.out.println("\nMostrando Apenas Valores Nao Repetidos:");
        list2.stream().distinct().forEach(e -> System.out.println(e));

        System.out.println("\nMostrando Apenas Valores Não Repetidos e Pares:");
        list2.stream().filter(e -> e % 2 == 0).distinct().forEach(e -> System.out.println(e));

        System.out.println("\nQuantidade de Valores Pares:");
        long count = list2.stream().filter(e -> e % 2 == 0).count();
        System.out.println(count);

        System.out.println("\nMenor Valor da Lista:");
        // Uso do Optional para evitar comparações com Null, já que será utilizado um método que requisita
        // Comparator
        Optional<Integer> min = list2.stream().min(Comparator.naturalOrder());
        System.out.println(min.get());

        System.out.println("\nTriplo dos Elementos Pares e Armazenamento numa Nova Lista:");
        List<Integer> list3 = list2.stream().filter(e -> e % 2 == 0).map(e -> e * 3).collect(Collectors.toList());
        System.out.println(list3);

        System.out.println("\nGrupo de Números Pares e o de Ímpares de Forma Separada:");
        // Nesta implementação, o tipo booleano define o grupo dos pares como true, e o dos ímpares como false. Isto
        // poderia ser invertido.
        Map<Boolean,List<Integer>> mapa = list2.stream().map(e -> e * 3).collect(Collectors.groupingBy(e -> e % 2 == 0));
        System.out.println(mapa);

        System.out.println("\nAgrupamento dos Números pelo Resto da Divisão por 3:");
        Map<Integer,List<Integer>> mapa2 = list2.stream().collect(Collectors.groupingBy(e -> e % 3));
        System.out.println(mapa2);

        System.out.println("\nAjuntamento dos Valores da Lista com Qualquer Separador:");
        // Joining só possui aplicação com Strings. O separador escolhido aqui foi ";"
        String collect = list2.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(";"));
        System.out.println(collect);

        System.out.println("\nTransformação de Vários Elementos em Um:");
        System.out.println("Exemplo com Soma:");
        List<Integer> list4 = Arrays.asList(1,2,3,4,5,6);
        // Nota: A Subtração, por não ser associativa, deve ser evitada, pois no uso do ParalellStream gerará erros no
        // resultado final. O método reduce é usado em objetos imutáveis
        Optional<Integer> reduce = list4.stream().reduce((n1,n2) -> n1 + n2);
        System.out.println(reduce.get());

        System.out.println("\nExemplo com Concatenção e Strings:");
        String s = "Inscreva-se no canal e compartilhe este vídeo!";
        // Eliminação dos Espaços
        String[] split = s.split(" ");
        List<String> listStr = Arrays.asList(split);
        Optional<String> concatenacao = listStr.stream().reduce(((s1, s2) -> s1.concat(s2)));
        System.out.println(concatenacao.get());

        System.out.println("\nExemplo com Soma (Valor de Identidade Matemática):");
        List<Integer> listVazia = Arrays.asList();
        Integer soma = listVazia.stream().reduce(0,(n1,n2) -> n1 + n2);
        System.out.println(soma);

        System.out.println("\nExemplo com Multiplicação (Valor de Identidade Matemática):");
        Integer mult = listVazia.stream().reduce(1,(n1,n2) -> n1 * n2);
        System.out.println(mult);

        System.out.println("\nExemplo com Menor Valor:");
        Double reduce2 = DoubleStream.of(1.5,2.9,6.7).reduce(Double.POSITIVE_INFINITY,(d1,d2) -> Math.min(d1,d2));
        System.out.println(reduce2);

        System.out.println("\nExemplo com Acumulação e Combinação:");
        String reduce3 = list4.stream().reduce("",(n1,n2) -> n1.concat(n2.toString()),
                (n1,n2) -> n1.concat(n2));
        System.out.println(reduce3);

        System.out.println("\nExemplos com Acumulação e Combinação (Collect):");
        Set<String> collect2 = list4.stream().collect(
                () -> new HashSet<>(),
                (l,e) -> l.add(e.toString()),
                (l1,l2) -> l1.addAll(l2));
        System.out.println(collect2);

        // Outro método (Collectors)
        // Obs.: toList() relacionado à List
        List<Integer> collect3 = list4.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(collect3);

        String join = list4.stream().map(n -> n.toString()).collect(Collectors.joining());
        System.out.println(join);

        // Exemplo com Valor Médio
        Double media = list4.stream().collect(Collectors.averagingInt(n -> n.intValue()));
        System.out.println(media);

        // Exemplo com Classe IntSummaryStatistics
        IntSummaryStatistics stats = list4.stream().collect(Collectors.summarizingInt(n -> n.intValue()));
        System.out.println("IntSummaryStatistics: ");
        // Apresentação na saída de cada valor estatístico
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());

        // Exemplo com Max
        list4.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).ifPresent(System.out::println);

        // Exemplo com groupingBy
        Map<Integer,List<Integer>> collect4 = list4.stream().collect(Collectors.groupingBy((n) -> n % 3));
        System.out.println(collect4);

        // Exemplo com partitioningBy
        Map<Boolean,List<Integer>> collect5 = list4.stream().collect(Collectors.partitioningBy((n) -> n % 3 == 0));
        System.out.println(collect5);

        // Exemplo com toMap
        Map<Integer,Double> collect6 = list4.stream().collect(Collectors.toMap(n -> n, n -> Math.pow(n.intValue(),5)));
        System.out.println(collect6);
    }
}