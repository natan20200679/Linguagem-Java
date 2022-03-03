/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        //Abertura da entrada de fluxo de dados através do teclado
        Scanner scan = new Scanner(System.in);

        //Peça uma nota de 0 a 10
        System.out.println("Nota de 0 a 10: ");

        //Entrada de dados, neste caso de um int
        int nota = scan.nextInt();

        //Enquanto o valor da nota for menor que 0 ou maior que 10.
        while(nota < 0 | nota > 10) {

            //Mensagem que o valor é inválido
            System.out.println("Nota Inválida!");

            //Peça novamente a nota
            System.out.println("Tente novamente. Nota: ");

            //Entrada de dados, neste caso de um int
            nota = scan.nextInt();
        }

        //imprimindo a nota válida
        System.out.println("Nota: " + nota);
    }
}