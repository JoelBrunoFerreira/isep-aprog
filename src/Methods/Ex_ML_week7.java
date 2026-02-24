// L - Quantidade de palavras de uma frase
package Methods;
import java.util.Scanner;

public class Ex_ML_week7 {
    public static void main(String[] args) {
        String phrase;
        int number;

        Scanner read = new Scanner(System.in);
        phrase = read.nextLine();

        number = getNumberOfWords(phrase);
        System.out.println(number);

        read.close();

    }

    public static int getNumberOfWords (String phrase) {
        int counter = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) != ' ') {
                counter++;
            }
            while (phrase.charAt(i) != ' ' && i < phrase.length() -1) {
                i++;
            }
        }
        return counter;
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************