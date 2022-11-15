import java.util.Scanner;

public class PorFora2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo;
        String nome;

        System.out.println("Qual seu nome ?");
        nome = input.nextLine();
        System.out.println("Olá " + nome + " Digite aqui um numero e calcule com + 1 %");
        saldo = input.nextInt();

        double resultado;

        resultado = saldo * 1.1;

        System.out.println("Resultado de sua pesquisa " + resultado);
        System.out.println("Olá " + nome + "Obrigado por responder a pesquisa !");

        input.close();
    }

}
