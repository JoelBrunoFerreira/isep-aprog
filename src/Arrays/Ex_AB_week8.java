// B - Menores elementos
package Arrays;
import java.util.Scanner;

public class Ex_AB_week8 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int position = 0;
        int[] elements = new int[100];
        int num = read.nextInt();

        while (num >= 0) {
            elements[position] = num;
            position++;
            num = read.nextInt();
        }

        if (position > 0) {
            int min = getMinimumNumber(elements, position);
            int numTimes = getNumberOfTimesThatMinimumValueAppears(elements, position, min);

            System.out.println("min=" + min);
            System.out.println("occurrences=" + numTimes);
        }

        read.close();
    }

    public static int getMinimumNumber(int[] elements, int position) {
        int minimum = elements[0];

        for (int i = 0; i < position; i++) {
            if(elements[i] < position) {
                minimum = elements[i];
            }
        }
        return minimum;
     }

     public static int getNumberOfTimesThatMinimumValueAppears(int[] elements, int position, int minimum) {
        int numberOfTimes = 0;
         for (int i = 0; i < position; i++) {
             if (elements[i] == minimum) {
                 numberOfTimes++;
             }
         }
        return numberOfTimes;
     }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
