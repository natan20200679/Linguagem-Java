package aulas.oo.part01.paradigma.exemplo001;

public class ExemploMetodos {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        // Olá, meu nome é Marco
        System.out.println(pessoa.falarMeuProprioNome());
        System.out.println(pessoa.andar());
    }
}