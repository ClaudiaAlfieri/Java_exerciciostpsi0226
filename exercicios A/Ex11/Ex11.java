package Ex11;

import java.util.Scanner;

public class Ex11 {
    static void main() {

        //Escreva um programa em java que solicite um inteiro ao utilizador, maior que zero e ímpar e escreva a seguinte pirâmide no ecrã. Caso número não seja válido escreve "número não válido" A base da pirâmide vai possuir tantos caracteres consoante o número fornecido.

        //Insira n-> 5
             //   *
             //  ***
            //  *****

        Scanner input = new Scanner(System.in);
        System.out.print("Introduza um número maior que 0 e ímpar: ");
        int n = input.nextInt();

        if (n < 0 || n%2==0 ){
            System.out.println("Número inválido");
        }
        else {

            for (int ast = 1; ast <= n; ast += 2) {
                int espacos = (n - ast) / 2;

                // loop para imprimir os espaços
                for (int s = 0; s < espacos; s++) {
                    System.out.print(" ");
                }

                // loop para imprimir os asteriscos
                for (int a = 0; a < ast; a++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}
