package Set;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra; (R)
b) A quantidade de cores que o arco-íris tem; (R)
c) Exiba as cores em ordem alfabética; (R)
d) Exiba as cores na ordem inversa da que foi informada; (R)
e) Exiba todas as cores que começam com a letra ”v”; (R)
f) Remova todas as cores que não começam com a letra “v”; (R)
g) Limpe o conjunto; (R)
h) Confira se o conjunto está vazio; (R)

vermelha, laranja, amarela, verde, azul, azul-escuro e violeta
*/

public class EP1 {
    public static void main(String[] args) {

        System.out.println("\n-- Exiba todas as cores o arco-íris uma abaixo da outra --");
        Set<String> cores = new LinkedHashSet<>();
        cores.add("vermelha");
        cores.add("laranja");
        cores.add("amarela");
        cores.add("verde");
        cores.add("azul");
        cores.add("anil");
        cores.add("violeta");
        for (String cor:cores) {
            System.out.println(cor);
        }

        System.out.println("\n-- Quantidade de cores do arco-íris --");
        System.out.println(cores.size());

        System.out.println("\n-- Exiba as cores em ordem alfabética --");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);

        System.out.println("\n-- Exiba as cores na ordem inversa da que foi informada --");
        Set<String> cores3 = new LinkedHashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul",
                "azul-escuro", "violeta"));
        List<String> cores3I = new ArrayList<>(cores3);
        Collections.reverse(cores3I);
        System.out.println(cores3I);

        System.out.println("\n-- Exiba todas as cores que começam com a letra ”v” --");
        // Método para exibir em coluna
//        for (String cor2:cores2) {
//            if (cor2.startsWith("v"))
//                System.out.println(cor2);
//        }

        // Método para exibir em linha
        Iterator<String> i = cores2.iterator();
        while (i.hasNext()) {
            if (!i.next().startsWith("v"))
                i.remove();
        }
        System.out.println(cores2);

        System.out.println("\n-- Remova todas as cores que não começam com a letra “v” --");
        Iterator<String> i2 = cores2.iterator();
        while (i2.hasNext()) {
            if (!i2.next().startsWith("v"))
                i2.remove();
        }
        // Método que envolve Parâmetro com Predicate, Interface Functional e Implementação Stream API
//        cores.removeIf(cor -> (!cor.startsWith("v")));
        System.out.println(cores2);

        System.out.println("\n-- Limpe o conjunto e confira se o conjunto está vazio --");
        cores.clear();
        System.out.println(cores.isEmpty());

    }
}