import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero01;
        int numero02;
        int ano;

        System.out.println("Qual seu ano de nascimento ?");
        numero01 = input.nextInt();

        System.out.println("Qual ano atual ? ");
        numero02 = input.nextInt();

        // calculo

        ano = 2022 - numero01;

        System.out.println(" Sua idade é " + ano + " Ano Atual : " + numero02);

        input.close();

    }

}
