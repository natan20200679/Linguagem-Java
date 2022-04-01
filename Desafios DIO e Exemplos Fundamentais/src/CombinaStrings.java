import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinaStrings {

   public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      // ler quantidade de casos de teste
      int N = Integer.parseInt(br.readLine());

      // repetir entradas de cadeias quantos forem os
      // acasos de estudos informados
      for(int i = 1 ; i <= N ; i++) {

         // variavel que ira receber a combinação
         String combinar = "";

         // ler a entrada
         // e quebrar a entrada em 2 string com espaço como separador
         String[] cadeia = br.readLine().split(" ");

         // verificando comprimentos das strings
         int a = cadeia[0].length();
         int b = cadeia[1].length();

         // identificar qual é a menor cadeia
         int menor = b ;
         if(b > a) menor = a;

         // repetir loop de combinação
         // dentro do comprimento da menor cadeia
         for(int x = 0 ; x < menor ; x++) {

            combinar += String.valueOf(cadeia[0].charAt(x)) + String.valueOf(cadeia[1].charAt(x));

         }

         // se comprimento de cadeias não forem iguais
         // inserir os caracteres restantes da cadeia maior na combinação
         if(a != b) {

            if(a > b) combinar += cadeia[0].substring(menor,a);
            else combinar += cadeia[1].substring(menor,b);
            
         }

         // apresentar combinação
         System.out.println(combinar);
      }
   }
}