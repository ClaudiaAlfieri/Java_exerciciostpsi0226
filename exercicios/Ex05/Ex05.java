package Ex05;

import java.util.Scanner;

public class Ex05 {
    static void main() {

        //Desenvolva um programa em Java que calcule a média de um conjunto de inteiros. Ao iniciar o programa deve ser solicitado a quantidade de inteiros sobre os quais se deve calcular a média. De seguida solicitar os números um a um ao utilizador e no final escrever a média dos números inseridos. A média é um número real

        //Dica: Criar um acumulador onde se guarda a soma dos números inseridos e no final efetuar o cálculo da média

        Scanner input = new Scanner(System.in);
        System.out.println("Quantos números vocês deseja inserir?");
        int quantidade = input.nextInt();

        int num =0;
        float soma = 0;
        int quantidade1 = quantidade;

        while(quantidade!=0){
            System.out.println("Insira um número: ");
            num = input.nextInt();
            quantidade -=1;
            soma += num;
        }

        float media = soma / quantidade1;

        System.out.println("A média é: " + media);
    }
}
