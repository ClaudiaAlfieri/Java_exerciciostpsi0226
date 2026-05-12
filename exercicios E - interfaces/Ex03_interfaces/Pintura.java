package Ex03_interfaces;

public class Pintura extends ServicoOficina{

    private String cor;
    private double custoTintas;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCustoTintas() {
        return custoTintas;
    }

    public void setCustoTintas(double custoTintas) {
        this.custoTintas = custoTintas;
    }

    public Pintura(int numeroOrdem, String matricula, double horasTrabalho, double precoHora, String cor, double custoTintas) {
        super(numeroOrdem, matricula, horasTrabalho, precoHora);
        this.cor = cor;
        this.custoTintas = custoTintas;
    }

    @Override
    public double getCustoMateriais(){
        return custoTintas;
    }

    @Override
    public String getTipoServico(){
        return "Pintura";
    }

    @Override
    public String toString() {
        return String.format("Pintura (OS #%d, %s, Cor: %s)", getNumeroOrdem(), getMatricula(), cor);
    }
}
