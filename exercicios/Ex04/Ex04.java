package Ex04;

import java.util.Scanner;

public class Ex04 {
    static void main() {

        //Escreva um programa que solicite ao utilizador um inteiro positivo n, menor ou igual a 20. Depois através do ciclo while escreva no ecrã (um por linha) todos os múltiplos de 3.

        // **É obrigatório a utilização da clausula continue.

        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número inteiro positivo menor ou igual a 20: ");
        int num = input.nextInt();

        if (num > 20){
            System.out.println("Número inválido, por favor, digite outro número");
        }

        while(num>0){
            num-=1;
            if(num %3 ==0){
                System.out.println(num);
            }
            else{
                continue;
            }

        }
    }
}
