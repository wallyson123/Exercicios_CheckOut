import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Celsius;
        double Fahrenheit; // eita nome complicado viu aushaush/

        System.out.println("Conversor Graus Celsius para Fahrenheit ");

        System.out.println("Qual temperatura em Celsius : ");
        Celsius = input.nextDouble();

        Fahrenheit = (9 * Celsius + 160) / 5;

        System.out.println(" Conversão : " + Fahrenheit + " °F ");

        input.close();
    }

}
