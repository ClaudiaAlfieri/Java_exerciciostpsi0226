package Ex12;

import java.util.Scanner;

public class Ex12 {
    static void main() {

        //Escreva um programa em Java que solicite n (perguntar previamente ao utilizador quantos) números ao utilizador (inteiros). No final deve apresentar os seguintes resultados:

        //Média dos números (real)
        //soma dos números
        //Maior inserido
        //Menor inserido

        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);
        System.out.print("Quantos número você gostaria?");
        int n = input.nextInt();

        for(int i =1; i<=n; i++){
            System.out.print("Digite o número " + i + " ");
            int num = input.nextInt();

            soma = soma + num;

            if(num > maior){
                maior = num;
            }

            if(num < menor){
                menor = num;
            }

        }
        float media = (float) soma / n;
        System.out.println("Média: " + media);
        System.out.println("Soma: " + soma);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
