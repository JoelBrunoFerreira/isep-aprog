// E - Estatísticas de vencimentos
package Arrays;
import java.util.Scanner;

public class Ex_AE_week8 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        Double[] salary = new Double[20];
        String[] name = new String[20];

        int data = employeeData(salary, name);
        double media = media(data, salary);

        System.out.println(media);
        lowerFunc(media, name, salary, data);
    }

    public static int employeeData(Double[] salary, String[] name) {
        String employeeName;
        int position = 0;
        employeeName = read.next();

        while (!employeeName.equals("end")) {
            name[position] = employeeName;
            salary[position] = read.nextDouble();
            position++;
            employeeName = read.next();
        }
        return position;
    }
    public static double media(int position, Double[] salary) {
        double sum = 0.0;
        double media;

        for (int i = 0; i < position; i++) {
            sum = sum + salary[i];
        }
        media = sum / position;
        return media;
    }
    public static void lowerFunc(double media, String[] name, Double[] salary, int position) {
        for (int i = 0; i < position; i++) {
            if (media > salary[i])
                System.out.println(name[i]);
        }
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
