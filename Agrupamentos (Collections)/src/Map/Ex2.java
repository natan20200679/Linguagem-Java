package Map;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("\n-- Adicione 26 estados brasileiros no Map, onde a sigla será a chave e o nome do estado" +
                " o valor-- ");
        Map<String,String> estados = new HashMap<>();
        estados.put("AC","Acre");
        estados.put("RO","Rondônia");
        estados.put("RR","Roraima");
        estados.put("MG","Minas Gerais");
        estados.put("PR","Paraná");
        estados.put("SP","São Paulo");
        estados.put("BA","Bahia");
        estados.put("PE","Pernambuco");
        estados.put("PI","Piauí");
        estados.put("PB","Paraíba");
        estados.put("CE","Ceará");
        estados.put("RN","Rio Grande do Norte");
        estados.put("SE","Sergipe");
        estados.put("MA","Maranhão");
        estados.put("RJ","Rio de Janeiro");
        estados.put("ES","Espírito Santo");
        estados.put("MT","Mato Grosso");
        estados.put("MS","Mato Grosso do Sul");
        estados.put("AM","Amazonas");
        estados.put("AL","Alagoas");
        estados.put("GO","Goiás");
        estados.put("RS","Rio Grande do Sul");
        estados.put("SC","Santa Catarina");
        estados.put("PA","Pará");
        estados.put("TO","Tocantins");
        estados.put("AP","Amapá");
        System.out.println(estados);

        System.out.println("\n-- Remova o estado de Minas Gerais --");
        estados.remove("Minas Gerais");
        System.out.println(estados);

        System.out.println("\n-- Adicione o Distrito Federal --");
        estados.put("DF","Distrito Federal");
        System.out.println(estados);

        System.out.println("\n-- Verifique o tamanho do mapa --");
        System.out.println(estados.size());

        System.out.println("\n-- Remova o estado de Mato Grosso do Sul, usando o nome --");
        estados.remove("Mato Grosso do Sul");
        System.out.println(estados);

        System.out.println("\n-- Navegue em todos os registros do Map, mostrando no console no seguinte formato: " +
                "NOME (SIGLA) --");
        for (String key: estados.keySet()) {
            System.out.println(estados.get(key) + " (" + key + ")");
        }

        System.out.println("\n-- Verifique se o estado de Santa Catarina existe no Map buscando por sua sigla (SC) --");
        System.out.println(estados.containsKey("SC"));

        System.out.println("\n-- Verifique se o estado de Maranhão existe no Map buscando por seu nome --");
        System.out.println(estados.containsValue("Maranhão"));
    }
}