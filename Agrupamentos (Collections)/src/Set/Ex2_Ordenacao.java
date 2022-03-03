// Este exemplo envolve Funções Lambda

package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex2_Ordenacao {
    public static void main(String[] args) {

        System.out.println("\n-- Ordem aleatória --");
        Set<Serie> minhasSeriesOrdemAleatoria = new HashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        minhasSeriesOrdemAleatoria.forEach(serie -> System.out.println(serie));

        System.out.println("\n-- Ordem Inserção --");
        Set<Serie> minhasSeriesOrdemInsercao = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        minhasSeriesOrdemInsercao.forEach(serie -> System.out.println(serie));

        System.out.println("\n-- Ordem Nome --");
        Set<Serie> minhasSeriesOrdemNome = minhasSeriesOrdemAleatoria;
        minhasSeriesOrdemNome
                .stream()
                .sorted(Comparator.comparing(Serie::getNome))
                .collect(Collectors.toList())
                .forEach(serie -> System.out.println(serie));

        System.out.println("\n-- Ordem Gênero --");
        Set<Serie> minhasSeriesGenero = minhasSeriesOrdemAleatoria;
        minhasSeriesGenero
                .stream()
                .sorted(Comparator.comparing(Serie::getGenero))
                .collect(Collectors.toList())
                .forEach(serie -> System.out.println(serie));

        System.out.println("\n-- Ordem Tempo de Episódio --");
        Set<Serie> minhasSeriesEpisodio = minhasSeriesOrdemAleatoria;
        minhasSeriesEpisodio
                .stream()
                .sorted(Comparator.comparing(Serie::getTempoEpisodio))
                .collect(Collectors.toList())
                .forEach(serie -> System.out.println(serie));
    }
}