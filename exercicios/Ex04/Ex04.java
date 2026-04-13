package Ex04;

import java.util.Scanner;

public class Ex04 {
    static void main() {

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
