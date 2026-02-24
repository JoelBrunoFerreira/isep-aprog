// F - Palíndromo
package Essentials;
import java.util.Scanner;

public class Ex_F_week4 {
    public static void main(String[] args) {
        int originalNumber;
        int reversedNumber = 0;

        Scanner read = new Scanner(System.in);
        originalNumber = read.nextInt();

        int number = originalNumber;

        while (number > 0) {

            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + number % 10;
            number = number / 10;

        }

        if (reversedNumber == originalNumber) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        read.close();
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
