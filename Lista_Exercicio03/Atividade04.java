import java.util.Scanner;

public class Atividade04 {
    public static void teste() {
        System.out.println("<@_@> - Atividade 04");
    }

    public static void pegarMatriz(int[][] mtz) {
        Scanner input = new Scanner(System.in);
        int i, j;

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print("Posição[" + i + ", " + j + "]:");
                mtz[i][j] = input.nextInt();
            }
        }
    }

    public static void lerMatriz(int[][] mtz) {
        int i, j;

        for (i = 0; i < 2; i++) {
            System.out.print("|");
            for (j = 0; j < 2; j++) {

                if (j < mtz[j].length - 1) {
                    System.out.print(mtz[i][j] + ", ");
                } else {
                    System.out.print(mtz[i][j]);
                }
            }
            System.out.println("|");
        }
    }

    public static void mtzXmtz(int[][] mtza, int[][] mtzb) {
        int i, j;
        int[][] mtzX = new int[2][2];

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                mtzX[i][j] = mtza[i][j] * mtzb[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int i, j;
        int[][] mtz1 = new int[2][2];
        int[][] mtz2 = new int[2][2];
        int[][] mtzX = new int[2][2];

        teste();
        System.out.println("Preencha os dados da Matriz 1:");
        pegarMatriz(mtz1);
        teste();
        System.out.println("Preencha os dados da Matriz 2:");
        pegarMatriz(mtz2);
        teste();
        System.out.println("Matriz 1:");
        lerMatriz(mtz1);
        System.out.println("Matriz 2:");
        lerMatriz(mtz2);
        teste();
        System.out.println("MatrizX = Matriz1 X Matriz2:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                mtzX[i][j] = mtz1[i][j] * mtz2[i][j];
            }
        }
        lerMatriz(mtzX);
    }
}