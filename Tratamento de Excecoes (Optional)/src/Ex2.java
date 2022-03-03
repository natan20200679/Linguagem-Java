// Exemplos das aulas de Rinaldo Júnior (Youtube), com pequenas modificações. Nota: Optional não deve ser usado para
// receber argumento, e apenas para retorno de método

import java.util.Optional;

public class Ex2 {
    public static void main(String[] args) {

        String s = "Inscreva-se!";
        Optional<Integer> numero = converteEmNumero(s);
        System.out.println(numero);

        System.out.println("----------");

        // Mostra se conversão de s em número inteiro é sucesso, de acordo as declarações a partir da linha 15
        System.out.println(numero.isPresent());

        System.out.println("----------");

        // Se a conversão for sucesso, a saída será o valor pós-conversão, e caso não for sucesso, a saída será um erro de exceção
//        System.out.println(numero.get());

        System.out.println("----------");

        //Se a conversão for sucesso, a saída será o valor pós-conversão, e caso não for sucesso, a saída será vazia
        numero.ifPresent(e -> System.out.println(e));

        System.out.println("----------");

        // Se a conversão não for sucesso, a saída será a definida no orElse. Para aproveitar a mesma declaração da linha 8,
        // a declaração do Optional aqui gerará inconsistência. Então pode-se usar a declaração abaixo
        Integer numero2 = converteEmNumero(s).orElse(3);
        System.out.println(numero2);

        System.out.println("----------");

        // O mesmo que orElse, porém com Função Lambda
        Integer numero3 = converteEmNumero(s).orElseGet(() -> 3);
        System.out.println(numero3);

        System.out.println("----------");

        // O mesmo que orElse, porém lança exceção com Função Lambda
        Integer numero4 = converteEmNumero(s).orElseThrow(() -> new NullPointerException("Valor Vazio."));
        System.out.println(numero4);

    }
    public static Optional<Integer> converteEmNumero(String numeroStr) {

        try {
            Integer integer = Integer.valueOf(numeroStr);
            // integer pode ser substituído por null se of for substituído por ofNullable
            return Optional.of(integer);
        } catch (Exception e) {
//            return null;
            // Evitar retorno null
            return Optional.empty();
        }

    }
}