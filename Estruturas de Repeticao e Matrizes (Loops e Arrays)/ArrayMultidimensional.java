/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).
*/

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {

        //classe para gerar números aleatórios
        Random random = new Random();

        //declaração de uma matriz multidimensional
        int[][] M = new int[4][4];

        //variáveis
        //variável que guarda o menor valor
        int menor = Integer.MIN_VALUE;

        //posição inicial da linha e da coluna
        int linha = 0, coluna = 0;

        //para: variável i = 0, até i menor que o tamanho da matriz (array multidimencional), acrescentamos
        // 1 ao valor de i a cada loop.
        //navegando na matriz
        for (int i = 0; i < M.length; i++) {

            //para: variável j = 0, até i menor que o tamanho da linha, acrescentamos 1 ao valor de i a cada loop.
            //navegando na linha (array unidimensional)
            for (int j = 0; j < M[i].length; j++) {

                //atribuindo um número aleatóriamente a posição do elemento
                M[i][j] = random.nextInt(9);

                //se o elemento em uma determinada posição (linha e coluna) é menor que o menor número
                if (M[i][j] < menor) {

                    //o valor da variável menor passa a ser o valor aleatório
                    menor = M[i][j];

                    //que está na linha representada pela variável i
                    linha = i;

                    //que esta na coluna representada pela variável j
                    coluna = j;
                }
            }
        }

        //menor valor
        System.out.println("Menor: " + menor);

        //linha que se encontra o menor valor
        System.out.println("Linha: " + linha);

        //coluna que se encontra o menor valor
        System.out.println("Coluna: " + coluna);

        //Mensagem ilustrativa
        System.out.println("\nMatriz");

        //para cada linha da matriz M
        for (int[] linhaM: M) {

            //pegue a coluna desta linhaM
            for (int colunaM : linhaM) {

                //imprima esta coluna
                System.out.print(colunaM + " ");
            }

            //pular uma linha
            System.out.println();
        }
    }
}