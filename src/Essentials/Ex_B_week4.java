// B - Somar algarismos pares V2
package Essentials;
import java.util.Scanner;

public class Ex_B_week4 {
    public static void main(String[] args) {
        int num;
        int digit;
        int soma = 0;

        Scanner read = new Scanner(System.in);
        num = read.nextInt();

        while (num > 0) {
            while (num > 0) {
                digit = num % 10;
                num = num / 10;

                if (digit % 2 == 0) {
                    soma = soma + digit;
                }
            }
            System.out.println(soma);
            soma = 0;
            num = read.nextInt();
        }
        read.close();
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
