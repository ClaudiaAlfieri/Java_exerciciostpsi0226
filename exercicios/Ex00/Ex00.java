package Ex00;

import java.util.Scanner;

public class Ex00 {
    static void main() {
        System.out.println("Digite um valor: ");

        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        if (valor < 0 || valor > 20){
            System.out.println("O número não está dentro dos limites");
        return;
    }

        for (int i = 1; i<valor; i++) {
            System.out.println(i);
        }
    }
}
