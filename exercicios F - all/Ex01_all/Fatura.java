package Ex01_all;

public class Fatura implements Pagavel {

    private int id;
    private String descricao;
    private double valorTotal;
    private boolean paga;

    public Fatura(int id, String descricao, double valorTotal) {
        this.id = id;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    @Override
    public void pagar(double valor) throws PagamentoInvalidoException {
        if (paga){
            throw new PagamentoInvalidoException("Fatura já está paga.");
        }
        else if ( valor != valorTotal){
            throw new PagamentoInvalidoException("Valor inválido. Esperado: " + valorTotal);
        }
        else{
            paga = true;
            System.out.println("Pagamento realizado com sucesso para a fatura: " + descricao);
        }
    }




}
