// F - Aplicação financeira
package Arrays;
import java.util.Scanner;

public class Ex_AF_week8 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        double[] interestRate = interestRate();

        finalValue(interestRate);
    }
    public static double[] interestRate() {
        double[] taxaJuros = new double[6];
        for (int i = 0; i < taxaJuros.length; i++) {
            taxaJuros[i] = read.nextDouble();
        }
        return taxaJuros;
    }
    public static void finalValue(double[] taxaJuros) {
        double investment = read.nextDouble();

        for (int i = 0; i < taxaJuros.length; i++) {
            investment = investment * (taxaJuros[i]+1);
        }
        System.out.printf("final value=%.2f\n", investment);
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
