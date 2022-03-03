package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ex {
    public static void main(String[] args) {

        System.out.println("\n-- Adicione os nomes Juliana, Pedro, Carlos, Larissa e João --");

        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larissa");
        filaBanco.add("João");
        System.out.println(filaBanco);

        System.out.println("\n-- Navegue na fila exibindo cada nome no console --");

        Iterator<String> iterator = filaBanco.iterator();

        for (String nome:filaBanco) {
            System.out.println("-->" + nome);
        }

        System.out.println("\n-- Retorne o primeiro ítem da fila, sem removê-lo --");

        System.out.println(filaBanco);
        System.out.println(filaBanco.peek());

        // Outra opção
        //System.out.println(filaBanco.element());

        System.out.println("\n-- Retorne o primeiro ítem da fila, removendo-o --");

        System.out.println(filaBanco);
        System.out.println(filaBanco.poll());
        System.out.println(filaBanco);

        System.out.println("\n-- Adicione o nome Daniel, e verifique a posição que este assumiu na fila --");

        System.out.println(filaBanco);
        filaBanco.add("Daniel");
        System.out.println(filaBanco);

        System.out.println("\n-- Retorne o tamanho da lista --");

        System.out.println(filaBanco.size());

        System.out.println("\n-- Verifique se a lista está vazia --");

        System.out.println(filaBanco.isEmpty());

        System.out.println("\n-- Verifique se o nome Carlos está na lista --");

        System.out.println(filaBanco.contains("Carlos"));
    }
}