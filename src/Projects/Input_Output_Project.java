package Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Input_Output_Project {

    static final int MAX_NUMBER_STUDENTS = 20;
    static final int DISCIPLINES = 5;
    static final String FILE_IN = "students_grades.csv";

    static final String FILE_OUT = "sorted_students_grades.csv";

    public static void main(String[] args) throws FileNotFoundException {

        // Challenge:
        // 1- Read from a csv file the students grades from 5 academical disciplines
        // 2- Get average grade
        // 3- sort grades in descent order
        // 4- Display average
        // 5- Write to a file the final result

        // NOTE: The csv file has in each line the following structure:
        // student_name,grade1,grade2,grade3,grade4,grade5

        String[] students_names = new String[MAX_NUMBER_STUDENTS];
        int[][] students_grades = new int[MAX_NUMBER_STUDENTS][DISCIPLINES];
        double[] grades_average = new double[MAX_NUMBER_STUDENTS];

        // 1
        int studentsTotal = readFromCSV(students_names, students_grades, FILE_IN);

        // 2
        getAverage(students_grades, grades_average, studentsTotal);

        // 3
        sortGrades(students_names, students_grades, grades_average, studentsTotal);

        // 4
        displayAverage(students_names, grades_average, studentsTotal);

        // 5
        writeToFile(students_names, grades_average, studentsTotal, FILE_OUT);

    }


    public static int readFromCSV(String[] arrNames, int[][] arrGrades, String fileName) throws FileNotFoundException {

        Scanner in = new Scanner(new File(fileName));

        int studentsTotal = 0;

        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] items = line.split(",");
            arrNames[studentsTotal] = items[0];

            for (int discipline = 0, item = 1; item < items.length; discipline++, item++) {
                arrGrades[studentsTotal][discipline] = Integer.parseInt(items[item]);
            }
            studentsTotal++;
        }
        in.close();
        return studentsTotal;
    }

    public static void getAverage(int[][] arrGrades, double[] grades_average, int studentsTotal) {

        for (int student = 0; student < studentsTotal; student++) {

            int sum = 0;
            for (int discipline = 0; discipline < DISCIPLINES; discipline++) {
                sum += arrGrades[student][discipline];
            }
            grades_average[student] = (double) sum / DISCIPLINES;
        }
    }

    public static void sortGrades(String[] students_names, int[][] arrGrades, double[] grades_average, int studentsTotal) {
        for (int i = 0; i < studentsTotal -1; i++) {
            for (int j = i + 1; j < studentsTotal; j++) {
                if (grades_average[j] > grades_average[i]) {
                    double auxVarGrade = grades_average[i];
                    grades_average[i] = grades_average[j];
                    grades_average[j] = auxVarGrade;

                    String auxVarName = students_names[i];
                    students_names[i] = students_names[j];
                    students_names[j] = auxVarName;

                    int[] auxGrades = arrGrades[i];
                    arrGrades[i] = arrGrades[j];
                    arrGrades[j] = auxGrades;
                }
            }
        }
    }

    public static void displayAverage(String[] students_names, double[] grades_average, int studentsTotal) {
        for (int student = 0; student < studentsTotal; student++) {
            System.out.printf("%-10s : %5.2f %n", students_names[student], grades_average[student]);
        }
    }

    public static void writeToFile(String[] students_names, double[] grades_average, int studentsTotal, String fileName) throws FileNotFoundException{

        PrintWriter out = new PrintWriter(fileName);

        for (int student = 0; student < studentsTotal; student++) {
            out.println(students_names[student] + "," + grades_average[student]);
        }
        out.close();

        System.out.println("The results were saved in " + fileName);
    }

}
