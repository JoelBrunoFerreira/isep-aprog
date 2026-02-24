// X - Relógio
package Essentials;
import java.util.Scanner;

public class Ex_X_week5 {
    public static void main(String[] args) {
        int number;

        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        switch (number) {
            case 1:
                System.out.println("Tag Heuer");
                break;
            case 2:
                System.out.println("Rolex");
                break;
            case 3:
                System.out.println("Omega");
                break;
            case 4:
                System.out.println("Cartier");
                break;
            case 5:
                System.out.println("Bvlgari");
                break;
            case 6:
                System.out.println("Raymond Weil");
                break;
            default:
                System.out.println("Invalid brand");
        }
        read.close();
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************