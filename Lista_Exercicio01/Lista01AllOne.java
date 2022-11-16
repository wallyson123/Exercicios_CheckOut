
import java.util.Scanner;

public class Lista01AllOne {
    public static void pronuncia() {
        System.out.println(" <@_@> =Lista=01=All=In=One= <@_@> ");
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

        String nome;
        int idade;

        System.out.println("------------ Exercicio 01 ------------");
        System.out.println("Faça um programa que recebe o seu nome e sua idade,");
        System.out.println("e então mostrará uma mensagem de saudação Olá NOME_COMPLETO, você tem IDADES anos");

        pronuncia();
        System.out.println(" Qual seu nome ? ");
        nome = input.nextLine();
        System.out.println(" Qual sua idade ? ");
        idade = input.nextInt();

        linharesposta();
        System.out.println("Olá " + nome + " Você tem a idade de : " + idade);
        linharesposta();
        // String name;
        // System.out.println(" Exercicio 02 , Digite Sim para Continuar ! ");
        // name = input.next();

        // if (name == "sim") {

        System.out.println("------------ Exercicio 02 ------------");
        System.out.println("Faça um programa que pegue dois valores e mostra a soma deles.");

        System.out.println("Olá " + nome + " Continue para o Exercicio 02");
        linha();
        int numero1;
        int numero2;
        int resposta;

        System.out.println("Olá " + nome + " Digite aqui um numero ! ");
        numero1 = input.nextInt();

        System.out.println("Olá " + nome + " Digite aqui outro numero ! ");
        numero2 = input.nextInt();

        resposta = numero1 + numero2;
        linharesposta();
        System.out.println(" Soma dos numeros são : " + resposta);
        linharesposta();

        System.out.println("------------ Exercicio 03 ------------");
        System.out.println("Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar.");

        System.out.println("Olá " + nome + " Continue para o Exercicio 03");
        linha();

        int numero;

        System.out.println("Olá " + nome + " Digite aqui um numero ! ");
        numero = input.nextInt();
        // solução se par ou impar.
        if (numero % 2 == 0) {
            linharesposta();
            System.out.println("o Numero é " + numero + " é par ");
            linharesposta();
        } else {
            linharesposta();
            System.out.println("o Numero é " + numero + " é impar ");
            linharesposta();
        }

        System.out.println(" -------- Exercicio 04 ------------");
        System.out.println(
                "Faça um algoritmo que leia dois valores inteiros A e B. Se A for o número maior, deverá somar os");
        System.out.println(
                "dois números, caso B seja maior que A, então multiplicará os dois valores. Ao final de qualquer um dos ");
        System.out.println(
                "cálculos deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela, e informar qual foi o caminho utilizado.");

        System.out.println("Olá " + nome + " Continue para o Exercicio 04");
        linha();
        float numero10;
        float numero20;

        System.out.println("Digite o primeiro numero !");
        numero10 = input.nextFloat();
        System.out.println("Digite o Segundo numero !");
        numero20 = input.nextFloat();

        float soma;

        if (numero10 == numero20) {
            linharesposta();
            System.out.println("Olá " + nome + " Os valores são iguais , digite numeros diferentes!!");
            linharesposta();
        }
        if (numero10 > numero20) {
            soma = numero10 + numero20;
            linharesposta();
            System.out.println("Olá " + nome + " Numero 1 foi maior que 2 : Logo sera somado A + B " + soma);
            linharesposta();
        } else if (numero10 < numero20) {
            soma = numero10 * numero20;
            linharesposta();
            System.out.println("Olá " + nome + " Numero 1 menor que numero 2 : Logo Multiplicara B * A " + soma);
            linharesposta();
        }

        System.out.println(" -------- Exercicio 05 ------------");
        System.out.println("Receba um número e encontre o dobro dele caso ele seja positivo e o seu");
        System.out.println("triplo caso seja negativo, imprimindo o resultado.");

        System.out.println("Olá " + nome + " Continue para o Exercicio 06");
        linha();
        float valor01;
        double resultadoexercicio5;

        System.out.println("Qual o numero ?");

        valor01 = input.nextFloat();

        if (valor01 > 0) {
            resultadoexercicio5 = valor01 + valor01;
            System.out.println("O Número informado é " + valor01 + " o dobro desse valor e " + resultadoexercicio5);

        } else {
            resultadoexercicio5 = valor01 * 3;
            System.out.println("O Número informado é " + valor01 + " o triplo desse valor e " + resultadoexercicio5);
        }

        System.out.println(" -------- Exercicio 06 ------------");
        System.out.println("Elaborar um algoritmo que calcula o valor final de um produto com base na forma");
        System.out.println("de pagamento escolhida, caso escolhe parcelado, solicitar também a quantidade de parcelas");
        System.out.println(" ' A ' A vista, pix, débito: 10% de desconto;");
        System.out.println(" ' B ' Crédito a vista, preço normal;");
        System.out.println(" ' C ' Crédito parcelado, aplicado Juros Simples com taxa de 10% ao mês");
        System.out.println(
                " ' D ' Fórmula J = C * i * t, onde C=valor original, i=taxa de juros 0,01 nesse caso e t=quantidade de parcelas;");
        System.out.println("Olá " + nome + " Continue para o Exercicio 06");
        linha();

        float valor06;
        int valor07;
        int parc = 1;

        double respostaexercicio6;

        System.out.println(" Informe valor do produto ");
        valor06 = input.nextFloat();

        System.out.println("Qual forma de pagamento ?");
        System.out.println("Digite 1 para : A Vista, Pix, Débito, tem 10% Desconto.");
        System.out.println("Digite 2 para : Crédito a vista, preço normal.");
        System.out.println("Digite 3 para : Crédito parcelado ---com juros.");

        valor07 = input.nextInt();

        if (valor07 == 1) {
            respostaexercicio6 = valor06 - (valor06 * 0.1f);
            linharesposta();
            System.out.println("Opção 01 você obteve 10% Desconto.");
            System.out.println("Valor do produto R$ :" + valor06 + " Valor final : " + respostaexercicio6);
            linharesposta();

        } else if (valor07 == 2) {
            linharesposta();
            System.out.println("Opção 02 produtos com preço normal.");
            System.out.println(" Valor do produto  : " + valor06);
            linharesposta();
        } else if (valor07 == 3) {
            linharesposta();
            System.out.println("Opção 3 Parcelamentos em até 12x - Informe a quantidade de parcelas !");
            parc = input.nextInt();
            respostaexercicio6 = valor06 + (valor06 * 0.1f * parc);
            System.out.println("Valor R$ " + valor06 + " Dividiu " + parc + " Parcelas, Com acrescimo : Total de R$"
                    + respostaexercicio6);
            linharesposta();
        }

        System.out.println(" -------- Exercicio 07 ------------");
        System.out.println(
                "Escreva um algoritmo que irá pegar as três notas do aluno aplicando a seguinte fórmula para Média abaixo, e então imprimir na tela o conceito final do aluno junto com a mensagem de APROVADO caso conceito A, B ou C ou REPROVADO caso conceito D ou E Média = nota1 + nota2*2 + nota3*3 / 6 Conceitos");
        System.out.println(
                "Média >= 90 -> A Média >= 75 e < 90 B Média >= 60 e < 75 C Média >= 40 e < 60 D Média < 40 E");

        System.out.println("Olá " + nome + " Continue para o Exercicio 07");
        linha();

        float nota01;
        float nota02;
        float nota03;

        System.out.println("Diga-me sua primeira nota " + nome);
        nota01 = input.nextFloat();
        System.out.println("Diga-me sua segunda nota " + nome);
        nota02 = input.nextFloat();
        System.out.println("Diga-me sua terceira nota " + nome);
        nota03 = input.nextFloat();

        // Calculando media --- Barney DLL - Walisson Soares
        float media = (nota01 + nota02 * 2 + nota03 * 3) / 6;
        String notafinal = " ";

        if (media >= 60) {
            if (media >= 90) {
                notafinal = "A";
            } else if (media >= 75) {
                notafinal = "B";
            } else if (media >= 60) {
                notafinal = "C";
            }
            linharesposta();
            System.out.println("Olá " + nome + " Com média de : " + media + " Você obteve a seguinte nota : "
                    + notafinal + " Parabéns, APROVADO");
            linharesposta();
        } else {
            if (media >= 40) {
                notafinal = "C";
            } else {
                notafinal = "D";
            }
            linharesposta();
            System.out.println(
                    "Olá " + nome + " Com média de : " + media + " Você obteve nota de : " + notafinal
                            + " Portando, REPROVADO ! Tente novamente.");
            linharesposta();
        }

        System.out.println(" -------- Exercicio 08 ------------");
        System.out.println(
                "programaConverterTemp: Faça um programa que faça a conversão de graus de Celsius, Fahrenheit e Kelvin. Necessário saber qual a temperatura de origem e de conversão.");
        System.out.println(
                " ' A ' Fórmula Celsius-Fahrenheit : TempC5=TempF - 329 ' B  ' Fórmula Celsius-Kelvin: K =  TempC + 273");

        System.out.println("Olá " + nome + " Continue para o Exercicio 08");
        linha();

        double Celsius;
        double Fahrenheit; // eita nome complicado viu aushaush/

        System.out.println(" Conversor Graus Celsius para Fahrenheit ");

        System.out.println("Qual temperatura em Celsius : ");
        Celsius = input.nextDouble();

        Fahrenheit = (9 * Celsius + 160) / 5;

        System.out.println(" Conversão : " + Fahrenheit + " °F ");

        System.out.println(" -------- Exercicio 09 ------------");
        System.out.println(
                "ProgramaCalculadoraSimples: Faça um programa que receba dois números e a operação desejada de cálculo, então mostrará o resultado da operação");
        System.out.println(
                " ' Soma ' ' Subtração ' ' Divisão ' ' Multiplicação '");

        System.out.println("Olá " + nome + " Continue para o Exercicio 09");
        linha();

        int tipo1;
        int tipo2;

        System.out.println(" Olá " + nome + " Digite agora : Primeiro");
        tipo1 = input.nextInt();
        System.out.println(" Olá " + nome + " Digite Agora : Segundo");
        tipo2 = input.nextInt();

        linharesposta();
        System.out.println("Soma : " + (tipo1 + tipo2));
        System.out.println("Subtração : " + (tipo1 - tipo2));
        System.out.println("Multiplicação : " + (tipo1 * tipo2));
        System.out.println("Divisão : " + (tipo1 / tipo2));
        linharesposta();

        pronuncia();

        input.close();
    }
}