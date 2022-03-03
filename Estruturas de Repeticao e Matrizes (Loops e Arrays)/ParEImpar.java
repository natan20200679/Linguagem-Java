/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {

        //Abertura da entrada de fluxo de dados através do teclado
        Scanner scan = new Scanner(System.in);

        //Peça um número
        System.out.println("Quantidade de números: ");

        //Entrada de dados, neste caso de um int.
        int quantidadeDeNumeros = scan.nextInt();

        //variáveis para guardar a quantidade dos números pares e ímpares
        int quantPar = 0, quantImpar = 0;

        //controla o loop
        int count = 0;

        //loop
        //primeiro, independente do que tem no while, faça:
        do {

            //Peça um número
            System.out.println("Número: ");

            //Entrada de dados, neste caso de um int.
            int numero = scan.nextInt();

            //se o resto da divisão do número por 2 (numero/2) for 0,
            //acrescente o valor 1 a variável quantPar.
            if (numero % 2 == 0) quantPar++;

                //caso contrário, o número digitado é ímpar
                //adicione o valor 1 a variável quantImpar.
            else quantImpar++;

            //some o valor 1 ao contador até que invalide a condição do loop. (count < quantidadeDeNumeros)
            count++;

            // Faça o loop caso o valor do contador seja menor que a quantidade de números
        } while (count < quantidadeDeNumeros);

        //imprimindo a quantidade de números pares digtados e números ímpares digitados
        System.out.println("Quantidade números pares: " + quantPar + " / Quantidade números ímpares: " + quantImpar);
    }
}