/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {

        //inicializando um vetor com 5 elementos.
        int[] vetor = {5, 8, 9, 6, 11, -1};

        //o contador deverá ser um número menor que o tamanho do vetor.
        int count = (vetor.length - 1);

        //Frase ilustrativa
        System.out.print("Vetor Inverso: ");

        //loop
        //enquanto o contador tiver o valor maior ou igual 0
        while (count >= 0) {

            //imprima o valor do elemento do vetor na posição indicada pelo contador.
            System.out.print(vetor[count] + " ");

            //diminua o valor 1 do contador a cada loop
            count--;
        }

        //separar os vetores
        System.out.println("\n--------------");

        //Frase ilustrativa
        System.out.print("Vetor: ");

        //loop for-each
        //para cada elemento dentro do vetor
        for (int elemento : vetor) {

            //imprima o elemento
            System.out.print(elemento + " ");
        }
    }
}