package _20260430.exemplo1;

public class Animal implements Valoravel {

    private int valor;

    public Animal(int valor) {
        this.valor = valor;
    }


    @Override
    public int valor_objeto() {
        return this.valor;
    }
}
