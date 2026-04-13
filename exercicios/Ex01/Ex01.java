package Ex01;

import java.util.Scanner;

public class Ex01 {
    static void main() {


        //Efetue um programa em java que determine o menor e o maior número inteiro inserido pelo utilizador. Para o efeito solicite:

        //ao utilizador o número de inteiros a introduzir.
        //De seguida efetue um ciclo para pedir a quantidade de números inicialmente definida.

        //No final deve escrever qual o maior e menor introduzido.

        //Condição partida
        int menor=Integer.MAX_VALUE;
        int maior=Integer.MIN_VALUE;
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números pretende introduzir: ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Número não válido");
            return;
        }
        //Solicitar numeros ao user
        for(int i=1;i<=n;i++){
            System.out.printf("Insira número %d: ",i);
            input=sc.nextInt();
            if(input<menor){
                menor=input;
            }
            if(input>maior){
                maior=input;

            }
        }

        System.out.println("Menor: "+menor);
        System.out.println("Maior: "+maior);

    }
}
