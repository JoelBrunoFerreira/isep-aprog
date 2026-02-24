// G - Inverter sequência
package Arrays;
import java.util.Scanner;

public class Ex_AG_week8 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int number = read.nextInt();
        int[] numbersArray = values(number);
        sortNumbers(numbersArray, number);
    }
    public static int[] values(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = read.nextInt();
        }
        return arr;
    }
    public static void sortNumbers(int[] num, int position) {
        for (int i = position-1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************