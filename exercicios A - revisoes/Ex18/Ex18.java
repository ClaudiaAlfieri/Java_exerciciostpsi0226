package Ex18;

import java.util.Scanner;

public class Ex18 {
    static void main() {

        //Escreva um programa em java que solicite um inteiro ao utilizador. De seguida escreva-o de forma inversa. Veja o comportamento esperado

        //Indroduza um inteiro-> 27490
        //Inverso->09472

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        System.out.print("Inverso-> ");

        while (num != 0){
            int algarismo = num % 10;
            System.out.print(algarismo);
            num = num / 10;
        }

    }
}
