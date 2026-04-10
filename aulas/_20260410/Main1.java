package _20260410;

public class Main1 {
    static void main() {
        System.out.println("Olá Mundo!");

        //Dados primitivos -> valor fica guardado direto na memória. Cda vez que vc declara um valor ocupa um espaço na memória.

        int a = 10;
        int b = a;
        b = 20;

        System.out.println("a =" + a);
        System.out.println("b =" + b);

        //Objetos -> funciona por referência, ela aponta o valor que fica guardado na memória, várias referências podem apontar para o mesmo valor.

        String sa = "Vitor";
        String sb = sa;
        sb = "Manuel";

        System.out.println("sa =" + sa);
        System.out.println("sb =" + sb);

    }
}
