// C - Produto dos algarismos impares
package Essentials;
import java.util.Scanner;

public class Ex_C_week4 {
    public static void main(String[] args) {
        int num;
        int digit;
        int product = 1;
        int evenNumbers = 0;

        Scanner read = new Scanner(System.in);
        num = read.nextInt();

        if (num >= 0) {
            while (num > 0) {
                digit = num % 10;

                if (digit % 2 != 0) {
                    product = product * digit;
                    evenNumbers = evenNumbers + 1;
                }
                num = num / 10;
            }

            if (evenNumbers > 0) {
                System.out.println(product);
            } else {
                System.out.println("no odd digits");
            }
        }
        read.close();
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
