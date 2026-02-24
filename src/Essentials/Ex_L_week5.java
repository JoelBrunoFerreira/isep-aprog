// L - Números perfeitos
package Essentials;
import java.util.Scanner;

public class Ex_L_week5 {
    public static void main(String[] args) {
        int number;
        int divisors = 1;
        int counter = 1;
        int sum = 0;
        int perfectNumbers = 0;

        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        for (int i = 1; i <= number; i++) {

            while (perfectNumbers < number) {
                counter = counter + 1;
                do {
                    if (counter % divisors == 0) {
                        sum = sum + divisors;
                    }
                    divisors = divisors + 1;
                } while (divisors < counter);

                if (sum == counter) {
                    System.out.println(sum);
                    perfectNumbers = perfectNumbers + 1;
                }
                divisors = 1;
                sum = 0;
            }
        }
        read.close();
    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
