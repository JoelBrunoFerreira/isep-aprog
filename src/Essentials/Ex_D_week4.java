// D - Produto dos algarismos impares (v2)
package Essentials;
import java.util.Scanner;

public class Ex_D_week4 {
    public static void main(String[] args) {
        int num;
        int digit;
        int product = 1;
        int evenNumbers = 0;

        Scanner read = new Scanner(System.in);
        num = read.nextInt();

        while (num > 0) {
            do {
                digit = num % 10;

                if (digit % 2 != 0){
                    product = product * digit;
                    evenNumbers = evenNumbers + 1;
                }
                num = num / 10;
            } while(num != 0);

            if (evenNumbers > 0) {
                System.out.println(product);
            } else {
                System.out.println("no odd digits");
            }
            product = 1;
            evenNumbers = 0;
            num = read.nextInt();
        }
        read.close();
    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
