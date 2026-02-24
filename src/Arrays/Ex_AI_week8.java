// I - Condomínio (v1)
package Arrays;
import java.util.Scanner;

public class Ex_AI_week8 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] people = new String[3][4];
        String[][] data = data(people);
        info(data);
    }
    public static String[][] data(String[][] entrance) {
        for (int i = 0; i < entrance.length; i++) {
            for (int j = 0; j < entrance[i].length; j++) {
                entrance[i][j] = read.nextLine();
            }
        }
        return entrance;
    }
    public static void info(String[][] data) {
        int counter = 0;
        String nome = read.nextLine();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (nome.equals(data[i][j])) {
                    System.out.println("name=" + data[i][j]);
                    System.out.println("entrance=" + i);
                    System.out.println("floor=" + j);
                    counter++;
                }
            }
        }
        if(counter == 0) {
            System.out.println("Do not live in the building");
        }
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************