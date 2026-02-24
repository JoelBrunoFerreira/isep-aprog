// H - Palíndromo
package Methods;
import java.util.Scanner;

public class Ex_MH_week6 {
    public static void main(String[] args) {
        int number;
        int counter = 0;
        boolean tentativas = false;
        boolean palindrome = false;

        Scanner read = new Scanner(System.in);

        while (tentativas == false){
            number = read.nextInt();
            palindrome = checkIfPalindrome(number);
            if (palindrome) {
                System.out.println("palindrome");
                tentativas = true;
            }
            counter++;
            if (counter == 5) {
                tentativas = true;
            }
        }
        if (palindrome == false && counter == 5) {
            System.out.println("attempts exceeded");
        }

        read.close();
    }

    public static boolean checkIfPalindrome(int number) {
        int digit = number;
        int reversedNumber = 0;

        do {
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + number % 10;
            number = number / 10;
        } while (number != 0);

        if (reversedNumber == digit) {
            return true;
        } else {
            return false;
        }
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
