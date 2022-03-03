package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println("\n-- Adicione 5 números inteiros: 3,88,20,44,3 --");
        Set<Integer> numeros = new HashSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);
        System.out.println(numeros);

        System.out.println("\n-- Navegue no Set exibindo cada número no console --");
        Iterator<Integer> iterator = numeros.iterator();
        for (Integer numero:numeros) {
            System.out.println(numero);
        }

        System.out.println("\n-- Remova o primeiro ítem do Set --");
        System.out.println(numeros);
        numeros.remove(3);
        System.out.println(numeros);

        System.out.println("\n-- Adicione um novo número no Set: 23 --");
        System.out.println(numeros);
        numeros.add(23);
        System.out.println(numeros);

        System.out.println("\n-- Verifique o tamanho do Set --");
        System.out.println(numeros.size());

        System.out.println("\n-- Verifique se o Set está vazio --");
        System.out.println(numeros.isEmpty());
    }
}