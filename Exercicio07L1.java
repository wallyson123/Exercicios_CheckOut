import java.util.Scanner;

public class Exercicio07L1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float nota01;
        float nota02;
        float nota03;
        String nome;

        System.out.println("Qual seu nome ?");
        nome = input.nextLine();
        System.out.println("Diga-me sua primeira nota " + nome);
        nota01 = input.nextFloat();
        System.out.println("Diga-me sua segunda nota " + nome);
        nota02 = input.nextFloat();
        System.out.println("Diga-me sua terceira nota " + nome);
        nota03 = input.nextFloat();

        // Calculando media --- Barney DLL - Walisson Soares
        float media = (nota01 + nota02 * 2 + nota03 * 3) / 6;
        String notafinal = "";

        if (media >= 60) {
            if (media >= 90) {
                notafinal = "A";
            } else if (media >= 75) {
                notafinal = "B";
            } else if (media >= 60) {
                notafinal = "C";
            }
            System.out.println("Olá " + nome + " Com média de : " + media + " Você obteve a seguinte nota : "
                    + notafinal + " Parabéns, APROVADO");
        } else {
            if (media >= 40) {
                notafinal = "C";
            } else {
                notafinal = "D";
            }
            System.out.println(
                    "Olá " + nome + " Com média de : " + media + " Você obteve nota de : " + notafinal
                            + " Portando, REPROVADO ! Tente novamente.");
        }

        input.close();
    }

}
