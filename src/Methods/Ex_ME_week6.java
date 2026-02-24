// E - Algarismos em posições comuns
package Methods;
import java.util.Scanner;

public class Ex_ME_week6 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int pair1 = 0;
        int pair2 = 0;
        int bigger = 0;

        Scanner read = new Scanner(System.in);
        int numbers = read.nextInt();

        while (numbers > 0) {
            number1 = read.nextInt();
            number2 = read.nextInt();

            if (number1 >= 0 && number2 >= 0) {
                int totalNumbers = numberOfCommonDigits(number1, number2);
                if (totalNumbers > 0 && bigger <= totalNumbers) {
                    bigger = totalNumbers;
                    pair1 = number1;
                    pair2 = number2;
                }
            }
            numbers--;
        }
        if (bigger > 0) {
            System.out.printf("%d/%d\n", pair1,pair2);
        } else {
            System.out.println("no results");
        }

        read.close();
    }

    public static int numberOfCommonDigits(int number1, int number2) {
        int total = 0;

        while (number1 != 0 || number2 != 0) {
            int digit1 = number1 % 10;
            int digit2 = number2 % 10;

            if (digit1 == digit2) {
                total++;
            }
            number1 = number1 / 10;
            number2 = number2 / 10;
        }
        return total;
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************

