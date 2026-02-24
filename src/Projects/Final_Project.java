package Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Final_Project {
    final static String FICHEIRO = "ficheiroteste1.txt";
    final static int HIGH = 20;
    final static int EXTREME = 30;
    final static int CATASTROPHIC = 40;
    final static int VARIACAOTEMPERATURASUBIDA = 10;
    final static int VARIACAOTEMPERATURADESIDA = -10;
    final static int POTENCIALINCENDIO = 50;

    public static void main(String[] args) throws FileNotFoundException {
        int[][] mapaTemperatura;
        mapaTemperatura = gerarMatrizTerrenoPeloFicheiro(FICHEIRO);

        // -----------------------------------------------------------
        System.out.println("b)");
        mostrarMapaTemperatura(mapaTemperatura);

        // -----------------------------------------------------------
        System.out.println("c)");
        String[][] mapAlertas;
        mapAlertas = gerarMapaAlertasPeloMapaTemperatura(mapaTemperatura);
        mostrarMapaAlertas(mapAlertas);

        // -----------------------------------------------------------
        // d) Apply -10ºC variation and generate new alert map
        System.out.println("d)");
        int[][] novoMapTemp;
        String[][] novoMapAlertas;
        novoMapTemp = aplicarVariacaoTemperatura(mapaTemperatura, VARIACAOTEMPERATURADESIDA);
        novoMapAlertas = gerarMapaAlertasPeloMapaTemperatura(novoMapTemp);
        mostrarMapaTemperatura(novoMapTemp);
        mostrarMapaAlertas(novoMapAlertas);

        // -----------------------------------------------------------
        System.out.println("e)");
        mostrarPercentagemAlertas(novoMapAlertas);

        // -----------------------------------------------------------
        System.out.println("f)");
        getCatastrophicTemp(novoMapTemp);

        // -----------------------------------------------------------
        // g) Apply +10ºC variation to the ORIGINAL map and compare with it
        System.out.println("g)");
        int[][] mapTempSubida;
        String[][] mapAlertasSubida;
        mapTempSubida = aplicarVariacaoTemperatura(mapaTemperatura, VARIACAOTEMPERATURASUBIDA);
        mapAlertasSubida = gerarMapaAlertasPeloMapaTemperatura(mapTempSubida);
        mostrarPercentagemAlertasAlteracao(mapAlertasSubida, mapAlertas, VARIACAOTEMPERATURASUBIDA);

        // -----------------------------------------------------------
        // h) Wind effect North->South on the ORIGINAL alert map (work on a copy)
        System.out.println("h)");
        String[][] comAlteracaoVento;
        comAlteracaoVento = mapaAlertasComAlteracaoVento(mapAlertas);
        mostrarMapaAlertas(comAlteracaoVento);

        // -----------------------------------------------------------
        System.out.println("i)");
        calcularAreaIdealHelicopetro(mapaTemperatura);

        // -----------------------------------------------------------
        // j) Find safest column considering BOTH wind directions
        System.out.println("j)");
        int colunaSegura = determinarColunaSegura(mapAlertas);
        mostrarColunaSegura(colunaSegura);
    }

    // -----------------------------------------------------------
    // a) Read terrain data from file into a matrix
    public static int[][] gerarMatrizTerrenoPeloFicheiro(String nomeFicheiro) throws FileNotFoundException {
        int qtdLinhas, qtdColunas;
        Scanner lerDoFicheiro = new Scanner(new File(nomeFicheiro));
        // Skip header line
        lerDoFicheiro.nextLine();
        qtdLinhas = lerDoFicheiro.nextInt();
        qtdColunas = lerDoFicheiro.nextInt();
        int[][] mapaTemperaturas = new int[qtdLinhas][qtdColunas];
        while (lerDoFicheiro.hasNextInt()) {
            for (int i = 0; i < mapaTemperaturas.length; i++) {
                for (int j = 0; j < mapaTemperaturas[i].length; j++) {
                    mapaTemperaturas[i][j] = lerDoFicheiro.nextInt();
                }
            }
        }
        lerDoFicheiro.close();
        return mapaTemperaturas;
    }

    // -----------------------------------------------------------
    // b) Display temperature map right-aligned
    public static void mostrarMapaTemperatura(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // -----------------------------------------------------------
    // c) Generate alert map from temperature map
    public static String[][] gerarMapaAlertasPeloMapaTemperatura(int[][] matrix) {
        String[][] mapAlertas = new String[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < HIGH) {
                    mapAlertas[i][j] = "M";
                } else if (matrix[i][j] < EXTREME) {
                    mapAlertas[i][j] = "H";
                } else if (matrix[i][j] < CATASTROPHIC) {
                    mapAlertas[i][j] = "E";
                } else {
                    mapAlertas[i][j] = "C";
                }
            }
        }
        return mapAlertas;
    }

    public static void mostrarMapaAlertas(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // -----------------------------------------------------------
    // d) Apply any temperature variation to a matrix (returns a new matrix)
    public static int[][] aplicarVariacaoTemperatura(int[][] matrix, int variacao) {
        int[][] novaMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                novaMatrix[i][j] = matrix[i][j] + variacao;
            }
        }
        return novaMatrix;
    }

    // -----------------------------------------------------------
    // e) Show percentage of each alert level
    public static void mostrarPercentagemAlertas(String[][] matrix) {
        int contModerad = 0, contHigh = 0, contExtreme = 0, contCatastrofic = 0, totalAlertas = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                switch (matrix[i][j]) {
                    case "M": contModerad++;   break;
                    case "H": contHigh++;      break;
                    case "E": contExtreme++;   break;
                    case "C": contCatastrofic++; break;
                }
                totalAlertas++;
            }
        }
        double percentagemModerad    = (double) contModerad    / totalAlertas * 100;
        double percentagemHigh       = (double) contHigh       / totalAlertas * 100;
        double percentagemExtreme    = (double) contExtreme    / totalAlertas * 100;
        double percentagemCatastrofic = (double) contCatastrofic / totalAlertas * 100;

        System.out.printf("%-12s%2s%7.2f%%\n", "MODERATE",     ":", percentagemModerad);
        System.out.printf("%-12s%2s%7.2f%%\n", "HIGH",         ":", percentagemHigh);
        System.out.printf("%-12s%2s%7.2f%%\n", "EXTREME",      ":", percentagemExtreme);
        System.out.printf("%-12s%2s%7.2f%%\n", "CATASTROPHIC", ":", percentagemCatastrofic);
        System.out.println();
    }

    // -----------------------------------------------------------
    // f) How many degrees must rise for ALL terrain to reach CATASTROPHIC
    public static void getCatastrophicTemp(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        int tempRise = CATASTROPHIC - min;
        System.out.println("To get all terrain on CATASTROPHIC alert, the temperature has to rise : " + tempRise + " ºC");
        System.out.println();
    }

    // -----------------------------------------------------------
    // g) Show % of terrain that changed alert level with a temperature variation
    public static void mostrarPercentagemAlertasAlteracao(String[][] mapaComAlteracao, String[][] mapaOriginal, int variacao) {
        int cont = 0, totalcont = 0;

        mostrarMapaAlertas(mapaComAlteracao);

        for (int i = 0; i < mapaOriginal.length; i++) {
            for (int j = 0; j < mapaOriginal[0].length; j++) {
                if (!mapaOriginal[i][j].equals(mapaComAlteracao[i][j])) {
                    cont++;
                }
                totalcont++;
            }
        }
        double variacao_pct = (double) cont / totalcont * 100;
        System.out.printf("Alert Levels changes due to temperature variations by " + variacao + "ºC :");
        System.out.printf(" %.2f%%", variacao_pct);
        System.out.println();
        System.out.println();
    }

    // -----------------------------------------------------------
    // h) Update alert map due to strong wind North->South
    public static String[][] mapaAlertasComAlteracaoVento(String[][] matrix) {
        // Deep copy to avoid mutating the original
        String[][] copia = new String[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                copia[i][j] = matrix[i][j];
            }
        }

        final String valorReferencia = "C";
        final String valorParaAlterar = "E";

        // Wind North->South: a cell becomes C if the cell ABOVE it (i-1) is C
        // Iterate top-to-bottom so propagation cascades correctly
        for (int i = 1; i < copia.length; i++) {
            for (int j = 0; j < copia[i].length; j++) {
                if (copia[i][j].equals(valorParaAlterar) && copia[i - 1][j].equals(valorReferencia)) {
                    copia[i][j] = valorReferencia;
                }
            }
        }
        return copia;
    }

    // -----------------------------------------------------------
    // i) Find ideal coordinates for helicopter water drop
    public static void calcularAreaIdealHelicopetro(int[][] matrix) {
        int posl = 0, posc = 0, somaAreas, maiorAreaArdida = 0;
        mostrarMapaTemperatura(matrix);

        // Check all valid centre positions for a 3x3 area (not on the border)
        for (int lin = 1; lin < matrix.length - 1; lin++) {
            for (int col = 1; col < matrix[lin].length - 1; col++) {
                somaAreas = quantidadeAreasIncendio(matrix, lin, col);
                if (somaAreas > maiorAreaArdida) {
                    maiorAreaArdida = somaAreas;
                    posl = lin;
                    posc = col;
                }
            }
        }
        if (maiorAreaArdida != 0) {
            System.out.println("drop water at (" + posl + " , " + posc + ")");
        } else {
            System.out.println("no fire");
        }
        System.out.println();
    }

    private static int quantidadeAreasIncendio(int[][] matrix, int lin, int col) {
        int areasArder = 0;
        for (int linha = lin - 1; linha <= lin + 1; linha++) {
            for (int coluna = col - 1; coluna <= col + 1; coluna++) {
                if (matrix[linha][coluna] > POTENCIALINCENDIO) {
                    areasArder++;
                }
            }
        }
        return areasArder;
    }

    // -----------------------------------------------------------
    // j) Find the safest column (no C alerts) considering BOTH wind directions
    public static int determinarColunaSegura(String[][] matrix) {
        // Generate wind map North->South
        String[][] ventoNS = mapaAlertasComAlteracaoVento(matrix);

        // Generate wind map South->North (mirror: iterate bottom-to-top)
        String[][] ventoSN = mapaAlertasComAlteracaoVentoSulNorte(matrix);

        final String valorReferencia = "C";

        // Search from East to West (highest column index first)
        for (int j = matrix[0].length - 1; j >= 0; j--) {
            boolean colunaSegura = true;
            for (int i = 0; i < matrix.length; i++) {
                if (ventoNS[i][j].equals(valorReferencia) || ventoSN[i][j].equals(valorReferencia)) {
                    colunaSegura = false;
                    break;
                }
            }
            if (colunaSegura) {
                return j;
            }
        }
        return -1; // No safe column found
    }

    // Helper: wind South->North propagation
    private static String[][] mapaAlertasComAlteracaoVentoSulNorte(String[][] matrix) {
        String[][] copia = new String[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                copia[i][j] = matrix[i][j];
            }
        }

        final String valorReferencia = "C";
        final String valorParaAlterar = "E";

        // Wind South->North: a cell becomes C if the cell BELOW it (i+1) is C
        // Iterate bottom-to-top so propagation cascades correctly
        for (int i = copia.length - 2; i >= 0; i--) {
            for (int j = 0; j < copia[i].length; j++) {
                if (copia[i][j].equals(valorParaAlterar) && copia[i + 1][j].equals(valorReferencia)) {
                    copia[i][j] = valorReferencia;
                }
            }
        }
        return copia;
    }

    public static void mostrarColunaSegura(int colunaSegura) {
        if (colunaSegura >= 0) {
            System.out.println("safe column = (" + colunaSegura + ")");
        } else {
            System.out.println("safe column = NONE");
        }
    }
}
