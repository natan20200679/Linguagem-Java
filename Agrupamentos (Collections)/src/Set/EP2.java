/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

package Set;

import java.util.*;

public class EP2 {
    public static void main(String[] args) {

        System.out.println("\n-- Ordem de Inserção --");
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Java", 1991, "InelliJ"));
            add(new LinguagemFavorita("Javascript", 1995, "VSCode"));
            add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        }};
        for (LinguagemFavorita linguagem : linguagens) {
            System.out.println(linguagem);
        }

        System.out.println("\n-- Ordem Natural(nome) --");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        for (LinguagemFavorita linguagem : linguagens2) {
            System.out.println(linguagem);
        }

        System.out.println("\n-- Ordem por IDE --");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorIDE());
        linguagens3.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens3) {
            System.out.println(linguagem);
        }

        System.out.println("\n-- Ordem por Ano de Criação e Nome --");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorAnoCriacaoNome());
        linguagens4.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens4) {
            System.out.println(linguagem);
        }

        System.out.println("\n-- Ordem por Nome, Ano de Criação e IDE --");
        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorNomeAnoCriacaoIDE());
        linguagens5.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens5) {
            System.out.println(linguagem);
        }
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {

    public String nome;
    public Integer anoDeCriacao;
    public String IDE;

    public LinguagemFavorita (String nome, Integer anoDeCriacao, String IDE) {

        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao='" + anoDeCriacao + '\'' +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {

        return lf1.IDE.compareToIgnoreCase(lf2.IDE);
    }
}
class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {

        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);

        if (anoDeCriacao != 0)
            return anoDeCriacao;

        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}
class ComparatorNomeAnoCriacaoIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {

        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);

        if (nome != 0)
            return nome;

        if (anoDeCriacao != 0)
            return anoDeCriacao;

        return lf1.IDE.compareToIgnoreCase(lf2.IDE);
    }
}