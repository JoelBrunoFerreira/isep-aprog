// C - Sequência crescente
package Arrays;
import java.util.Scanner;

public class Ex_AC_week8 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int number = read.nextInt();
        int[] arr = readAndStore(number);
        boolean sequence = sequence(arr);
        System.out.println("always ascending = " + sequence);
    }

    public static int[] readAndStore(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = read.nextInt();
        }
        return arr;
    }
    public static boolean sequence(int[] elementos) {
        int cont=1;
        for (int j = 1; j < elementos.length; j++) {
            if (elementos[j] > elementos[j-1]) {
                cont++;
            }
        }

        if (cont == elementos.length) {
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