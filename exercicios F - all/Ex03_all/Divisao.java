package Ex03_all;

public class Divisao implements OperacaoMatematica {
    @Override
    public double executar(double a, double b) throws Exception {
        if (b == 0){
            throw new DivisaoPorZeroException("Erro: tentativa de divisão por zero.");
        }else{
            return a/b;
        }
    }
}
