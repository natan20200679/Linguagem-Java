/*
Recrie a aplicação que calcula a área dos três quadriláteros notáveis. Agora faça os métodos retornarem valores.
Nota: O tipo de dado a ser retornado num método deve ser do mesmo tipo declarado na própria descrição desse método.
 */

package Retornos;

public class Main {

    public static void main(String[] args) {
        // Retornos

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do Quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do Retêngulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do Trapezio:" + areaTrapezio);

    }
}