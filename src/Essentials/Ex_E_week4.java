// E - Converter de base 8 para decimal
package Essentials;
import java.util.Scanner;

public class Ex_E_week4 {
    public static void main(String[] args) {
        int octalNumber;
        int digit;
        int decimalNumber;
        int exponent = 0;
        int base = 8;

        Scanner read = new Scanner(System.in);
        octalNumber = read.nextInt();

        while (octalNumber > 0) {
            decimalNumber = 0;
            do{
                digit = octalNumber % 10;
                decimalNumber += digit * Math.pow(base,exponent);
                octalNumber = octalNumber / 10;
                exponent++;

            } while (octalNumber != 0);

            System.out.println(decimalNumber);
            exponent = 0;
            octalNumber = read.nextInt();
        }
        read.close();
    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
