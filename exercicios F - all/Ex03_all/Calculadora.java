package Ex03_all;

public class Calculadora {


    private OperacaoMatematica operacao;

    public Calculadora(OperacaoMatematica operacao) {
        this.operacao = operacao;
    }

    public void setOperacao(OperacaoMatematica operacao){
        this.operacao = operacao;
    };

    public double calcular(double a, double b) throws Exception{
        return operacao.executar(a, b);
    };

}
