package _20260410;

import java.util.Scanner;

public class Main2 {
    static void main() {

        //Dados primitivos - cada vez que é declarado cria-se um identificador do local da memória onde está guardado e inicia a memória.

        int idade = 20;
        double altura = 1.74;
        char letra = 'a'; // char ''  String ""
        boolean  valor = true; //false

        System.out.println("Idade é: " + idade);
        System.out.print("uma string");
        System.out.println("outra");
        System.out.printf("O João tem %d anos e mede %2f\n", idade, altura);

        Scanner sc=new Scanner(System.in);
        System.out.println("Insira o seu nome");
        String nome = sc.nextLine();
        System.out.println("Nome: " + nome);
        //int teste = sc.nextInt();
        //ou
        int teste = Integer.parseInt(sc.nextLine());

        sc.close();
    }
}
