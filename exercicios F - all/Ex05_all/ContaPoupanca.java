package Ex05_all;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular) {
        super(titular);
    }

    @Override
    public void levantar(double valor) throws OperacaoInvalidaException {
        if(valor <= (saldo * 0.75)){
            saldo -= valor;
            System.out.println("Levantados " + valor + "€ da conta poupança de " + titular);
        }
        else{
            throw new OperacaoInvalidaException("Só é permitido levantar até 75% do saldo. Máximo: " + (saldo * 0.75) );
        }
    }

    @Override
    public String resumo() {
        return "Conta Poupança: " + titular + " - Saldo: " + saldo + "€";
    }
}
