// M - Sequência de Fibonacci
package Essentials;
import java.util.Scanner;

public class Ex_M_week5 {
    public static void main(String[] args) {
        int number;
        int previousNumber;
        int currentNumber = 0;
        int nextNumber = 1;

        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        if (number > 0) {
            System.out.println(currentNumber);
            for (int i = 1; i < number; i++) {
                System.out.println(+nextNumber);
                previousNumber = currentNumber;
                currentNumber = nextNumber;
                nextNumber = previousNumber + currentNumber;
            }
        }
        read.close();
    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************