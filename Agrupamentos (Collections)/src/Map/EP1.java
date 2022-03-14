/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

package Map;

import java.text.NumberFormat;
import java.util.*;

public class EP1 {
    public static void main(String[] args) {
        System.out.println("\n-- Crie um dicionário que relacione os estados e suas respectivas populações --");
        Map<String,Integer> populacao = new HashMap<>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};
        System.out.println(populacao);

        System.out.println("\n-- Substitua a população do estado RN por 3.534.165 --");
        populacao.replace("RN",3534265,3534165);
        System.out.println(populacao);

        System.out.println("\n-- Confira se no estado da Paraíba (PB) com população 4.039.277 está no dicionário," +
                " caso não, adicione --");
        System.out.println(populacao.containsKey("PB"));
        populacao.put("PB",4039277);
        System.out.println(populacao);

        System.out.println("\n-- Exiba a população do estado PE --");
        System.out.println(populacao.get("PE"));

        System.out.println("\n-- Exiba todos os estados e suas populações na ordem em que foram informados --");
        Map<String,Integer> populacao2 = new LinkedHashMap<>() {{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};
        System.out.println(populacao2);

        System.out.println("\n-- Exiba todos os estados e suas populações na ordem alfabética --");
        Map<String,Integer> populacao3 = new TreeMap<>(populacao);
        System.out.println(populacao3);

        System.out.println("\n-- Exiba o estado com a menor população e seu respectivo valor --");
        Collection<Integer> menorPopulacao = populacao.values();
        Integer menor = Collections.min(populacao.values());
        Set<Map.Entry<String,Integer>> entries = populacao.entrySet();
        String estado = "";

        for (Map.Entry<String,Integer> entry:entries) {
            if (entry.getValue().equals(menor)) {
                estado = entry.getKey();
                System.out.println("Estado com Menor População: " + estado + " - " + menor);
            }
        }

        System.out.println("\n-- Exiba o estado com a maior população e seu respectivo valor --");
        Collection<Integer> maiorPopulacao = populacao.values();
        Integer maior = Collections.max(populacao.values());
        Set<Map.Entry<String,Integer>> entries1 = populacao.entrySet();
        String estado2 = "";

        for (Map.Entry<String,Integer> entry:entries1) {
            if (entry.getValue().equals(menor)) {
                estado2 = entry.getKey();
                System.out.println("Estado Maior População: " + estado2 + " - " + menor);
            }
        }

        System.out.println("\n-- Exiba a soma da população desses estados --");
        Iterator<Integer> iterator = populacao.values().iterator();
        Integer soma = 0;

        while (iterator.hasNext()) {
            soma += iterator.next();
        }

        Locale localeBR = new Locale("pt","BR");
        Integer valorReal = soma;
        NumberFormat inteiro = NumberFormat.getInstance(localeBR);
        System.out.println(inteiro.format(valorReal));

        System.out.println("\n-- Exiba a média da população deste dicionário de estados --");
        Locale localeBR2 = new Locale("pt","BR");
        Integer valorReal2 = (soma / populacao.size());
        NumberFormat inteiro2 = NumberFormat.getInstance(localeBR2);
        System.out.println(inteiro2.format(valorReal2));

        System.out.println("\n-- Apague o dicionario de estados com suas respectivas populações estimadas --");
        populacao.clear();
        System.out.println("\n-- Confira se a lista está vazia --");
        System.out.println(populacao);

    }
}