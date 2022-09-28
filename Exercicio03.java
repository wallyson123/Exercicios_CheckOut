import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Olá Digite aqui o numeral e descubra se e par ou impar !");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("O Numero digitado " + num + " e par . ");
        } else {
            System.out.println("O numero digitado : " + num + " e impar !");
        }

        input.close();

    }

}
