/**
 *  Exemplo de utilização da classe Calendar
 */

package aulas.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

public class Exemplo006 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        // A data corrente é : Sun Jul 14 20:50:31 BRT 2019
        System.out.println("A data corrente é : " + agora.getTime());

        agora.add(Calendar.DATE, -15);

        // 15 dias atrás: Sat Jun 29 20:50:31 BRT 2019
        System.out.println("15 dias atrás: " + agora.getTime());

        agora.add(Calendar.MONTH, 4);

        // 4 meses depois: Tue Oct 29 20:50:31 BRT 2019
        System.out.println("4 meses depois: " + agora.getTime());

        agora.add(Calendar.YEAR, 2);

        // 2 anos depois: Fri Oct 29 20:50:31 BRT 2021
        System.out.println("2 anos depois: " + agora.getTime());

    }
}