// Collections: Exemplos das aulas de Rinaldo Júnior (Youtube), com pequenas modificações

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // ForEach
        list.forEach(n -> System.out.println(n));

        System.out.println("---------");

        // removeIf
        list.removeIf(n -> n % 2 == 0);
        list.forEach(n -> System.out.println(n));

        System.out.println("---------");

        // replaceAll
        list.replaceAll(n -> n * 5);
        list.forEach(n -> System.out.println(n));

        System.out.println("---------");

        // Map
        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"Se");
        map.put(1,"Inscreva");
        map.put(2,"no");
        map.put(3,"canal");

        // forEach
        map.forEach((k,v) -> System.out.println(k + " " + v));

        System.out.println("---------");

        // compute
        map.compute(1,(k,v) -> v + " agora");
        map.forEach((k,v) -> System.out.println(k + " " + v));

        System.out.println("---------");

        // merge
        map.merge(3,"!",(v1,v2) -> v1 + v2);
        map.forEach((k,v) -> System.out.println(k + " " + v));

        System.out.println("---------");

        // replaceAll
        map.replaceAll((k,v) -> v + "!");
        map.forEach((k,v) -> System.out.println(k + " " + v));

    }
}