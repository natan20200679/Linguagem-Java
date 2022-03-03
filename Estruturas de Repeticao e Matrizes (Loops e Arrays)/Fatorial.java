/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        //Abertura da entrada de fluxo de dados através do teclado
        Scanner scan = new Scanner(System.in);

        //Peça um número
        System.out.println("Número: ");

        //Entrada de dados, neste caso de um int.
        int numero = scan.nextInt();

        //variável para guardar o valor da multiplicação dos valores.
        int multiplicacao = 1;

        //frase ilustrativo para indicar o fatorial
        System.out.print(numero + "!=");

        //para: variável i = numero, até i maior que 0, diminuimos 1 ao valor de i a cada loop.
        for(int i = numero; i > 0; i--) {

            //multiplicamos os valores de i e armazenamos na variável multiplicação
            multiplicacao *= i;

            //criamos esta estrutura condicional para imprimir o resultado conforme foi solicitado no exercício.
            //se o i tiver o valor diferente de 1
            if (i != 1) {

                //imprima o valor do i seguido de "."
                System.out.print(i + ".");

                //se não (se o i tiver o valor igual a 1)
            } else {

                //imprima o valor do i seguido do sinal "=" e o resultado da multiplicação
                System.out.print(i + "=" + (multiplicacao));
            }
        }
    }
}