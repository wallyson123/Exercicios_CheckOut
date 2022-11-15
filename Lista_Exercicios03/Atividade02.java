package Lista_Exercicios03;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade02 {

    public static void teste() {
        System.out.println("<@_@> - Atividade 02");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeral = new int[10];

        String name;

        System.out.println(" Aluno digite aqui seu nome");
        name = input.next();
        for (int i = 0; i < numeral.length; i++) {
            System.out.println("Olá " + name + " Informe o número " + (i + 1));
            numeral[i] = input.nextInt();
        }

        teste();
        System.out.print(" Numeros Digitados = -- ");
        for (int i = 0; i < numeral.length; i++) {
            if (i < (numeral.length - 1)) {
                System.out.print(numeral[i] + ", ");
            } else {
                System.out.print(numeral[i]);
            }
        }
        System.out.println(" -- ");

        Arrays.sort(numeral); // ordenando o vetor

        teste();
        System.out.print(" Numeros Crescentes = --- ");
        for (int i = 0; i < numeral.length; i++) {
            if (i < (numeral.length - 1)) {
                System.out.print(numeral[i] + ", ");
            } else {
                System.out.print(numeral[i]);
            }
        }
        System.out.println(" -- ");

        teste();
        System.out.print(" Numeros Decrescentes = --- ");
        for (int i = (numeral.length - 1); i >= 0; i--) {
            if (i > 0) {
                System.out.print(numeral[i] + ", ");
            } else {
                System.out.print(numeral[i]);
            }
        }
        System.out.println(" -- ");

        System.out.println("Prezado " + name + " Obrigado por Responder ! Ate breve");

        input.close();
    }
}