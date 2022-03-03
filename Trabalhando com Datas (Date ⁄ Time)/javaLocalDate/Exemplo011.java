/**
 * Exemplo de como manipular LocalDate
 */

package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDate;

public class Exemplo011 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);

        // 2019-07-14
        System.out.println(hoje);

        // 2019-07-13
        System.out.println(ontem);

    }
}