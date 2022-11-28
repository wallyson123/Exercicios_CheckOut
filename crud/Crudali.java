import java.util.ArrayList;
import java.util.Scanner;
public class Crudali {
    public static void linhas() {
        System.out.println("    --------------------------------------- ");
    }
    public static void Clientes() {
        System.out.println("  ---------Lista de pedidos Atualizada-------- ");
    }
    public static void main(String[] args) {
        
        ArrayList<String> cachorros = new ArrayList<String>();
        ArrayList<Integer> quantidades = new ArrayList<Integer>();
        ArrayList<String> molhos = new ArrayList<String>();
        ArrayList<String> molhos1 = new ArrayList<String>();
        ArrayList<String> batatapalhas = new ArrayList<String>();
        ArrayList<String> envios = new ArrayList<String>();
        ArrayList<String> retiradas = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        while (true) {
            String cachorro;
            int quantidade;
            String molho;
            String molho1;
            String batata;
            String envio;
            String retirada;
            linhas();
            System.out.println("\033[32m               Digite a opcao");
            linhas();
            System.out.println("            1- Cachorro Quente");
            System.out.println("             2- Buscar Pedido");
            System.out.println("             3- Editar Pedido");
            System.out.println("             4- Deletar Pedido");
            System.out.println("                 5- Sair ! ");

            System.out.println("Apenas numeros - 1 , 2 , 3 , 4 , 5 , 6 ! Presta atenção tabacudo");
            Clientes();
            for (int j = 0; j < cachorros.size(); j++) {
                System.out.println((j + 1) + " - " + cachorros.get(j));
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
                System.out.println("\033[30;40m Nome do Cliente: ?");
                cachorro = input.next();
                linhas();
                System.out.println("Quantidade : ?");
                quantidade = input.nextInt();
                linhas();
                System.out.println("Ketchup : ?");
                molho = input.next();
                linhas();
                System.out.println("Mostarda  : ?");
                molho1 = input.next();
                linhas();
                System.out.println("Batata Palha : ?");
                batata = input.next();
                linhas();
                System.out.println("Envio - MotoBoy : ?");
                envio = input.next();
                linhas();
                System.out.println("Retirada pelo Cliente : ?");
                retirada = input.next();
                linhas();


                cachorros.add(cachorro);
                quantidades.add(quantidade);
                molhos.add(molho);
                molhos1.add(molho1);
                batatapalhas.add(batata);
                envios.add(envio);
                retiradas.add(retirada);

                System.out.println("\033[34m      Pedido cadastrado , aguarde o envio ");

                // READ
            } else if (opcao == 2) {
                linhas();
                System.out.println("Digite o nome do Cliente");
                cachorro = input.next();
                linhas();

                for (int i = 0; i < cachorros.size(); i++) {
                    String nomeLista = cachorros.get(i);
                    if (nomeLista.equals(cachorro)) {
                        linhas();
                        System.out.println("\033[33m     <(@_@)> Pedido Encontrado <(@_@)> ");
                        linhas();
                        System.out.println("\033[33m          --- Nome do Cliente --- ");
                        System.out.println("  ------------>> "+nomeLista);
                        linhas();
                        int quantidadeBusca = quantidades.get(i);
                        System.out.println("\033[33m         --- Quantidade ---  ");
                        System.out.println("----------------->> "+quantidadeBusca);
                        linhas();
                        String molho1busca = molhos.get(i);
                        System.out.println("\033[33m       --- Molho Ketchup ---" );
                        System.out.println("-------------->> "+molho1busca);
                        linhas();
                        String molho2busca = molhos1.get(i);
                        System.out.println("\033[33m       --- Molho Mostarda ---" );
                        System.out.println("-------------->> "+molho2busca);
                        linhas();
                        String batatabusca = batatapalhas.get(i);
                        System.out.println("\033[33m       --- Molho Mostarda ---" );
                        System.out.println("-------------->> "+batatabusca);
                        linhas();
                        String envio1busca = envios.get(i);
                        System.out.println("\033[33m       --- Envio - Motoboy ---" );
                        System.out.println("-------------->> "+envio1busca);
                        linhas();
                        String retirada1busca = retiradas.get(i);
                        System.out.println("\033[33m       --- Retirada Pelo Cliente ---" );
                        System.out.println("-------------->> "+retirada1busca);
                    }
                }
            } else if (opcao == 3) {
                String editor;
                linhas();
                System.out.print("\033[34m Informe o número do Cliente que deseja editar: ");
                opcao = input.nextInt();
                while (opcao > cachorros.size()) {
                    linhas();
                    System.out.println("\033[34m Ao todo são " + (cachorros.size()) + " Clientes.");
                    System.out.print("Informe um número entre 1 e " + (cachorros.size()) + ": ");
                    opcao = input.nextInt();
                }
                linhas();
                System.out.println("\033[34m Pronto Cliente selecionado : " + cachorros.get(opcao - 1));
                linhas();
                System.out.print("\033[34m Informe o novo nome para o Cliente : ");
                editor = input.next();
                cachorros.set(opcao - 1, editor);
                linhas();

                System.out.println("Agora mude a Opcao de molho Ketchup  ");
                linhas();
                System.out.println("\033[34m Pronto Opcao de molho selecionado : " + molhos.get(opcao - 1));
                linhas();
                System.out.print("\033[34m Informe se Sim ou não para Ketchup : ");
                editor = input.next();
                molhos.set(opcao - 1, editor);
                linhas();

                System.out.println("Agora mude a Opcao de molho Mostarda  ");
                linhas();
                System.out.println("\033[34m Pronto Opcao de molho selecionado : " + molhos1.get(opcao - 1));
                linhas();
                System.out.print("\033[34m Informe se Sim ou não para Mostarda : ");
                editor = input.next();
                molhos1.set(opcao - 1, editor);
                linhas();

                System.out.println("Agora mude a Opcao de Batata Palha  ");
                linhas();
                System.out.println("\033[34m Pronto Opcao selecionada : " + batatapalhas.get(opcao - 1));
                linhas();
                System.out.print("\033[34m Informe se Sim ou não para Batata Palha : ");
                editor = input.next();
                batatapalhas.set(opcao - 1, editor);
                linhas();

                System.out.println("Agora mude a Opcao de Envio  ");
                linhas();
                System.out.println("\033[34m Pronto Opcao selecionada : " + envios.get(opcao - 1));
                linhas();
                System.out.print("\033[34m Informe se S/N para Envio-Motoboy : ");
                editor = input.next();
                envios.set(opcao - 1, editor);
                linhas();

                System.out.println("Agora mude a Opcao de Retirada  ");
                linhas();
                System.out.println("\033[34m Pronto Opcao selecionada : " + retiradas.get(opcao - 1));
                linhas();
                System.out.print("\033[34m Informe se Sim ou não para Retirada em loja : ");
                editor = input.next();
                retiradas.set(opcao - 1, editor);
                linhas();


            } else if (opcao == 4) {
                System.out.print("Informe o número do Cliente que deseja Deletar: ");
                opcao = input.nextInt();
                while (opcao > cachorros.size()) {
                    System.out.println("Ao todo são " + (cachorros.size()) + " Clientes.");
                    System.out.print("Informe um número entre 1 e " + (cachorros.size()) + " : ");
                    opcao = input.nextInt();
                }
                linhas();
                System.out.println("         Pedido Deletado : " + cachorros.get(opcao - 1));
                cachorros.remove(opcao - 1);
                linhas();

            } else if(opcao == 5){
                System.out.println("Aplicativo encerrado, Realize outro pedido atualizando Pagina !");
                break;
            }

        }
        input.close();

    }

}