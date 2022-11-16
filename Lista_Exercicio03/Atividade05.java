import java.util.ArrayList;
import java.util.Scanner;

public class Atividade05 {
    public static void lin() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public static void lerArr(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + " - " + lista.get(i));
        }
    }

    public static void listMaior(int opc, ArrayList<String> lista) {
        Scanner input = new Scanner(System.in);
        while (opc > lista.size()) {
            System.out.println("Ao todo são " + (lista.size()) + " alunos.");
            System.out.print("Informe um número entre 1 e " + (lista.size()) + ": ");
            opc = input.nextInt();
        }
        input.close();
    }

    public static void opcoes() {
        System.out.println("Informe o que deseja fazer:");
        System.out.println("Digite 1 para adicionar um novo aluno;");
        System.out.println("Digite 2 para visualizar um aluno;");
        System.out.println("Digite 3 para editar o nome de um aluno;");
        System.out.println("Digite 4 para remover um aluno:");
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int i, opcao;
            ArrayList<String> alunos = new ArrayList<String>();

            for (i = 0; i < 5; i++) {
                alunos.add("Aluno_" + (i + 1));
            }

            lin();
            System.out.println("Lista dos alunos:");
            lerArr(alunos);
            lin();
            opcoes();
            lin();
            opcao = input.nextInt();

            while (opcao > 4 || opcao < 1) {
                System.out.println("Opção inválida!");
                System.out.print("Escolha um número entre 1 e 4: ");
                opcao = input.nextInt();
            }

            if (opcao == 1) {
                System.out.print("Informe o nome do aluno que deseja adicionar: ");
                alunos.add(input.next());
                lin();
                System.out.println("Lista atualizada:");
                lerArr(alunos);
            } else if (opcao == 2) {
                System.out.print("Informe o número do aluno que deseja visualizar: ");
                opcao = input.nextInt();
                while (opcao > alunos.size()) {
                    System.out.println("Ao todo são " + (alunos.size()) + " alunos.");
                    System.out.print("Informe um número entre 1 e " + (alunos.size()) + ": ");
                    opcao = input.nextInt();
                }
                System.out.println("Este é o aluno selecionado: " + alunos.get(opcao - 1));
            } else if (opcao == 3) {
                String ed;
                System.out.print("Informe o número do aluno que deseja editar: ");
                opcao = input.nextInt();
                while (opcao > alunos.size()) {
                    System.out.println("Ao todo são " + (alunos.size()) + " alunos.");
                    System.out.print("Informe um número entre 1 e " + (alunos.size()) + ": ");
                    opcao = input.nextInt();
                }
                System.out.println("Aluno editado: " + alunos.get(opcao - 1));
                System.out.print("Informe o novo nome para o aluno: ");
                ed = input.next();
                alunos.set(opcao - 1, ed);
                lin();
                System.out.println("Lista atualizada:");
                lerArr(alunos);
            } else if (opcao == 4) {
                System.out.print("Informe o número do aluno que deseja remover: ");
                opcao = input.nextInt();
                while (opcao > alunos.size()) {
                    System.out.println("Ao todo são " + (alunos.size()) + " alunos.");
                    System.out.print("Informe um número entre 1 e " + (alunos.size()) + ": ");
                    opcao = input.nextInt();
                }
                System.out.println("Aluno removido: " + alunos.get(opcao - 1));
                alunos.remove(opcao - 1);
                lin();
                System.out.println("Lista atualizada:");
                lerArr(alunos);
            }
            lin();
        }
    }
}
