// D - Frequências das notas
package Arrays;
import java.util.Scanner;

public class Ex_AD_week8 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int number = read.nextInt();
        int[] arr = readAndStore(number);
        int[] sequence = sequence(arr);
        showGrades(sequence);
    }

    public static int[] readAndStore(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = read.nextInt();
        }
        return arr;
    }

    public static int[] sequence(int[] elementos) {
        int[] grades = new int[21];
        for (int j = 0; j < elementos.length; j++) {
            grades[elementos[j]]++;
        }
        return grades;
    }

    public static void showGrades(int[] sequence) {
        for (int i = 0; i < 21; i++) {
            System.out.println(i + " " + sequence[i]);
        }
    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
