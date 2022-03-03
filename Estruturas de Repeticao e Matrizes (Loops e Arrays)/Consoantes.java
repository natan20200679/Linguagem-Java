/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {

        //Abertura da entrada de fluxo de dados através do teclado
        Scanner scan = new Scanner(System.in);

        //iniciando um arrays vazio com 6 posições
        String[] consoantes = new String[6];

        //controla o loop
        int count = 0;
        int quantidadeDeConsoantes = 0;

        //loop
        do {
            //Peça uma letra
            System.out.print("Letra: ");

            //capture essa letra e atrubua a variável letra.
            String letra = scan.next();

            //se a letra informada não seja igual a a, e, i, o ou u
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {

                //atribua a letra ao elemento do vetor na posição indicada pelo contador, caso seja consoante.
                consoantes[count] = letra;
                quantidadeDeConsoantes++;
            }

            //acrescente o valor 1 ao contador a cada loop
            count++;

            //enquanto o contador tiver o valor menor que o tamanho do array
        } while (count < consoantes.length);

        //frase ilustrativa
        System.out.print("Consoantes: ");

        //para cada consoante dentro do array consoantes
        for (String consoante : consoantes) {

            //se o valor da consoante for diferente de null
            if (consoante != null)

                //imprima a consoante
                System.out.print(consoante + " ");
        }

        System.out.println("Quantidade de consoantes: " + quantidadeDeConsoantes);
    }
}