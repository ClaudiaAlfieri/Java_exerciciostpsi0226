package Ex14;

import java.util.Scanner;

public class Ex14 {
    static void main() {

        //Efetue um programa que solicite um número inteiro maior que zero ao utilizador e diga se esse número é um "Amstrong Number" Por definição, é chamado de número de Amstrong todos os números em que a soma dos cubos dos seus algarismos é igual ao número em si.

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número maior que 0: ");
        int num = input.nextInt();

        int temp = num;
        int soma = 0;

        if(num <= 0){
            System.out.println("Número inválido!");
        } else {

            while (temp > 0) {
                int algarismo = temp % 10;
                soma += algarismo * algarismo * algarismo;
                temp = temp / 10;
            }

            if (soma == num) {
                System.out.println("O " + num + " é um número de Armstrong!");
            } else {
                System.out.println("O " + num + " não é um número de Armstrong!");
            }
        }
    }
}
