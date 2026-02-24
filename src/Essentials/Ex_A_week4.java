// A - Somar algarismos pares
package Essentials;
import java.util.Scanner;

public class Ex_A_week4 {
    public static void main(String[] args) {
        int num;
        int alg;
        int soma = 0;

        Scanner read = new Scanner(System.in);
        num = read.nextInt();

        while(num > 0) {
            alg = num % 10;
            num = num / 10;

            if (alg % 2 == 0) {
                soma = soma + alg;
            }
        }
        System.out.println(soma);
        read.close();
    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************

