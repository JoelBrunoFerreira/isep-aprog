// K - Sem repetições
package Arrays;
import java.util.Scanner;

public class Ex_AK_week9 {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        num = read.nextInt();
        int arr[] = new int[num];

        for(int i=0; i<num; i++) {
            arr[i] = read.nextInt();
        }
        uniqueValues(arr, num);

        read.close();
    }

    static void uniqueValues(int arr[], int num) {
        for (int i = 0; i < num; i++) {
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j]) {
                    break;
                }
            if (i == j) {
                System.out.println(arr[i]);
            }
        }
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************