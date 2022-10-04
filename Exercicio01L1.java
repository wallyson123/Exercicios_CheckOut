import java.util.Scanner;

public class Exercicio01L1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println(" Qual seu nome ? ");
        nome = input.nextLine();
        System.out.println(" Qual sua idade ? ");
        idade = input.nextInt();

        System.out.println("Olá " + nome + "Você tem a idade de : " + idade);

        input.close();

    }

}
