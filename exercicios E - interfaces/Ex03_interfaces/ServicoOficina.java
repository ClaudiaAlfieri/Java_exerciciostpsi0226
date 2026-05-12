package Ex03_interfaces;

public abstract class ServicoOficina implements Faturavel {

    private int numeroOrdem;
    private String matricula;
    private double horasTrabalho;
    private double precoHora;

    public ServicoOficina(int numeroOrdem, String matricula, double horasTrabalho, double precoHora) {
        this.numeroOrdem = numeroOrdem;
        this.matricula = matricula;
        this.horasTrabalho = horasTrabalho;
        this.precoHora = precoHora;
    }

    public int getNumeroOrdem() {
        return numeroOrdem;
    }

    public void setNumeroOrdem(int numeroOrdem) {
        this.numeroOrdem = numeroOrdem;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(double horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public double calcularTotal() {
        return horasTrabalho * precoHora + getCustoMateriais();
    }

    @Override
    public String getDescricaoFatura() {
        return String.format("Os #%d - %s - Tipo: %s - Total: %.2f EUR", numeroOrdem, matricula, getTipoServico(), calcularTotal());
    }

    protected abstract double getCustoMateriais();
    protected abstract String getTipoServico();
}
