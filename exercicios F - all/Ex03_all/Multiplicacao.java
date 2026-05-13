package Ex03_all;

public class Multiplicacao implements OperacaoMatematica{
    @Override
    public double executar(double a, double b) throws Exception {
        return a * b;
    }
}
