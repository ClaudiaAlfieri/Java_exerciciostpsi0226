package Ex05_all;

public abstract class Conta implements Operavel{

    protected String titular;
    protected double saldo;

    public Conta(String titular) {
        this.titular = titular;
        saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
        }
        System.out.println("Depositados " + valor + "€ na conta de " + titular);
    }

    @Override
    public String resumo() {
        return getClass().getSimpleName() + ": " + titular + " - Saldo: " + saldo + "€" ;
    }

    public abstract void levantar(double valor) throws OperacaoInvalidaException;
}
