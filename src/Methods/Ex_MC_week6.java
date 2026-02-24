// C - Calcular os ângulos de um triângulo
package Methods;
import java.util.Scanner;

public class Ex_MC_week6 {
    public static void main(String[] args) {
        float ladoAB;
        float ladoAC;
        float ladoBC;
        float a;
        float b;
        float c;

        Scanner read = new Scanner(System.in);

        a = read.nextFloat();
        b = read.nextFloat();
        c = read.nextFloat();

        if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
            ladoAB = calcularAngulo(a, b, c);
            ladoAC = calcularAngulo(a, c, b);
            ladoBC = calcularAngulo(b, c, a);

            System.out.printf("a=%.2f\n", a);
            System.out.printf("b=%.2f\n", b);
            System.out.printf("c=%.2f\n", c);
            System.out.printf("ang(a,b)=%.2f\n", ladoAB);
            System.out.printf("ang(a,c)=%.2f\n", ladoAC);
            System.out.printf("ang(b,c)=%.2f\n", ladoBC);
        } else {
            System.out.println("impossible");
        }

        read.close();
    }

    public static float calcularAngulo(float a, float b, float c) {
        float angulo;
        angulo = (float) (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2));
        angulo = angulo / (2 * a * b);
        angulo = (float) Math.toDegrees(Math.acos(angulo));
        return angulo;
    }
}


// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************

