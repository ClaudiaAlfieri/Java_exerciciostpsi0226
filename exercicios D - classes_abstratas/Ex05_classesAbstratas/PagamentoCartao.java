package Ex05_classesAbstratas;

public class PagamentoCartao extends Pagamento{

    private String ultimosQuatroDigitos;
    private String nomeTitular;

    public PagamentoCartao(String referencia, double valor, String data, String ultimosQuatroDigitos, String nomeTitular) {
        super(referencia, valor, data);
        this.ultimosQuatroDigitos = ultimosQuatroDigitos;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public double calcularTaxa() {
        return (getValor()*0.2);
    }

    @Override
    public String processarPagamento() {
        return "Pagamento por cartão autorizado";
    }

    @Override
    public String getDescricao() {
        return String.format("%s %s %s",
                getResumo(), ultimosQuatroDigitos, nomeTitular);
    }
}
