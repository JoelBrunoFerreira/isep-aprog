// B - Gráfico de classificações
package Methods;
import java.util.Scanner;

public class Ex_MB_week6 {
    public static void main(String[] args) {
        int numeroAlunos;
        int numeroDisciplinas;
        int numeroAlunosAprovados;
        String nomeDisciplina;

        Scanner read = new Scanner(System.in);
            numeroAlunos = read.nextInt();
            numeroDisciplinas = read.nextInt();

        for (int disciplina = 0; disciplina < numeroDisciplinas; disciplina++) {
            nomeDisciplina = read.next();
            numeroAlunosAprovados = read.nextInt();
            printInformation(nomeDisciplina, numeroAlunos, numeroAlunosAprovados);
        }

        read.close();
    }

    public static void printInformation(String nomeDisciplina, int numeroAlunos, int numeroAlunosAprovados) {
        int negativas = numeroAlunos - numeroAlunosAprovados;

        System.out.printf("Subject: %s", nomeDisciplina);
        System.out.printf("\n- Approved: ");

        for (int i = 0; i < numeroAlunosAprovados; i++) {
            System.out.printf("*");
        }
        System.out.printf("\n- Failed: ");

        for (int k = 0; k < negativas; k++) {
            System.out.printf("*");
        }
        System.out.printf("\n");
    }
}

// *********************************************
//                 Submetido
//                 Aprovado
// *********************************************
