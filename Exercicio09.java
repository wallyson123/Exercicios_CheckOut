import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tipo1;
        int tipo2;

        System.out.println("Digite agora : Primeiro");
        tipo1 = input.nextInt();
        System.out.println("Digite Agora : Segundo");
        tipo2 = input.nextInt();

        System.out.println("Soma : " + (tipo1 + tipo2));
        System.out.println("Subtração : " + (tipo1 - tipo2));
        System.out.println("Multiplicação : " + (tipo1 * tipo2));
        System.out.println("Divisão : " + (tipo1 / tipo2));

        input.close();

    }

}
