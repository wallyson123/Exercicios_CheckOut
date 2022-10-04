import java.util.Scanner;

public class Exercicio09L1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tipo1;
        int tipo2;
        String nome;

        System.out.println("Qual seu nome ?");
        nome = input.nextLine();

        System.out.println(" Olá " + nome + " Digite agora : Primeiro");
        tipo1 = input.nextInt();
        System.out.println(" Olá " + nome + " Digite Agora : Segundo");
        tipo2 = input.nextInt();

        System.out.println("Soma : " + (tipo1 + tipo2));
        System.out.println("Subtração : " + (tipo1 - tipo2));
        System.out.println("Multiplicação : " + (tipo1 * tipo2));
        System.out.println("Divisão : " + (tipo1 / tipo2));

        System.out.println("Obrigado pela pesquisa ! " + nome);

        input.close();

    }

}
