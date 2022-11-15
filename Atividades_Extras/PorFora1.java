import java.util.Scanner;

public class PorFora1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Faça um algoritmo que leia a idade de uma pessoa expressa
        // em anos, meses e dias e mostre-a expressa em dias.
        // Leve em consideração o ano com 365 dias e o mês com 30.
        // Ex: 3 anos, 2 meses e 15 dias = 1170 dias.

        double idade;
        double mes;
        double dias;
        String nome;

        double diasnomes = 30;
        double diasnoanos = 365;

        System.out.println("Qual seu nome ?");
        nome = input.nextLine();
        System.out.println("Qual sua idade ?");
        idade = input.nextDouble();
        System.out.println("Qual mes de nascimento ?");
        mes = input.nextDouble();
        System.out.println("Qual dia de seu nascimento ?");
        dias = input.nextDouble();

        System.out.println("Sua idade é " + idade);
        System.out.println("Seu mes é " + mes);
        System.out.println("Dia de nascimento " + dias);

        System.out.println("Obrigado por responder a pesquisa " + nome);

        // Calculando em dias data nascimento
        double resultado;

        resultado = (idade * diasnoanos) + (mes * diasnomes) + (dias);

        System.out.println("Quantidade de minutos na sua da de nascimento" + resultado);

        input.close();

    }

}
