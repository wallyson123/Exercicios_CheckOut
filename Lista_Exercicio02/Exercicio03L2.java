import java.util.Scanner;

public class Exercicio03L2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        int idade1;
        int idade2;
        int idade3;
        int idade4;
        int idade5;
        int idade6;
        int idade7;
        int idade8;
        int idade9;
        int idade10;
        int idade11;

        String nome;

        System.out.println(" Digite aqui seu nome ");
        nome = input.nextLine();

        System.out.println("Olá " + nome + " Digite aqui 12 idades distintas de no maximo 99 anos");
        idade = input.nextInt();
        idade1 = input.nextInt();
        idade2 = input.nextInt();
        idade3 = input.nextInt();
        idade4 = input.nextInt();
        idade5 = input.nextInt();
        idade6 = input.nextInt();
        idade7 = input.nextInt();
        idade8 = input.nextInt();
        idade9 = input.nextInt();
        idade10 = input.nextInt();
        idade11 = input.nextInt();

        int menor = idade;
        int maior = idade;

        if (idade1 > maior)
            maior = idade1;
        if (idade2 > maior)
            maior = idade2;
        if (idade3 > maior)
            maior = idade3;
        if (idade4 > maior)
            maior = idade4;
        if (idade5 > maior)
            maior = idade5;
        if (idade6 > maior)
            maior = idade6;
        if (idade7 > maior)
            maior = idade7;
        if (idade8 > maior)
            maior = idade8;
        if (idade9 > maior)
            maior = idade9;
        if (idade10 > maior)
            maior = idade10;
        if (idade11 > maior)
            maior = idade11;

        if (idade1 < menor)
            menor = idade1;
        if (idade2 < menor)
            menor = idade2;
        if (idade3 < menor)
            menor = idade3;
        if (idade4 < menor)
            menor = idade4;
        if (idade5 < menor)
            menor = idade5;
        if (idade6 < menor)
            menor = idade6;
        if (idade7 < menor)
            menor = idade7;
        if (idade8 < menor)
            menor = idade8;
        if (idade9 < menor)
            menor = idade9;
        if (idade10 < menor)
            menor = idade10;
        if (idade11 < menor)
            menor = idade11;

        System.out.println("Prezado " + nome + " Idade Maior digitada : " + maior + " Menor idade digitada " + menor);

        input.close();
    }

}
