package Ex17;

public class Ex17 {
    static void main() {

        // Escreva um programa que imprima a conversão de milhas para Km. Como referência saiba que 1 milha = 1,609 Km.

        // Pretende-se que o programa escrava no ecrã a seguinte informação

        // Dica: Utilize um ciclo para automatizar o processo


        System.out.println("Miles   Kilometers");

        for(int i=10; i<=110; i+=10){
            System.out.println(i + "   " + (i * 1.609));
        }

    }
}
