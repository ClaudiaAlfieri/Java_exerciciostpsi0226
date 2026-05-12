package Ex03_interfaces;

public class ReparacaoMecanica extends ServicoOficina {

    private String componente;
    private double custoPecas;

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public double getCustoPecas() {
        return custoPecas;
    }

    public void setCustoPecas(double custoPecas) {
        this.custoPecas = custoPecas;
    }

    public ReparacaoMecanica(int numeroOrdem, String matricula, double horasTrabalho, double precoHora, String componente, double custoPecas) {
        super(numeroOrdem, matricula, horasTrabalho, precoHora);
        this.componente = componente;
        this.custoPecas = custoPecas;
    }

    @Override
    public double getCustoMateriais(){
        return custoPecas;
    }

    @Override
    public String getTipoServico(){
        return "Reparação Mecânica";
    }

    @Override
    public String toString() {
        return String.format("Reparação Mecânica (OS #%d, %s, Componente: %s)", getNumeroOrdem(), getMatricula(), componente);
    }
}
