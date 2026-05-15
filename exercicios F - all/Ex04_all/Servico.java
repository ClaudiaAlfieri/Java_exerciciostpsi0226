package Ex04_all;

public abstract class Servico implements Pagavel{

    protected String descricao;
    protected double valor;
    protected boolean pago;

    public Servico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public void pagar(double valor) throws PagamentoInvalidoException {
        if (pago == true){
            throw new PagamentoInvalidoException("Pagamento efetuado");
        }else if (valor != this.valor){
            throw new PagamentoInvalidoException("Valor incorreto");
        }else{
            pago = true;
            System.out.println("Pagamento realizado para: " + descricao);
        }
    }

    @Override
    public boolean isPago() {
        return pago;
    }

    @Override
    public String resumo() {
        if (pago){
            return descricao + " - " + valor + "€ - " + "Pago";
        }
        else{
            return descricao + " - " + valor + "€ - " + "Pendente";
        }
    }
}
