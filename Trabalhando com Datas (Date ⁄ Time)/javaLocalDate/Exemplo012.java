/**
 * Exemplo de como utilizar LocalTime
 */

package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalTime;

public class Exemplo012 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        // 23:53:58.421
        System.out.println(agora);

    }
}