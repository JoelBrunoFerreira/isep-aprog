// G - Números de Armstrong
package Methods;
import java.util.Scanner;

public class Ex_MG_week6 {
    public static void main(String[] args) {
        int number;

        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        for (int i = 0; i <= number ; i++) {
            isArmstrongNumber(i);
        }

        read.close();
    }

    public static void isArmstrongNumber(int number) {
        int numero = number;
        int position = 0;
        int digit;
        int total = 0;

        while (numero > 0) {
            position++;
            numero/=10;
        }
        numero = number;
        while (numero > 0) {
            digit = numero % 10;
            total = total + (int)Math.pow(digit, position);
            numero = numero / 10;
        }

        if (number == total)
            System.out.println(number);
    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
