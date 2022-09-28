import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome_completo;
        int idade;

        System.out.println("Qual seu nome ?");
        nome_completo = input.nextLine();

        System.out.println("Qual seu nome ?");
        idade = input.nextInt();

        System.out.println("Olá " + nome_completo + "Sua Idade" + idade);

        input.close();
    }

}
