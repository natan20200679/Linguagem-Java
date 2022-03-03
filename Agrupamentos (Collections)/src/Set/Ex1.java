package Set;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {

        System.out.println("\nCrie um conjunto e adicione as notas:");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        // "toString()" opcional
        System.out.println(notas.toString());

        // A solicitação referente à esta saída não poderá ser impressa porque Hashset não possui métodos com índices
        System.out.println("\nExiba a posição da nota 5.0:");

        // A solicitação referente à esta saída não poderá ser impressa porque Hashset não possui métodos com índices
        // ("posição 4")
        System.out.println("\nAdicione na lista a nota 8.0 na posição 4:");

        // A solicitação referente à esta saída não poderá ser impressa porque Hashset não possui métodos com índices
        // (uso do Get para acesso ao elemento)
        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0:");

        System.out.println("\nConfira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        // A solicitação referente à esta saída não poderá ser impressa porque Hashset não possui métodos com índices
        System.out.println("\nExiba a terceira nota adicionada:");

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        // Uso da Interface Iterator para exibir soma dos elementos
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("\nExiba a soma dos valores: " + soma);

        System.out.println("\nExiba a média das notas: " + (soma/ notas.size()));

        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        // A solicitação referente à esta saída não poderá ser impressa porque Hashset não possui métodos com índices
        System.out.println("\nRemova a nota da posição 0:");

        System.out.println("\nRemova as notas menores que 7 e exiba a lista:");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("\nExiba todas as notas na ordem em que foram informados:");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("\nExiba todas as notas na ordem crescente:");
        // Deseja-se inserir elementos em ordem natural, pelo tipo de elemento
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("\nApague todo o conjunto:");
        notas.clear();

        System.out.println("\nConfira se o conjunto está vazio: " + notas.isEmpty());

        System.out.println("\nConfira se o conjunto 2 está vazio: " + notas2.isEmpty());

        System.out.println("\nConfira se o conjunto 3 está vazio: " + notas3.isEmpty());

    }
}