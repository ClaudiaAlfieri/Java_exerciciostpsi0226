package Ex05_classesAbstratas;

public class PagamentoTransferenciaBancaria extends Pagamento{

    private String iban;
    private int diasParaCompensacao;

    public PagamentoTransferenciaBancaria(String referencia, double valor, String data, String iban, int diasParaCompensacao) {
        super(referencia, valor, data);
        this.iban = iban;
        this.diasParaCompensacao = diasParaCompensacao;
    }

    @Override
    public double calcularTaxa() {
        return 0;
    }

    @Override
    public String processarPagamento() {
        return "Transferência bancária registada.";
    }

    @Override
    public String getDescricao() {
        return String.format("%s %s %d",
                getResumo(), iban, diasParaCompensacao);
    }
}
