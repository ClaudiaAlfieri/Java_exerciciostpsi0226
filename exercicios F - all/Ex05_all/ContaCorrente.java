package Ex05_all;

public class ContaCorrente extends Conta{

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void levantar(double valor) throws OperacaoInvalidaException {
        if (valor <= saldo){
            saldo -= valor;

            System.out.println("Levantados " + valor + "€ da conta corrente de " + titular);
        }else{
            throw new OperacaoInvalidaException("Saldo insuficiente. Saldo disponível: " + saldo);
        }
    }

    @Override
    public String resumo() {
        return "Conta Corrente: " + titular + " - Saldo: " + saldo + "€";
    }
}
