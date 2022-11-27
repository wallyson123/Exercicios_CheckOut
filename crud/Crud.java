import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    public static void linhas() {
        System.out.println(" --------------------------------------- ");
    }
    public static void Alunos() {
        System.out.println(" ---------Lista de Alunos Atualizada-------- ");
    }

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Integer> idades = new ArrayList<Integer>();
        ArrayList<String> faculdades = new ArrayList<String>();

        Scanner input = new Scanner(System.in);

        while (true) {
            String nome;
            int idade;
            String faculdade;
            linhas();
            System.out.println("               Digite a opcao");
            linhas();
            System.out.println("            1- Cadastrar Aluno");
            System.out.println("        2- Buscar Aluno Cadastrado");
            System.out.println("            3- Lista de alunos");
            System.out.println("             4- Remover Aluno");
            System.out.println("                 5- Sair ! ");
            Alunos();
            System.out.println("" + nomes);
            linhas();
            int opcao = input.nextInt();

            // CREATE
            if (opcao == 1) {
                linhas();
                System.out.println("Nome do aluno:");
                nome = input.next();
                linhas();
                System.out.println("Idade do aluno:");
                idade = input.nextInt();
                linhas();
                System.out.println("Faculdade do aluno:");
                faculdade = input.next();
                linhas();


                nomes.add(nome);
                idades.add(idade);
                faculdades.add(faculdade);
                

                System.out.println("      Aluno Cadastrado com Sucesso");

                // READ
            } else if (opcao == 2) {
                linhas();
                System.out.println("Digite o nome do aluno");
                nome = input.next();
                linhas();

                for (int i = 0; i < nomes.size(); i++) {
                    String nomeLista = nomes.get(i);
                    if (nomeLista.equals(nome)) {
                        linhas();
                        System.out.println("     <(@_@)> Aluno Encontrado <(@_@)> ");
                        linhas();
                        System.out.println("          --- Nome do aluno --- ");
                        System.out.println("------------>> "+nome);
                        linhas();
                        int idadeBusca = idades.get(i);
                        System.out.println("         --- Idade Cadastrada ---  ");
                        System.out.println("----------------->> "+idadeBusca);
                        linhas();
                        String faculdadeBusca = faculdades.get(i);
                        System.out.println("       --- Faculdade Cadastrada ---" );
                        System.out.println("--------------->> "+faculdadeBusca);
                        break;
                    }
                }
            } else if (opcao == 3) {
                linhas();
                Alunos();
                System.out.println(nomes);
                linhas();

            } else if (opcao == 4) {
                System.out.print("Informe o número do aluno que deseja remover: ");
                opcao = input.nextInt();
                while (opcao > nomes.size()) {
                    System.out.println("Ao todo são " + (nomes.size()) + " alunos.");
                    System.out.print("Informe um número entre 1 e " + (nomes.size()) + " : ");
                    opcao = input.nextInt();
                }
                linhas();
                System.out.println("      Aluno removido: " + nomes.get(opcao - 1));
                nomes.remove(opcao - 1);
                linhas();
                Alunos();
                System.out.println(nomes);

            } else {
                System.out.println("Programa finalizado , Obrigado pelo questionario!");
                break;
            }

        }

        input.close();

    }

}