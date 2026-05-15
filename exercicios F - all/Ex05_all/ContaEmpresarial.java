package Ex05_all;

public class ContaEmpresarial extends Conta{

    public ContaEmpresarial(String titular) {
        super(titular);
    }

    @Override
    public void levantar(double valor) throws OperacaoInvalidaException {
        if(saldo - valor >= -500){
            saldo -= valor;
            System.out.println("Levantados " + valor + "€ da conta empresarial de " + titular);
        }else{
            throw new OperacaoInvalidaException("Limite de descoberto excedido. Máximo: " + (saldo + 500));
        }
    }

    @Override
    public String resumo() {
        return "Conta Empresarial: " + titular + " - Saldo: " + saldo + "€";
    }
}
