package Ex03_all;

public class Adicao implements OperacaoMatematica{

    @Override
    public double executar(double a, double b) throws Exception {
        return a + b;
    }
}
