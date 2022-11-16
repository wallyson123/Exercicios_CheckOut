package Lista_Exercicios03;

import java.util.Scanner;

public class Atividade03 {
    public static void teste() {
        System.out.println("-----<@_@> - Atividade 03------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeral = new int[10];

        String name;

        teste();
        System.out.println("Digite aqui seu nome ");
        name = input.next();
        for (int i = 0; i < numeral.length; i++) {
            System.out.println("Informe 10 Numeros diferentes " + (i + 1));
            numeral[i] = input.nextInt();

        }

        teste();
        System.out.println("-------------Numeros Digitados -------------");
        System.out.print(" --- ");
        for (int i = 0; i < numeral.length; i++) {
            if (i < (numeral.length - 1)) {
                System.out.print(numeral[i] + ", ");
            } else {
                System.out.print(numeral[i]);
            }
        }
        System.out.println(" --- ");
        teste();
        for (int j = 0; j < numeral.length; j++)
            if ((numeral[j] % 2) == 0)
                System.out.println(" Numeros pares digitados " + numeral[j]);
        System.out.println("Olá " + name + " Obrigado por responder a pesquisa ");

        input.close();
    }
}
