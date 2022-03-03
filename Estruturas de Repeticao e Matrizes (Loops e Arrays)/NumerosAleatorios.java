/*
Faça um Programa que leia 20 números inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        //classe para gerar números aleatórios
        Random random = new Random();

        //array com 20 posições
        int[] numeros = new int[20];

        //para: variável i = numero, até i menor que o tamanho do array, acrescentamos 1 ao valor de i a cada loop.
        for (int i = 0; i < numeros.length; i++) {

            //pegando um número aleatório entre 0 e 100.
            int numero = random.nextInt(100);

            //atribuindo esse valor ao elemento na respectiva posição do array numeros.
            numeros[i] = numero;
        }

        //frase ilustrativa
        System.out.print("Numeros: ");

        //loop for-each
        //para cada numero dentro do array de números
        for (int numero : numeros) {

            //imprima o número
            System.out.print(numero + " ");
        }

        //separar os vetores
        System.out.println("\n-----------------");

        //frase ilustrativa
        System.out.print("Sucessores: ");

        //para cada numero dentro do array de números
        for (int numero : numeros) {

            //adicione o valor 1 ao número e imprima esse novo valor
            System.out.print((numero + 1) + " ");
        }
    }
}