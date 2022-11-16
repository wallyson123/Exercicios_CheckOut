import java.util.Scanner;

public class Lista02AllOne {
    public static void pronuncia() {
        System.out.println(" <@_@> =Lista=02=All=In=One= <@_@> ");
    }

    public static void agradecimento() {
        System.out.println(" <@_@> = Até breve , Obrigado ! = <@_@> ");
    }

    public static void linha() {
        System.out.println(" <-_-><-_-><-_-><-_-><-_-><-_->");
    }

    public static void linharesposta() {
        System.out.println(" ----------Resposta----------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" -------------- Lista Exercicios 02 --------------");
        System.out.println(
                " Faça um programa que recebe as algumas características de um veículo e, com base nas informações, informar a categoria necessária para dirigir/pilotar o veículo:");
        System.out.println(
                "Informações necessárias: 1 - Quantidade de rodas; 2- Peso bruto do veículo, em kgs; 3- Quantidade de pessoas no veículo;");

        int peso;
        String nome;
        int veiculo;
        int pessoas;

        pronuncia();
        System.out.println("Olá Motorista , informe seu nome !");
        nome = input.nextLine();
        linha();
        System.out.println("Qual veiculo deseja utilizar ? Informe a quantidade de rodas Aqui !");
        veiculo = input.nextInt();
        linha();
        System.out.println("Qual quantidade de pessoas ?");
        pessoas = input.nextInt();
        linha();
        System.out.println("Qual o peso do veiculo suportado");
        peso = input.nextInt();
        linha();

        String categoria = "";

        if (veiculo <= 3) {
            categoria = "A - MOTO ou TRICICLO";
        } else if (veiculo <= 4)
            if (pessoas >= 4)
                if (peso <= 3500) {
                    categoria = "B - CARRO";
                } else if (veiculo >= 4)
                    if (peso <= 6000) {
                        categoria = "C - Carga ";
                    } else if (veiculo >= 4)
                        if (pessoas >= 8) {
                            categoria = "D - Micro-Onibus";
                        } else if (veiculo >= 4)
                            if (peso >= 6000) {
                                categoria = "E - Geral é mais um pouco";
                            }
        linharesposta();
        System.out.println("Olá " + nome + " Sua categoria atual : " + categoria + " Quantidade de passageiros de "
                + pessoas);
        linharesposta();

        linha();
        System.out.println(" Continue para o Exercicio de numero 02 ");
        linha();

        System.out.println("Escrever um algoritmo que gera e escreve os números ímpares entre 100 e 200.");
        int maximo;
        System.out.println("Digite aqui o numero é veja os impares dele ");
        maximo = input.nextInt();

        for (int i = 0; i < maximo; i++) {
            if ((i % 2) != 0)
                System.out.println("Olá " + nome + " Os números ímpares são " + i);
        }
        linha();
        System.out.println(" Continue para o Exercicio de numero 03");
        linha();

        System.out.println(
                "Desenvolva um algoritmo que pegue os valores de idades de 12 pessoas pegando pelo terminal e, então, informar a idade mais velha e o mais novo.");

        int maior = 0, menor = 0, idade = 0;

        for (int j = 1; j < 13; j++) {
            System.out.println("Olá " + nome + " Digite aqui " + j + " idades distintas ");
            idade = input.nextInt();

            if (j == 1) {
                maior = idade;
                menor = idade;
            } else {
                if (idade > maior) {
                    maior = idade;
                } else if (idade < menor) {
                    menor = idade;
                }
            }
        }

        linharesposta();
        System.out.println("Prezado " + nome + " Idade Maior digitada : " + maior + " Menor idade digitada " + menor);
        linharesposta();

        linha();
        System.out.println(" Continue para o Exercicio de numero 04");
        linha();

        System.out.println("Faça um programa que peça o número e, então, mostre a tabuada do número.");
        int numero;

        linha();
        System.out.println("Digite o numero");
        numero = input.nextInt();
        linha();

        if (numero == 0) {
            System.out.println("Numero invalido , informe um numero diferente de 0");
        } else {
            // 12 x 1 = 12 exemplo
            linharesposta();
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + i * numero);
            }
        }

        linha();
        System.out.println(" Continue para o Exercicio de numero 04");
        linha();

        System.out.println(
                "Faça um algoritmo que, após selecionar a quantidade de níveis, vai imprimir uma lista de asteriscos ' * ' em forma de escada");

        linha();
        System.out.println(" Por favor " + nome + " Digite um numero aqui ");
        int numeros = input.nextInt();
        linha();

        System.out.println();
        for (int alto = 1; alto <= numeros; alto++) {
            // espacos entre eles
            for (int espacos = 1; espacos <= numeros - alto; espacos++) {
                System.out.print(" ");
            }
            for (int asteriscos = 1; asteriscos <= (alto * 2) - 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        agradecimento();
        input.close();
    }
}
