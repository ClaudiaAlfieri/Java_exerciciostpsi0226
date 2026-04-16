package Ex10;

import java.util.Scanner;

public class Ex10 {
    static void main() {

      //  Escreva um programa que solicite um inteiro maior que zero e escreva o triângulo de pascal. o inteiro pedido é o número de linhas. O triângulo de pascal tem como propriedade que o número de baixo resulta da soma dos de cima

      //  Insira n->5
      //         1
      //       1   1
      //     1   2   1
      //   1   3   3   1
      // 1   4   6   4   1

        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int n = input.nextInt();

        int[][] pascal = new int[n][n];

        for(int linha = 0; linha < n; linha++){
            pascal[linha][0] = 1;        // primeiro elemento
            pascal[linha][linha] = 1;    // último elemento

            for(int col = 1; col < linha; col++){
                pascal[linha][col] = pascal[linha-1][col-1] + pascal[linha-1][col];
            }
        }

        for(int linha = 0; linha < n; linha++){

            // espaços no início
            for(int s = 0; s < n -1 - linha; s++){
                System.out.print("  ");
            }

            // valores
            for(int col = 0; col <= linha; col++){
                System.out.print(pascal[linha][col] + "   ");
            }

            System.out.println();
        }
    }
}
