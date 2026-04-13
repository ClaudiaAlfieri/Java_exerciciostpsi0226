package Ex03;

import java.util.Scanner;

public class Ex03 {
    static void main() {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número menor que 50: ");
        int num = input.nextInt();

        if (num > 50){
            System.out.println("Número inválido");
            return;
        }

           int a = 0;
           int b = 1;
           int proximo = 0;

           for(int i=0;i<num;i++){
               System.out.print(a+ ",");
               proximo = a+b;
               a=b;
               b=proximo;
           }

    }
}
