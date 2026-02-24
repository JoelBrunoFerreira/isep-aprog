// F - Volume de sólidos de revolução
package Methods;
import java.util.Scanner;

public class Ex_MF_week6 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String solid = read.nextLine();

        while (!solid.equals("end")) {
            switch (solid) {
                case "cone":
                    double raioCone = read.nextDouble();
                    double heightCone = read.nextDouble();
                    System.out.printf("%.2f\n", calcVolumeCone(raioCone, heightCone));
                    break;
                case "sphere":
                    double raioSphere = read.nextDouble();
                    System.out.printf("%.2f\n", calcVolumeSphere(raioSphere));
                    break;
                case "cylinder":
                    double raioCylinder = read.nextDouble();
                    double heightCylinder = read.nextDouble();
                    System.out.printf("%.2f\n", calcVolumeCylinder(raioCylinder, heightCylinder));
                    break;
            }
            solid = read.nextLine();
        }

        read.close();
    }
    
    public static double calcVolumeSphere(double raio) {
        final double PI = Math.PI;
        final double CONSTANTE = (double) 4 / 3;
        return (CONSTANTE * PI * Math.pow(raio, 3));
    }

    public static double calcVolumeCylinder(double raio, double height) {
        final double PI = Math.PI;
        return (PI * Math.pow(raio, 2) * height);
    }

    public static double calcVolumeCone(double raio, double height) {
        final double PI = Math.PI;
        final double CONSTANTE = (double) 1 / 3;
        return (CONSTANTE * PI * Math.pow(raio, 2) * height);
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
