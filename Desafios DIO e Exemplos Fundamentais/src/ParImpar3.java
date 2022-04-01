import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ParImpar3 {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        List<Integer> pares = new LinkedList<>();
        List<Integer> impares = new LinkedList<>();

        for (int i = 0; i < N; i++) {

            int X = leitor.nextInt();

            if (X % 2 == 0) {

                pares.add(X);
                
            } else {

                impares.add(X);
            }

        }

        Collections.sort(pares);
        for (int i : pares) System.out.println(i);

        Collections.sort(impares, Collections.reverseOrder());
        for (int i : impares) System.out.println(i);

        leitor.close();

    }
    
}