package Ex02;

import java.util.Scanner;

public class Ex02 {

    static void main() {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número inteiro positivo (>0): ");
        int num = input.nextInt();

        if(num<=0){
            System.out.println("Número não é um inteiro positivo");
            return;
        }
        //Se cheguei aqui vou calcular
        int soma=0;
        for(int i=1;i<=num;i++){
            soma+=i;
        }
        System.out.printf("A soma dos primeiros %d inteiros é: %d",num,soma);
        input.close() ;

    }
}
