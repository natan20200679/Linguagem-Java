/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {

        //Abertura da entrada de fluxo de dados através do teclado
        Scanner scan = new Scanner(System.in);

        //variáveis
        //guarda o maior número
        double maior = 0;

        //guarda a soma
        double soma = 0;

        //guarda a média
        double media;

        //controla o loop
        int count = 0;

        //loop
        do {
            //Peça um número
            System.out.println("Número: ");

            //Entrada de dados, neste caso de um Double.
            double numero = scan.nextDouble();

            //Caso o valor que o usuário digitou seja maior que o valor armazanado na variável maior.
            if (numero > maior) {

                //atribua o valor deste número a variável maior.
                maior = numero;
            }

            //some o número informado pelo usuário com variável soma (independente do valor)
            soma = soma + numero;

            //some o valor 1 ao contador, até que invalide a condição do loop. (count < 5)
            count = count + 1;

            //enquanto o contador tiver o valor menor que 5
        } while (count < 5);

        //faça o cálculo da média. (soma/quantidade)
        media = soma / 5;

        //imprimindo o maior número digtados e a média dos mesmos
        System.out.println("Maior: " + maior + " - Média: " + media);
    }
}