/*
Crie um optional de um determinado tipo de dado (R)
Crie com estado vazio, estado presente, e com null (R)
Se presente, exiba o valor no console. Se vazio, exiba 'Optional vazio' no console (R)
Se vazio, lance uma exceção IlegalStateException (R)
Se presente, transforme o valor e exiba no console (R)
Se presente, pegue o valor do optional e atribua em uma variável (R)
Se presente, filtre o optional com uma determinada regra de negócio
*/

import java.util.Optional;

public class Exemplo {
    public static void main(String[] args) {

        Optional<Integer> estadoExcecao = Optional.of(1);
        estadoExcecao.ifPresentOrElse(System.out::println,() -> System.out.println("Optional vazio"));

        if (estadoExcecao.isPresent()) {
            Integer valor = estadoExcecao.get();
            System.out.println("a. " + estadoExcecao);
        }

        estadoExcecao.orElseThrow(IllegalStateException::new);

        Optional<Integer> estadoNull = Optional.ofNullable(null);
        estadoNull.ifPresentOrElse(System.out::println,()-> System.out.println("null"));
        System.out.println("b. " + estadoNull);

        Optional<Integer> estadoEmpty = Optional.empty();
        estadoEmpty.ifPresentOrElse(System.out::println,()-> System.out.println("empty = 0"));
        System.out.println("c. " + estadoEmpty);

        Optional<Integer> estadoNullErro = Optional.of(null);
        estadoNullErro.ifPresentOrElse(System.out::println,()-> System.out.println("erro = Estado 0"));
        System.out.println("d. " + estadoNullErro);

    }
}