package _20260430.exemplo1;

public class Quadro implements Valoravel {

    private int valor_artistico;


    public Quadro(int valor_artistico) {
        this.valor_artistico = valor_artistico;
    }

    @Override
    public int valor_objeto() {
        return this.valor_artistico;
    }
}
