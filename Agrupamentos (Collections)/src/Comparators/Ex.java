/*
Crie uma lista de um objeto complexo e execute as operações abaixo:
- Adicione elementos nesta lista (R)
- Ordende implementando a interface java.Util.Comparator no seu objeto complexo (R)
- Ordende implementando um novo objeto com a interface java.Util.Comparable (R)
- Ordene usando uma expressão lambda na chamada de SuaLista.sort() (R)
- Ordene usando referências de métodos e os métodos estáticos de Comparator (R)
- Ordene coleçoes TreeSet e TreeMap
*/

package Comparators;
import java.util.*;

public class Ex {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Natan",40));
        estudantes.add(new Estudante("Chico",25));
        estudantes.add(new Estudante("Klailton",28));

        estudantes.sort((primeiro,segundo)->primeiro.getIdade()- segundo.getIdade());

        System.out.println("-- Ordem Natural Idade --\n" + estudantes);
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("-- Ordem Natural Idade (Referências de Métodos) --\n" + estudantes);

//        System.out.println("-- Ordem Natural dos Estudantes (TreeSet) --\n" + );
    }

    public static class Estudante implements Comparable<Estudante> {

        private final String nome;
        private final Integer idade;

        public Estudante(String nome, Integer idade) {

            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {

            return nome;
        }

        public Integer getIdade() {

            return idade;
        }

        @Override
        public String toString() {
            return "Estudante{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    '}';
        }

        @Override
        public int compareTo(Estudante estudante) {
            return this.getIdade() - estudante.getIdade();
        }
    }

    public class Estudante2 implements Comparator<Estudante> {

        @Override
        public int compare(Estudante e1, Estudante e2) {
            return e2.getIdade()- e1.getIdade();
        }
    }
}