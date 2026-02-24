// K - Números primos até um limite
package Essentials;
import java.util.Scanner;

public class Ex_K_week5 {
    public static void main(String[] args) {
        int number;
        int divisors = 1;
        int total = 0;

        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        for (int i = 1; i <= number; i++) {
            while(divisors <= i) {
                if (i % divisors == 0) {
                    total++;
                }
                divisors = divisors + 1;
            }
            if (total == 2) {
                System.out.println(+i);
            }
            divisors = 1;
            total = 0;

        }
        read.close();
    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
