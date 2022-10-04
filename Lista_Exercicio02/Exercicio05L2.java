import java.util.Scanner;

public class Exercicio05L2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;

        System.out.println("Qual seu nome ? ");
        nome = input.nextLine();

        System.out.println(" Por favor " + nome + " Digite um numero aqui ");

        int numeros = input.nextInt();

        input.close();

        System.out.println();
        for (int alto = 1; alto <= numeros; alto++) {
            // espacos entre eles
            for (int espacos = 1; espacos <= numeros - alto; espacos++) {
                System.out.print("");
            }
            for (int asteriscos = 1; asteriscos <= (alto * 2) - 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
