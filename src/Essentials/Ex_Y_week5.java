// Y - Divisores múltiplos de 3
package Essentials;
import java.util.Scanner;

public class Ex_Y_week5 {
    public static void main(String[] args) {
        int number;
        int divisors = 0;

        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        for (int i = 3; i <= number; i = i + 3) {
            if (number % i == 0 ) {
                System.out.println(i);
                divisors++;
            }
        }

        if (divisors == 0) {
            System.out.println("without dividers multiples of 3");
        }
        read.close();
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
