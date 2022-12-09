import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// pode colocar o retorno em mais de um lugar na função - simula um BREAK para por exemplo sair de um loop antes de ler tudo
// usar arraylist como variavel global
// fazer as operações nas funções
public class Prova2 {

    public static void linha() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    public static void Listagem() {
        System.out.println("\u001B[31m =-=-=-=-=-=-=-=-=-Aluno Adicionado-=-=-=-=-=-=-=-=-=-=-=");
    }

    // verificar se o id do aluno já existe, se sim, retornar o index do id
    public static int idCheck(ArrayList<Integer> lista, int id) {
        int rtn_id = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (id == lista.get(i)) {
                return i;
            }
        }
        return rtn_id;
    }

    public static void main(String[] args) {

        Random random = new Random();
        try (Scanner input = new Scanner(System.in)) {
            int opcao = 0, i, nv_id, rtn_id, falta, rtn_index, id;
            float nt1, nt2;
            String nome, sim_nao;
            ArrayList<Integer> faltas = new ArrayList<Integer>();
            ArrayList<Float> notas1 = new ArrayList<Float>();
            ArrayList<Float> notas2 = new ArrayList<Float>();
            ArrayList<Float> medias = new ArrayList<Float>();
            ArrayList<Integer> ids = new ArrayList<Integer>();
            ArrayList<String> alunos = new ArrayList<String>();
            alunos.add("Daniel");
            alunos.add("Flávio");
            alunos.add("Felipe");
            alunos.add("João");
            alunos.add("José");
            alunos.add("Josinaldo");
            alunos.add("Maria");
            alunos.add("Laís");
            alunos.add("Leônidas");
            alunos.add("Lucas");
            alunos.add("Kauan");
            alunos.add("Ruberty");
            alunos.add("Tales");
            alunos.add("Vinícios");
            alunos.add("Walisson");

            // gerar notas e faltas
            for (i = 0; i < alunos.size(); i++) {
                notas1.add(random.nextFloat(10));
                notas2.add(random.nextFloat(10));
                medias.add((notas1.get(i) + notas2.get(i)) / 2);
                faltas.add(random.nextInt(5));
                ids.add(i + 1);
            }

            while (opcao != 9) {
                linha();
                System.out.println("\033[32m                     MENU INICIAL");
                System.out.println("----------------------------------------------------------");
                System.out.println("              Informe o que deseja fazer:");
                System.out.println(" 1 -         Para adicionar um novo aluno;");
                System.out.println(" 2 -          Para visualizar um aluno;");
                System.out.println(" 3 -    Para editar as informações de um aluno;");
                System.out.println(" 4 -             Para remover um aluno;");
                System.out.println(" 5 -        Para visualizar todos os alunos;");
                System.out.println(" 6 - Para visualizar os alunos aprovados e reprovados;");
                System.out.println(" 9 -                 Para sair:");
                linha();

                opcao = input.nextInt();

                while ((opcao > 6 || opcao < 1) && opcao != 9) {
                    linha();
                    System.out.println("\u001B[31m               Opção inválida!");
                    System.out.print("Escolha um número entre 1 e 6, ou 9 para sair: ");
                    opcao = input.nextInt();
                }
                linha();
                if (opcao == 1) {
                    System.out.print("        Informe o nome do novo aluno: ");
                    nome = input.next();
                    System.out.print("      Agora informe o [ ID ] do novo aluno: ");
                    nv_id = input.nextInt();
                    while (idCheck(ids, nv_id) != -1) {
                        rtn_id = idCheck(ids, nv_id);
                        linha();
                        System.out
                                .println("O [ ID ] de número " + nv_id + " já existe para o aluno " + alunos.get(rtn_id));
                        System.out.println("Informe o número de [ ID ] diferente! ");
                        nv_id = input.nextInt();
                    }
                    alunos.add(nome);
                    ids.add(nv_id);
                    linha();
                    System.out.print("Deseja informar as notas e faltas de " + nome + " [s/n]? ");
                    sim_nao = input.next();
                    while ((sim_nao.equals("s")) == false && (sim_nao.equals("n") == false)) {
                        System.out.print("Digite 's' para SIM ou 'n' para NÃO: ");
                        sim_nao = input.next();
                    }

                    if (sim_nao.equals("s")) {
                        System.out.print("       Informe a nota da primeira prova: ");
                        nt1 = input.nextFloat();
                        notas1.add(nt1);
                        System.out.print("        Informe a nota da segunda prova: ");
                        nt2 = input.nextFloat();
                        notas2.add(nt2);
                        System.out.print("  Informe a quantidade de faltas de " + nome + ": ");
                        falta = input.nextInt();
                        faltas.add(falta);
                        medias.add((nt1 + nt2) / 2);
                        System.out.println("\u001B[31m----------------------------------------------------------");
                        Listagem();
                    } else {
                        notas1.add(null);
                        notas2.add(null);
                        faltas.add(null);
                        medias.add(null);
                    }
                } else if (opcao == 2) {
                    System.out.print("Informe o [ ID ] do aluno que deseja visualizar: ");
                    id = input.nextInt();
                    while (idCheck(ids, id) == -1) {
                        System.out.println("O [ ID ] informado não existe! Informe um [ ID ] válido para continuar!");
                        System.out.print("Informe o [ ID ] do aluno que deseja visualizar: ");
                        id = input.nextInt();
                    }
                    rtn_index = idCheck(ids, id);
                    System.out.println("\u001B[31m----------------------------------------------------------");
                    System.out.println("\u001B[33m                   [ ID ]:       " + ids.get(rtn_index));
                    System.out.println("                   Nome:      " + alunos.get(rtn_index));
                    System.out.println("              Primeira Nota: " + notas1.get(rtn_index));
                    System.out.println("               Segunda Nota: " + notas2.get(rtn_index));
                    System.out.println("             Media do aluno: " + medias.get(rtn_index));
                    System.out.println("                   Faltas:     " + faltas.get(rtn_index));
                    System.out.println("\u001B[31m----------------------------------------------------------");
                    if (medias.get(rtn_index) == null){
                        System.out.println("Notas não atribuídas, para adicionar, escolha a opção 3!");
                    }else if (medias.get(rtn_index) >= 6 && faltas.get(rtn_index) <= 3) {
                        System.out.println("\033[32m                   Situação: Aprovado!");
                    }else if(medias.get(rtn_index)<6){
                        System.out.println("\u001B[31m           Situação: Reprovado por média!");
                    }else{
                        System.out.println("\u001B[31m           Situação: Reprovado por falta!");
                    }
                } else if (opcao == 3) {
                    System.out.println("Informe o [ ID ] do aluno que deseja editar: ");
                    id = input.nextInt();
                    while (idCheck(ids, id) == -1) {
                        System.out.println("O [ ID ] informado não existe! Informe um [ ID ] válido para continuar!");
                        System.out.print("Informe o [ ID ] do aluno que deseja visualizar: ");
                        id = input.nextInt();
                    }
                    rtn_index = idCheck(ids, id);

                    System.out.println("Deseja editar o nome de " + alunos.get(rtn_index) + "? [s/n]: ");
                    sim_nao = input.next();
                    while ((sim_nao.equals("s")) == false && (sim_nao.equals("n") == false)) {
                        System.out.print("Digite 's' para SIM ou 'n' para NÃO: ");
                        sim_nao = input.next();
                    }
                    if (sim_nao.equals("s")) {
                        System.out.println("Informe o novo nome do aluno: ");
                        alunos.set(rtn_index, input.next());
                    }
                    System.out.println("Deseja editar as notas de " + alunos.get(rtn_index) + "? [s/n]: ");
                    sim_nao = input.next();
                    while ((sim_nao.equals("s")) == false && (sim_nao.equals("n") == false)) {
                        System.out.print("Digite 's' para SIM ou 'n' para NÃO: ");
                        sim_nao = input.next();
                    }
                    if (sim_nao.equals("s")) {
                        System.out.println("Informe a nota primeira prova: ");
                        nt1 = input.nextFloat();
                        notas1.set(rtn_index, nt1);
                        System.out.println("Informe a nota segunda prova: ");
                        nt2 = input.nextFloat();
                        notas2.set(rtn_index, nt2);
                        medias.set(rtn_index, ((nt1 + nt2) / 2));
                    }
                    System.out.println("Deseja editar a quantidade de faltas de " + alunos.get(rtn_index) + "? [s/n]: ");
                    sim_nao = input.next();
                    while ((sim_nao.equals("s")) == false && (sim_nao.equals("n") == false)) {
                        System.out.print("Digite 's' para SIM ou 'n' para NÃO: ");
                        sim_nao = input.next();
                    }
                    if (sim_nao.equals("s")) {
                        System.out.println("Informe a quantidade de faltas de " + alunos.get(rtn_index) + ": ");
                        faltas.set(rtn_index, input.nextInt());
                    }
                    System.out.println("\u001B[31m----------------------------------------------------------");
                } else if (opcao == 4) {
                    System.out.println("\u001B[31m Informe o [ ID ] do aluno que deseja remover: ");
                    id = input.nextInt();
                    while (idCheck(ids, id) == -1) {
                        System.out.println("\u001B[31mO [ ID ] informado não existe! Informe um [ ID ] válido para continuar!");
                        System.out.print("\u001B[31mInforme o [ ID ] do aluno que deseja DELETAR: ");
                        id = input.nextInt();
                    }
                    rtn_index = idCheck(ids, id);
                    System.out.println("Remover todas as informações de " + alunos.get(rtn_index)+ " [ ID ] " + ids.get(rtn_index) + " ? [s/n]: ");
                    sim_nao = input.next();
                    while ((sim_nao.equals("s")) == false && (sim_nao.equals("n") == false)) {
                        System.out.print("Digite 's' para SIM ou 'n' para NÃO: ");
                        sim_nao = input.next();
                    }
                    if (sim_nao.equals("s")) {
                        ids.remove(rtn_index);
                        alunos.remove(rtn_index);
                        notas1.remove(rtn_index);
                        notas2.remove(rtn_index);
                        faltas.remove(rtn_index);
                        System.out.println("\u001B[31m----------------------------------------------------------");
                        System.out.println("                 Informações deletadas! " ); 
                        System.out.println("\u001B[31m----------------------------------------------------------");
                    } else if (sim_nao.equals("n")) {
                        System.out.println(
                                "Operação abortada! As informações de " + alunos.get(rtn_index) + " não foram deletadas!");
                    }
                } else if (opcao == 5) {
                    for (i = 0; i < alunos.size(); i++) {
                        System.out.println("[ ID ] -> " + ids.get(i) + " - " + alunos.get(i) + "    |Nota1:      " + notas1.get(i)
                                + "    |Nota2:      " + notas2.get(i) + "    |Faltas:      " + faltas.get(i) + "    |Média:      " + medias.get(i));
                    }
                } else if (opcao == 6) {
                    System.out.println("\033[32m----------------------------------------------------------");
                    System.out.println("\033[32m                    Alunos aprovados:");
                    System.out.println("\033[32m----------------------------------------------------------");
                    for (i = 0; i < alunos.size(); i++) {
                        if (medias.get(i) != null && (medias.get(i) >= 6 && faltas.get(i) <= 3)) {
                            System.out.println(alunos.get(i) + "    --> Aprovado com média " + medias.get(i));
                        }
                    }
                    linha();
                    System.out.println("\u001B[31m----------------------------------------------------------");
                    System.out.println(" \u001B[31m                    Alunos reprovados:");
                    System.out.println("\u001B[31m----------------------------------------------------------");
                    for (i = 0; i < alunos.size(); i++) {
                        if (medias.get(i) != null && medias.get(i) < 6) {
                            System.out.println(alunos.get(i) + "    --> Reprovado com a média " + medias.get(i));
                        } else if (medias.get(i) != null && faltas.get(i) > 3) {
                            System.out.println(alunos.get(i) + "    --> Reprovado por falta com " + faltas.get(i) + " faltas");
                        }
                    }
                    linha();
                    for (i = 0; i < alunos.size(); i++) {
                        if (medias.get(i) == null) {
                            System.out.println("[ ID ]: " + ids.get(i) + " - " + alunos.get(i) + "|Notas não atribuídas!");
                        }
                    }
                } else if (opcao == 9) {
                    System.out.println("<(@_@)>_____Fim da Sessão_____<(@_@)>");
                    System.out.println("(^_^)_______Volte Sempre!_______(^_^)");
                }
            }
            input.close();
        }
    }
}

// System.out.println(alunos);
// System.out.println(notas1);
// System.out.println(notas2);
// System.out.println(faltas);
