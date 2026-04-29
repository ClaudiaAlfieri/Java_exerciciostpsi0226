package Ex05_classesAbstratas;

public abstract class Pagamento {

    private String referencia;
    private double valor;
    private String data;

    public Pagamento(String referencia, double valor, String data) {
        this.referencia = referencia;
        this.valor = valor;
        this.data = data;
    }

    public String getResumo(){
        return String.format("Pagamento %s - %.2f € em %s", referencia, valor, data);
    }

    public boolean isValorValido(){
        if(valor >0){
            return true;
        }else {
            return false;
        }
    }

    public abstract double calcularTaxa();

    public abstract String processarPagamento();

    public abstract String getDescricao();

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
