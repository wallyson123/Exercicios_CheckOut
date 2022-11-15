package Lista_Exercicios03;

import java.util.Scanner;

public class Atividade01 {
    public static void teste() {
        System.out.println("*&*&*&*&*&*&*&*&*&*&*&*&*&*&");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeral = new int[5];
        String name;

        System.out.println("Aluno digite aqui seu nome");
        name = input.next();

        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + name + " Digite o número " + (i + 1));
            numeral[i] = input.nextInt();
        }

        teste();

        System.out.print("Numeros inteiros = - ");
        for (int i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.print(numeral[i] + ", ");
            } else {
                System.out.print(numeral[i]);
            }
        }
        System.out.println(" - ");

        System.out.println("Prezado " + name + " Obrigado por Responder ! Ate breve");
        teste();
    }
}