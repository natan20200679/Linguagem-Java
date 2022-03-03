import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/

public class NomeEIdade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //variáveis
        //armazena o nome
        String nome;

        //armazena a idade
        int idade;

        //Enquando o loop for verdadeiro
        while(true) {

            //Peça o nome
            System.out.println("Nome: ");

            //armazene esse nome na variável
            nome = scan.next();

            //caso o nome igual a "0"
            if (nome.equals("0")) {

                //interrompa o programa
                break;
            }

            //Peça a idade
            System.out.println("Idade: ");

            //armazene a idade na variável
            idade = scan.nextInt();

            //imprima o nome e a idade
            System.out.println("Nome: " + nome + " - idade: " + idade);
        }
    }
}