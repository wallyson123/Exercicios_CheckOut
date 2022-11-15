import java.util.Scanner;

public class Testwhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        String nome;

        int contador = 0;

        while (contador < 5) {
            System.out.println("Qual seu nome ?");
            nome = input.nextLine();
            System.out.println("Idade ! ");
            idade = input.nextInt();

            if (idade >= 18) {
                System.out.println(nome + " é maior de idade " + idade);
            } else {
                System.out.println(nome + " é menor de idade" + idade);
            }
            System.out.println("Até Logo , xau xau !");

            input.close();

        }

    }
}
