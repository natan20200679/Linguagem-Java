/**
 *  Algumas conversões de data
 */

package aulas.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

public class Exemplo007 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        //Dom jul 14 20:58:11 BRT 2019
        System.out.printf("%tc\n", agora);

        //2019-07-14
        System.out.printf("%tF\n", agora);

        //07/14/19
        System.out.printf("%tD\n", agora);

        //08:58:11 PM
        System.out.printf("%tr\n", agora);

        //20:58:11
        System.out.printf("%tT\n", agora);

    }
}