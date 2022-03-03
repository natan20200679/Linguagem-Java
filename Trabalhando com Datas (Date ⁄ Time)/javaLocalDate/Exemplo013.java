/**
 * Exemplo de como manioular LocalTime
 */

package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalTime;

public class Exemplo013 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        // 23:53:58.421
        System.out.println(agora);
        LocalTime maisUmaHora = agora.plusHours(1);

        // 00:55:37.421
        System.out.println(maisUmaHora);

    }
}