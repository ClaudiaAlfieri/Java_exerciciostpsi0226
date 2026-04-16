package Ex09;

import java.util.Scanner;

public class Ex09 {
    static void main() {
        //Escreva um programa que peça um valor n, maior ou igual a 3 e ímpar, ao utilizador, que corresponde à dimensão da linha central de um losango. Caso o número não tenha essas características escrever o erro e sair Veja o exemplo

        // *
       // ***
      // *****
     // *******
    // *********
     // *******
      // *****
       // ***
        // *

        Scanner input = new Scanner(System.in);
        System.out.print("Introduza um número maior ou igual a 3 e ímpar: ");
        int n = input.nextInt();

        if (n < 3 || n%2==0 ){
            System.out.println("Número inválido");
        }

        //Parte de cima
        for(int ast = 1; ast <= n; ast += 2) {
            int espacos = (n - ast) / 2;

            // loop para imprimir os espaços
            for(int s = 0; s < espacos; s++){
                System.out.print(" ");
            }

            // loop para imprimir os asteriscos
            for(int a = 0; a < ast; a++){
                System.out.print("*");
            }

            System.out.println();
        }

        //Parte de baixo
        for(int ast = n-2; ast >= 1; ast -= 2) {
            int espacos = (n - ast) / 2;

            // loop para imprimir os espaços
            for(int s = 0; s < espacos; s++){
                System.out.print(" ");
            }

            // loop para imprimir os asteriscos
            for(int a = 0; a < ast; a++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
