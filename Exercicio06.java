import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float valor01;
        int valor02;
        int parc = 1;

        double resposta;

        System.out.println("Informe valor do produto");
        valor01 = input.nextFloat();

        System.out.println("Qual forma de pagamento ?");
        System.out.println("Digite 1 para : A Vista, Pix, Débito, tem 10% Desconto.");
        System.out.println("Digite 2 para : Crédito a vista, preço normal.");
        System.out.println("Digite 3 para : Crédito parcelado ---com juros.");

        valor02 = input.nextInt();

        if (valor02 == 1) {
            resposta = valor01 - (valor01 * 0.1f);
            System.out.println("Opção 01 você obteve 10% Desconto.");
            System.out.println("Valor do produto R$ :" + valor01 + " Valor final : " + resposta);

        } else if (valor02 == 2) {
            System.out.println("Opção 02 produtos com preço normal.");
            System.out.println(" Valor do produto  : " + valor01);
        } else if (valor02 == 3) {
            System.out.println("Opção 3 Parcelamentos em até 12x - Informe a quantidade de parcelas !");
            parc = input.nextInt();
            resposta = valor01 + (valor01 * 0.1f * parc);
            System.out.println(
                    "Valor R$ " + valor01 + " Dividiu " + parc + " Parcelas, Com acrescimo : Total de R$" + resposta);
        }

        input.close();

    }

}
