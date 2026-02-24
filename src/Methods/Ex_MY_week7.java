package Methods;
import java.util.Scanner;

public class Ex_MY_week7 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int number1;
        int number2;

        number1 = getNumber();
        number2 = getNumber();

        if(number1 >= number2) {
            mostrarTabuadasDoIntervalo(number2, number1);
        } else {
            mostrarTabuadasDoIntervalo(number1, number2);
        }
    }

    public static int getNumber() {
        int num;
        num = read.nextInt();
        while (num <= 0) {
            num = read.nextInt();
        }
        return num;
    }
    public static void mostrarTabuadasDoIntervalo(int lower, int higher) {

        for (int i = lower; i <= higher; i++) {
            System.out.printf("Multiplication table of %d\n", i);
            mostrarTabuadaDoNumero(i);

        }
    }
    public static void mostrarTabuadaDoNumero(int n){
        for (int j = 1; j <=10; j++) {
            System.out.printf("%d x %d = %d\n",n,j,(n*j));

        }
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
