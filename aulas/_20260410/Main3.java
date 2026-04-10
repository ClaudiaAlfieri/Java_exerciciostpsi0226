package _20260410;

import java.util.Scanner;

public class Main3 {
    static void main() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Insira a sua idade");
        int idade = sc.nextInt();
        if(idade >= 18)
            System.out.println("É maior de idade");
        else
            System.out.println("É menor de idade");

        for (int i = 0; i< idade; i++){
            System.out.println(i);
        }

        int j =0;
        while (j < idade){
            System.out.println("j = " +j);
            j++;
        }

        //break e continue
        System.out.println("Só números pares");
        j=0;
        while (j < idade){
            if (j % 2 ==0) {
                j++;
                continue; //Ignora tudo o que vem depois e reinicia o ciclo
            }
                System.out.println("J= " +j);
        }

        sc.close();
    }
}
