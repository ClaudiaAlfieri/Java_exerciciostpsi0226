package _20260430.exemplo1;

public class Cadeira implements Valoravel{

    private int valor_cadeira;

    public Cadeira(int valor_cadeira) {
        this.valor_cadeira = valor_cadeira;
    }

    @Override
    public int valor_objeto(){
        return this.valor_cadeira;
    }
}
