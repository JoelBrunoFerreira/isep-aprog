// H - Rodar sequência
package Arrays;
import java.util.Scanner;

public class Ex_AH_week8 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int num = read.nextInt();
        int[] numbers = values(num);

        String position = read.next();
        while (!position.equals("exit")) {
            if (position.equals("right")) {
                right(numbers, num);
            }
            if (position.equals("left")) {
                left(numbers, num);
            }
            position = read.next();
        }
    }
    public static int[] values(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = read.nextInt();

        }
        return arr;
    }
    public static void left(int[] num, int pos) {
        int[] aux = new int[1];
        for (int i = 0; i < 1; i++) {
            aux[i] = num[i];

            for (int j = 1; j < pos; j++) {
                num[j - 1] = num[j];
            }
            for (int k = 0; k < 1; k++) {
                num[k + pos - 1] = aux[k];
            }
        }
        for (int i = 0; i < pos; i++) {
            System.out.printf("[%d]", num[i]);
        }
        System.out.println();
    }

    public static void right(int[] num, int pos) {
        int[] aux = new int[1];
        for (int i = 0; i < 1; i++) {
            aux[i] = num[pos - 1 + i];
        }
        for (int j = pos - 1 - 1; j >= 0; j--) {
            num[j + 1] = num[j];
        }
        for (int k = 0; k < 1; k++) {
            num[k] = aux[k];
        }

        for (int i = 0; i < pos; i++) {
            System.out.printf("[%d]", num[i]);
        }
        System.out.println();
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
