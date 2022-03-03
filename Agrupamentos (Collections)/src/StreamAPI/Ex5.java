// Elaborações de códigos variados: Exemplos das aulas de Rinaldo Júnior (Youtube), com pequenas modificações.

package StreamAPI;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex5 {
    public static void main(String[] args) throws IOException {

        System.out.println("\n-- Caracterizar uma Lista (Collection) como um Stream --");
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream().forEach(System.out::println);

        System.out.println("\n-- Caracterizar um Array como um Stream --");
        Integer[] intArray = new Integer[] {1,2,3,4};
        Arrays.stream(intArray).forEach(System.out::println);

        System.out.println("\n-- Caracterizar Dados Quaisquer como um Stream --");
        Stream.of("Se","inscreva","no","canal","!").forEach(System.out::println);

        System.out.println("\n-- Números Sequenciais --");
        IntStream.range(0,5).forEach(System.out::println);

        System.out.println("\n-- Iterações (Iterate) --");
        Stream.iterate(5,n -> n / 2).limit(5).forEach(System.out::println);

        System.out.println("\n--Leitura de Arquivos --");
        File file = new File("C:\\Users\\Natanael Medrado\\IdeaProjects\\Linguagem-Java\\README.md");
        FileReader in = new FileReader(file);
        try (BufferedReader br = new BufferedReader(in)) {
            br.lines().forEach(System.out::println);
        }

        System.out.println("\n--Acesso ao Conteúdo de um Diretório --");
        Path p = Paths.get("C:\\Users\\Natanael Medrado\\IdeaProjects\\Linguagem-Java");
        Files.list(p).forEach(System.out::println);

        System.out.println("\n-- Números Aleatórios --");
        new Random().ints().limit(10).forEach(System.out::println);

        System.out.println("\n-- Padronização (Pattern) (Quebra de Linha) --");
        String s = "Deixe um curtir no vídeo!";
        Pattern pa = Pattern.compile(" ");
        pa.splitAsStream(s).forEach(System.out::println);
    }
}