package Ex15;

import java.util.Scanner;

public class Ex15 {
    static void main() {

        //Escreva uma programa para verificar se um inteiro é um número primo.

        //O seu programa deve solicitar inteiros ao utilizador e apresentar se é ou não primo. Após verificar deve ser perguntado ao utilizador se deseja inserir outro inteiro ou sair. O programa só finaliza quando o utilizador disser que pretende saír

        Scanner input = new Scanner(System.in);
        char resposta;

        do {
            System.out.print("Digite um número: ");
            int num = input.nextInt();

            if (num <= 1) {
                System.out.println("O número não é primo");
            } else if (num == 2) {
                System.out.println("O número é primo");
            } else if (num % 2 == 0) {
                System.out.println("O número não é primo");
            } else {
                int divisor = 0;

                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        divisor = i;
                        break;
                    }
                }

                if (divisor == 0) {
                    // se divisor ainda é 0, não encontrou nenhum divisor
                    System.out.println("O número é primo");
                } else {
                    System.out.println("O número não é primo");
                }
            }

            System.out.print("Deseja inserir outro número? (s/n): ");
            resposta = input.next().charAt(0);

        }while(resposta == 's');

    }
}
