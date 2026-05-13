package Ex03_all;

public class Main_ex3_all {

    public static void main(String[] args) {
        Calculadora c = new Calculadora(new Adicao());

        try {
            System.out.println("10 + 5 = " + c.calcular(10, 5));
        } catch (Exception e) {
            System.out.println("Erro 1: " + e.getMessage());
        }

        c.setOperacao(new Multiplicacao());
        try {
            System.out.println("10 * 3 = " + c.calcular(10, 3));
        } catch (Exception e) {
            System.out.println("Erro 2: " + e.getMessage());
        }

        c.setOperacao(new Divisao());
        try {
            System.out.println("10 / 0 = " + c.calcular(10, 0));
        } catch (Exception e) {
            System.out.println("Erro 3: " + e.getMessage());
        }

        c.setOperacao(new Subtracao());
        try {
            System.out.println("8 - 2 = " + c.calcular(8, 2));
        } catch (Exception e) {
            System.out.println("Erro 4: " + e.getMessage());
        }
    }
}
