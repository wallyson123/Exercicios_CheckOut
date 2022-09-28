import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float valor01;
        double resposta;

        System.out.println("Qual o numero ?");

        valor01 = input.nextFloat();

        if (valor01 > 0) {
            resposta = valor01 * valor01;
            System.out.println("O Número informado é " + valor01 + " o dobro desse valor e " + resposta);

        } else {
            resposta = valor01 * 3;
            System.out.println("O Número informado é " + valor01 + " o triplo desse valor e " + resposta);
        }

        input.close();

    }

}
