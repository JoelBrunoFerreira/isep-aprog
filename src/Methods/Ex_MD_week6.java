// D - Combinações e permutações
package Methods;
import java.util.Scanner;

public class Ex_MD_week6 {
    public static void main(String[] args) {
        int m;
        int n;

        Scanner read = new Scanner(System.in);
        m = read.nextInt();
        n = read.nextInt();

        if (m >= n) {
            System.out.printf("C(%d,%d)=%d\n", m, n, combinacoes(m, n));
            System.out.printf("P(%d,%d)=%d\n", m, n, permutacoes(m, n));
        }

        read.close();
    }

    public static int fatorial(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num *= i;
        }
        return num;
    }

    public static int combinacoes(int m, int n) {
        return (fatorial(m) / (fatorial(n) * fatorial(m - n)));
    }

    public static int permutacoes(int m, int n) {
        return (fatorial(m) / fatorial(m - n));
    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************