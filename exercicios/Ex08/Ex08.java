package Ex08;

import java.util.Scanner;

public class Ex08 {
    static void main() {

        //Escreva um programa em java que escreva no ecrã os n números maiores que zero, com o padrão mostrado abaixo O valor de n é solicitado ao utilizador. Caso o padrão não possa ser feito (ex: n=2 ou n=4 ou n=5) escrever no ecrã "n incorreto". Ou seja a última linha tem que ter mais um elemento que a anterior e deve estar completa. Logo para n igual a 2,4,5,7,8,9 (no exemplo abaixo) era impossível escrever o padrão.

        //        Padrão pretendido :

        //1
        //2 3
        //4 5 6
        //7 8 9 10

        Scanner input = new Scanner(System.in);
        System.out.print("Introduza um número: ");
        int n = input.nextInt();

        int linhas = 0;
        int total = 0;
        int numero =1;

        while(total < n) {
            linhas++;
            total = linhas * (linhas + 1) / 2;
        }
        if (total == n){
            for(int j=1; j<=linhas; j++){
                for(int k=1; k<=j; k++){
                    System.out.print(numero + " ");
                    numero++;
                }
                System.out.println();
            }

        }else{
            System.out.println("Número incorreto");
        }
    }
}
