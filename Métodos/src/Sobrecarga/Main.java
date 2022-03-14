/*
Crie uma aplicação que calcula a área dos três quadriláteros notáveis: Quadrado, Retângulo e Trapézio. Obs.:
Use Sobrecarga.
 */

package Sobrecarga;

public class Main {
    public static void main(String[] args) {
        // Quadrilátero
        System.out.println("Quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);
    }
}