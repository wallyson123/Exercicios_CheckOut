import java.util.Scanner;

public class Exercicio04L2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // tabuada
        int numero;
        String nome;

        System.out.println("Qual seu nome ?");
        nome = input.nextLine();

        System.out.println("Digite o numero");
        numero = input.nextInt();

        if (numero == 0) {
            System.out.println("Numero invalido , informe um numero diferente de 0");
        } else {
            // 12 x 1 = 12 exemplo
            for (int i = 1; i < 11; i++) {
                System.out.println(numero + " x " + i + " = " + numero * i);
            }
            System.out.println("Olá " + nome + " Tabuada de " + numero);
            input.close();

        }
    }

}
