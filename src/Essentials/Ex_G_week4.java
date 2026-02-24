// G - Divisores de um número
package Essentials;
import java.util.Scanner;

public class Ex_G_week4 {
    public static void main(String[] args) {
        int number;
        int divisors = 0;

        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i);
                divisors = divisors + 1;
            }
        }
        System.out.println("("+divisors+")");

        read.close();
    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************