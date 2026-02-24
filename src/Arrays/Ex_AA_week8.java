// A - Classificações de APROG
package Arrays;
import java.util.Scanner;

public class Ex_AA_week8 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double[] alunos;
        int n;
        double soma = 0.0;

        n = read.nextInt();
        alunos = new double[n];

        for (int i = 0; i < n; i++) {
            alunos[i] = read.nextDouble();
            soma = soma + alunos[i];
        }

        System.out.printf("average=%.1f%n", (soma/n));
        System.out.println("failures="+obterReprovados(alunos));

        read.close();
    }

    public static int obterReprovados(double[] arr) {
        int reprovados = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 10) {
                reprovados++;
            }
        }
        return reprovados;
    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************