package Ex13;

import java.util.Random;
import java.util.Scanner;

public class Ex13 {
    static void main() {

        //Faça um programa para o “jogo de adivinhar um número”. O computador deve sortear um número entre 1 e 100 e pedir para o utilizador tentar adivinhar este número. O utilizador vai dizer o seu palpite, e o computador deve responder se ele é maior ou menor que o número que ele sorteou. O programa termina somente quando se acertar exatamente no número que o computador tinha sorteado, escrevendo uma mensagem de felicitação. Deve também ser apresentado o número de tentativas que o jogador necessitou para acertar

        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        int palpite;
        int contador = 0;

        do {
            System.out.print("Insira o palpite: ");
            palpite = input.nextInt();
            contador++;

            if (num < palpite) {
                System.out.println("Muito pequeno");
            } else if (num > palpite) {
                System.out.println("Muito grande");
            } else {
                System.out.println("Parabéns, acertou em " + contador + " tentativas.");
            }
        }
        while( num != palpite);
    }
}
