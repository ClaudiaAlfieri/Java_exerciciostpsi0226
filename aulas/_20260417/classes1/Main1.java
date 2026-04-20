package _20260417.classes1;

import java.util.Scanner;

public class Main1 {
    static void main() {

   // Classe são modelos para criar objetos. Uma classe define quais atributos um objeto vai ter e quai métodos cada objeto vai ter..
        // Para uma pessoa os atributos seriam: cor dos olhos, cors da pelo, altura, nome, etc
        // Métodos são funções dentro de uma classe. é o que define como o objeto vai desempenhar uma tarefa.

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.Nome="Vitor";
        p1.idade=51;

        p2.Nome="Ana";
        p2.idade=33;

        p1.dormir();
        p2.dormir();

        System.out.println(p1);
        System.out.println(p2);

        Pessoa p3= new Pessoa("Filipe", 44);

        Scanner sc=new Scanner(System.in);
        System.out.print("Insira o seu nome: ");
        String n=sc.nextLine();
        System.out.print("Insira a idade: ");
        int i=sc.nextInt();
        Pessoa p4=new Pessoa(n,i);

        System.out.println(p3);
        System.out.println(p4);


    }
}
