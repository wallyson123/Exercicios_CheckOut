import java.util.Scanner;

public class Exercicio02L2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 100; i < 201; i++) {
            if ((i % 2) != 0) {

                System.out.println("thomas");
                System.out.println("Os números ímpares são" + i);

                input.close();
            }

        }

    }

}
