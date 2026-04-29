package Ex05_classesAbstratas;

public class PagamentoMBWay extends Pagamento {

    private String numeroTelemovel;
    private boolean confirmadoNaApp;

    public PagamentoMBWay(String referencia, double valor, String data, String numeroTelemovel, boolean confirmadoNaApp) {
        super(referencia, valor, data);
        this.numeroTelemovel = numeroTelemovel;
        this.confirmadoNaApp = confirmadoNaApp;
    }

    @Override
    public double calcularTaxa() {
        return 0.30;
    }

    @Override
    public String processarPagamento() {
        if(confirmadoNaApp){
            return "Pagamento MB WAY confirmado.";
        }else{
            return"Pagamento MB WAY pendente de confirmação.";
        }
    }

    @Override
    public String getDescricao() {
        return String.format("%s %s %b",
                getResumo(), numeroTelemovel, processarPagamento());
    }

}
