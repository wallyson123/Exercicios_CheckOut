import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float numero01;
        float numero02;

        double resposta01;
        double resposta02;

        System.out.println("Valor de A : ");
        numero01 = input.nextFloat();

        System.out.println("Valor de B ");
        numero02 = input.nextFloat();

        if (numero01 > numero02) {
            resposta01 = numero01 + numero02;
            System.out.println("A e maior que B: " + resposta01 + "Calculo A + B ");
        } else if (numero01 < numero02) {
            resposta02 = numero01 * numero02;

            System.out.println("A e menor que B :  " + resposta02 + " Calculo A * B");
        } else {
            System.out.println("A = B ");

            input.close();
        }

    }

}
