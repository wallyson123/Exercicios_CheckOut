import java.util.Scanner;

public class Exercicio04L1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float numero1;
        float numero2;
        String nome;

        System.out.println("Qual seu nome ?");
        nome = input.nextLine();

        System.out.println("Digite o primeiro numero !");
        numero1 = input.nextFloat();
        System.out.println("Digite o Segundo numero !");
        numero2 = input.nextFloat();

        float soma;

        if (numero1 == numero2) {
            System.out.println("Olá " + nome + " Os valores são iguais , digite numeros diferentes!!");
        }
        if (numero1 > numero2) {
            soma = numero1 + numero2;
            System.out.println("Olá " + nome + " Numero 1 foi maior que 2 : Logo sera somado A + B " + soma);
        } else if (numero1 < numero2) {
            soma = numero1 * numero2;
            System.out.println("Olá " + nome + " Numero 1 menor que numero 2 : Logo Multiplicara B * A " + soma);
        }

        input.close();

    }

}
