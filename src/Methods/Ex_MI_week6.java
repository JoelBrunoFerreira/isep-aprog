// I - Elemento de Fibonacci
package Methods;
import java.util.Scanner;

public class Ex_MI_week6 {
    public static void main(String[] args) {
        int number;
        boolean check;

        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        check = getFibonacci(number);

        if (check) {
            System.out.println("is a Fibonacci number");
        } else {
            System.out.println("is not a Fibonacci number");
        }

        read.close();
    }

    public static boolean getFibonacci(int number) {
        int currentNumber = 0;
        int previousNumber;
        int nextNumber = 1;

        for (int i = 1; i < number; i++) {
            previousNumber = currentNumber;
            currentNumber = nextNumber;
            nextNumber = currentNumber + previousNumber;

            if (nextNumber == number) {
                return true;
            }
        }
        return false;
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************

