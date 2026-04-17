package Ex19;

import java.util.Scanner;

public class Ex19 {
    static void main() {

        //Aproveitando o exercício anterior, através de um ciclo infinito while(true){} pergunte, no final, ao utilizador se pretende inserir novo número: Veja o comportamento esperado

        Scanner input = new Scanner(System.in);
       char resposta;

        while(true){

            System.out.print("Digite um número: ");
            int num = input.nextInt();

            System.out.print("Inverso-> ");

            while (num != 0){
                int algarismo = num % 10;
                System.out.print(algarismo);
                num = num / 10;
            }
            System.out.println();

            System.out.println("Deseja inserir outros números? (s/n): ");
            resposta = input.next().charAt(0);

            if(resposta == 'n'){
                System.out.println("A sair....");
                break;
            }
        }
    }
}
