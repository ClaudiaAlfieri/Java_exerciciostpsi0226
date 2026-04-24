package Ex16;

import java.util.Scanner;

public class Ex16 {
    static void main() {

        //Escreva um programa que, recebendo dois inteiros, devolva o Máximo Divisor Comum entre eles. Após o cálculo o programa apresenta o resultado e pergunta ao utilizador se pretende efetuar nova operação, ou se pretende sair. Se o utilizador pretende continuar e novos dois números são solicitado. O programa só finaliza quando o utilizador pretender saír.

        Scanner input = new Scanner(System.in);
        char resposta;

        do {
            System.out.print("Digite um número: ");
            int num1 = input.nextInt();
            System.out.print("Digite outro número: ");
            int num2 = input.nextInt();

            while(num2 != 0){
                int resto = num1 % num2;
                num1 = num2;
                num2 = resto ;
            }
            System.out.println(" O MDC é: " + num1);

            System.out.print("Deseja inserir outros números? (s/n): ");
            resposta = input.next().charAt(0);

        }while(resposta == 's');
    }
}
