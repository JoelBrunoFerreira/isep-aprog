// I - Mínimo múltiplo comum
package Essentials;
import java.util.Scanner;

public class Ex_I_week4 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int qtd = 1;
        int mmc = 0;

        Scanner read = new Scanner(System.in);

        number1 = read.nextInt();
        number2 = read.nextInt();

        do {
            if (qtd % number1 == 0 && qtd % number2 == 0) {
                mmc = qtd;
            }
            qtd = qtd + 1;

        }while (mmc == 0);

        System.out.println(mmc);

        read.close();

    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
