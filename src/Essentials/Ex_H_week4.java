// H - Número primo
package Essentials;
import java.util.Scanner;

public class Ex_H_week4 {
    public static void main(String[] args) {
        int number;
        int divisors = 0;

        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                divisors++;
            }
        }

        if (divisors == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        read.close();

    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************

