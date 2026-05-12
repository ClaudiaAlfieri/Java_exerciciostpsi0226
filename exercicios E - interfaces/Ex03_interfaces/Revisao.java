package Ex03_interfaces;

public class Revisao extends ServicoOficina{

    private int quilometros;
    private double custoFiltrosOleo;

    public Revisao(int numeroOrdem, String matricula, double horasTrabalho, double precoHora, int quilometros, double custoFiltrosOleo) {
        super(numeroOrdem, matricula, horasTrabalho, precoHora);
        this.quilometros = quilometros;
        this.custoFiltrosOleo = custoFiltrosOleo;
    }

    public int getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(int quilometros) {
        this.quilometros = quilometros;
    }

    public double getCustoFiltrosOleo() {
        return custoFiltrosOleo;
    }

    public void setCustoFiltrosOleo(double custoFiltrosOleo) {
        this.custoFiltrosOleo = custoFiltrosOleo;
    }

    public double getCustoMateriais() {
        return custoFiltrosOleo;
    }

    public String getTipoServico(){
        return "Revisão";
    }

    @Override
    public String toString() {
        return String.format("Revisão (OS #%d, %s, KM: %d)", getNumeroOrdem(), getMatricula(), quilometros);
    }
}
