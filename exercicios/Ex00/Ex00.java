package Ex00;

import java.util.Scanner;

public class Ex00 {
    static void main() {

        //Escreva um programa em Java que solicite um inteiro maior que 0 e menor que 20 e escreva no ecrã esses números, de zero ao número solicitado. Caso o inteiro solicitado não se enquadre nos limites definidos deve ser apresentado o erro ao utilizador e sair.

        System.out.println("Digite um valor: ");

        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        if (valor < 0 || valor > 20){
            System.out.println("O número não está dentro dos limites");
        return;
    }

        for (int i = 1; i<valor; i++) {
            System.out.println(i);
        }
    }
}
