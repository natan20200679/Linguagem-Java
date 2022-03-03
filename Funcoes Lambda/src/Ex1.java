// Exemplos das aulas de Rinaldo Júnior (Youtube), com pequenas modificações.
// Nota: O interpretador do java implementa essas Funções por reconhecer que as Interfaces usadas são do tipo Single
// Abstract Method. Essas Funções foram criadas para uso em Streams API (programação funcional), simplificando os
// códigos, evitando por exemplo uso de classes anônimas

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.IntStream;

public class Ex1 {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Olá mundo!");
            }
        }).run();

        System.out.println("----------");

        // Transformação das linhas 6 à 11 em Função Lambda
        new Thread(() -> System.out.println("Olá mundo!")).run();

        System.out.println("-----------------");

        JButton jButton = new JButton();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent elemento) {
                System.out.println("Olá mundo!");
            }
        });

        System.out.println("----------");

        // Transformação das linhas 21 à 28 em Função Lambda
        JButton jButton2 = new JButton();
        jButton2.addActionListener(elemento -> System.out.println("Olá mundo"));

        System.out.println("----------");

        // Dentro de uma Função Lambda, a declaração do argumento deve ser sempre entre () quando não há argumento, se
        // incluir o tipo de dado do argumento, ou se mais de um argumento for declarado (neste caso, cada argumento
        // precisa ter seu tipo de dado declarado)
        IntStream.range(0, 10).filter((int n) -> n % 2 == 0).reduce((n1,n2) -> n1 + n2).ifPresent(System.out::println);

        System.out.println("----------");

        Runnable runnable = () -> System.out.println("Se inscreva no canal!");

        System.out.println("----------");

        // Dentro de uma Função Lambda, caso se opte pelo uso de chaves, precisa-se ter uma instrução com return e cada
        // instrução um ; no seu final
        IntStream.range(0,10).filter(n -> {
            System.out.println("Se inscreva no canal");
            return n % 2 == 0;
        }).forEach(n -> System.out.println(n));
    }
}