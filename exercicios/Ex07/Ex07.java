package Ex07;

import java.util.Scanner;

public class Ex07 {
    static void main() {

        // Implemente através de um ciclo infinito um menu conforme exemplo abaixo:

        // ####### MENU #####
        // 1 - Criar Cliente
        // 2 - Mostrar Cliente
        // 3 - Apagar Cliente
        // 4 - Listar Clientes
        //        ------------------
        // 9 - Saír
        // Introduza o sua opção ->
        // Pretende-se que o programa tenha o seguinte comportamento:
        // Ao ser selecionado 1,2,3 ou 4 escreve no ecrã a frase do menu;
        // Ao ser selecionado 9, sair;
        // Se outra opção for selecionada deve escrever "Opção inválida"

        Scanner input = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("####### MENU #####");
            System.out.println("1 - Criar Cliente");
            System.out.println("2 - Mostrar Cliente");
            System.out.println("3 - Apagar Cliente");
            System.out.println("4 - Listar Cliente");
            System.out.println("------------------");
            System.out.println("9 - Sair");
            System.out.print("Introduza a sua opção ->  ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Criar Cliente");
                    break;
                case 2:
                    System.out.println("Mostrar Cliente");
                    break;
                case 3:
                    System.out.println("Apagar Cliente");
                    break;
                case 4:
                    System.out.println("Listar Cliente");
                    break;
                case 9:
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while(opcao != 9);
    }
}
