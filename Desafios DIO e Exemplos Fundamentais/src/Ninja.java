import java.util.Scanner;

public class Ninja {
    
    public static void main(String[] args) {
    	  
	    Scanner sc = new Scanner(System.in);
        int N;

        while(sc.hasNext()) {

            N = sc.nextInt();
            System.out.println((int) (Math.log10(N) / Math.log10(2)));
        }

        sc.close();

    }

}