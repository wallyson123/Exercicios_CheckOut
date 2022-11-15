import java.util.Scanner;

public class Exercicio02L2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;

        int maximo;

        System.out.println("Qual seu nome ?");
        nome = input.nextLine();

        System.out.println("Digite aqui o numero é veja os impares dele ");
        maximo = input.nextInt();

        for (int i = 0; i < maximo; i++) {
            if ((i % 2) != 0) {

                System.out.println("Olá " + nome + " Os números ímpares são " + i);
            }
            System.out.println("Obrigado por responder a pesquisa ");

            input.close();
        }

    }

}
