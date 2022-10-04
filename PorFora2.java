import java.util.Scanner;

public class PorFora2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // fazer um programa que imprima
        // a média aritmética dos números 8,9 e 7. A média dos
        // números 4, 5 e 6. A soma das duas médias. A média das médias

        int saldo;
        String nome;

        System.out.println("Qual seu nome ?");
        nome = input.nextLine();
        System.out.println("Olá " + nome + " Digite aqui um numero e calcule com + 1 %");
        saldo = input.nextInt();

        double resultado;

        resultado = saldo * 1;

        System.out.println("Resultado de sua pesquisa " + resultado);
        System.out.println("Olá " + nome + "Obrigado por responder a pesquisa !");

        input.close();
    }

}
