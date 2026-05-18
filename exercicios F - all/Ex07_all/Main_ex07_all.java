package Ex07_all;

import java.util.Scanner;

public class Main_ex07_all {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorComboios gestor = new GestorComboios();
        int opcao;

        do {
            System.out.println("\n--- GESTÃO DE COMBOIOS ---");
            System.out.println("1. Adicionar Comboio");
            System.out.println("2. Listar Comboios (por nome)");
            System.out.println("3. Listar Comboios (por nº vagões)");
            System.out.println("4. Procurar Comboios por Destino");
            System.out.println("5. Partir Comboio");
            System.out.println("6. Chegar Comboio");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Nome do comboio: ");
                    String nome = sc.nextLine();
                    System.out.print("Destino: ");
                    String destino = sc.nextLine();
                    System.out.print("Número de vagões: ");
                    int vagoes = Integer.parseInt(sc.nextLine());
                    System.out.print("Tipo (P=Passageiros / M=Mercadorias): ");
                    String tipo = sc.nextLine().trim().toUpperCase();

                    // Passa apenas dados básicos para o gestor
                    gestor.adicionarComboio(nome, destino, vagoes, tipo);
                    System.out.println("Comboio adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Comboios (Ordenados por Nome) ---");
                    gestor.listarPorNome();
                    break;

                case 3:
                    System.out.println("\n--- Lista de Comboios (Ordenados por Nº de Vagões) ---");
                    gestor.listarPorVagoes();
                    break;

                case 4:
                    System.out.print("Destino a procurar: ");
                    String dest = sc.nextLine();
                    gestor.listarPorDestino(dest);
                    break;

                case 5:
                    System.out.print("Nome do comboio a partir: ");
                    String nomePartida = sc.nextLine();
                    gestor.partirComboio(nomePartida);
                    break;

                case 6:
                    System.out.print("Nome do comboio a chegar: ");
                    String nomeChegada = sc.nextLine();
                    gestor.chegarComboio(nomeChegada);
                    break;

                case 0:
                    System.out.println("A terminar...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }


}
