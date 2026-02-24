// Z - Percentagem de algarismos pares e maior ímpar
package Essentials;
import java.util.Scanner;

public class Ex_Z_week5 {
    public static void main(String[] args) {
        int number;
        int digit;
        int totalEvenNumbers = 0;
        int totalOddNumbers = 0;
        int biggestOddNumber = 1;
        int totalNumbers = 0;
        double percentage;


        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        while (number > 0) {
            digit = number % 10;
            number = number / 10;
            totalNumbers++;

            if (digit % 2 == 0) {
                totalEvenNumbers++;
            } else {
                totalOddNumbers++;
                if (digit > biggestOddNumber) {
                    biggestOddNumber = digit;
                }
            }
        }
        percentage = (double)totalEvenNumbers / totalNumbers * 100;

        if (totalOddNumbers == 0) {
            System.out.printf("%.2f%%\n", percentage);
            System.out.println("no odd digits");
        } else {
            System.out.printf("%.2f%%\n", percentage);
            System.out.println(biggestOddNumber);
        }

        read.close();
    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
