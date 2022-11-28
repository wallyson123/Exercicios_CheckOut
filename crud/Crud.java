import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    public static void linhas() {
        System.out.println("    --------------------------------------- ");
    }
    public static void Alunos() {
        System.out.println("  ---------Lista de Alunos Atualizada-------- ");
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
            System.out.println("\033[32m               Digite a opcao");
            linhas();
            System.out.println("            1- Cadastrar Aluno");
            System.out.println("        2- Buscar Aluno Cadastrado");
            System.out.println("            3- Lista de alunos");
            System.out.println("             4- Editar Aluno");
            System.out.println("             5- Remover Aluno");
            System.out.println("                 6- Sair ! ");

            System.out.println("Apenas numeros - 1 , 2 , 3 , 4 , 5 , 6 ! Presta atenção tabacudo");
            Alunos();
            for (int j = 0; j < nomes.size(); j++) {
                System.out.println((j + 1) + " - " + nomes.get(j));
            }
            linhas();
            int opcao = input.nextInt();

            while (opcao > 6 || opcao < 1) {
                System.out.println("Opção inválida!");
                System.out.print("Escolha um número entre 1 e 6: ");
                opcao = input.nextInt();
            }
            // CREATE
            if (opcao == 1) {
                linhas();
                System.out.println("\033[30;40mNome do aluno:");
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
                

                System.out.println("\033[34m      Aluno Cadastrado com Sucesso");

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
                        System.out.println("\033[33m     <(@_@)> Aluno Encontrado <(@_@)> ");
                        linhas();
                        System.out.println("\033[33m          --- Nome do aluno --- ");
                        System.out.println("  ------------>> "+nomeLista);
                        linhas();
                        int idadeBusca = idades.get(i);
                        System.out.println("\033[33m         --- Idade Cadastrada ---  ");
                        System.out.println("----------------->> "+idadeBusca);
                        linhas();
                        String faculdadeBusca = faculdades.get(i);
                        System.out.println("\033[33m       --- Faculdade Cadastrada ---" );
                        System.out.println("-------------->> "+faculdadeBusca);
                    }
                }
            } else if (opcao == 3) {
                linhas();
                Alunos();
                for (int j = 0; j < nomes.size(); j++) {
                    System.out.println((j + 1) + " - " + nomes.get(j));
                }
                linhas();


            } else if (opcao == 4) {
                String editor;
                linhas();
                System.out.print("\033[34m Informe o número do aluno que deseja editar: ");
                opcao = input.nextInt();
                while (opcao > nomes.size()) {
                    linhas();
                    System.out.println("\033[34m Ao todo são " + (nomes.size()) + " alunos.");
                    System.out.print("Informe um número entre 1 e " + (nomes.size()) + ": ");
                    opcao = input.nextInt();
                }
                linhas();
                System.out.println("\033[34m Pronto aluno selecionado : " + nomes.get(opcao - 1));
                linhas();
                System.out.print("\033[34m Informe o novo nome para o aluno: ");
                editor = input.next();
                nomes.set(opcao - 1, editor);
                linhas();

                System.out.println("Agora mude a instituição ");
                linhas();
                System.out.println("\033[34m Pronto Instituição selecionado : " + faculdades.get(opcao - 1));
                linhas();
                System.out.print("\033[34m Informe a nova instituição : ");
                editor = input.next();
                faculdades.set(opcao - 1, editor);
                linhas();


            } else if (opcao == 5) {
                System.out.print("Informe o número do aluno que deseja remover: ");
                opcao = input.nextInt();
                while (opcao > nomes.size()) {
                    System.out.println("Ao todo são " + (nomes.size()) + " alunos.");
                    System.out.print("Informe um número entre 1 e " + (nomes.size()) + " : ");
                    opcao = input.nextInt();
                }
                linhas();
                System.out.println("         Aluno removido: " + nomes.get(opcao - 1));
                nomes.remove(opcao - 1);
                linhas();

            } else if(opcao == 6){
                System.out.println("Programa finalizado , Obrigado pelo questionario!");
                break;
            }

        }

        input.close();

    }

}