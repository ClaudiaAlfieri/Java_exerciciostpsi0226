package Ex03_interfaces;

public class DiagnosticoEletrico extends ServicoOficina {

    private String descricaoProblema;
    private double custoEquipamento;

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public double getCustoEquipamento() {
        return custoEquipamento;
    }

    public void setCustoEquipamento(double custoEquipamento) {
        this.custoEquipamento = custoEquipamento;
    }

    public DiagnosticoEletrico(int numeroOrdem, String matricula, double horasTrabalho, double precoHora, String descricaoProblema, double custoEquipamento) {
        super(numeroOrdem, matricula, horasTrabalho, precoHora);
        this.descricaoProblema = descricaoProblema;
        this.custoEquipamento = custoEquipamento;
    }

    @Override
    public double getCustoMateriais(){
        return custoEquipamento;
    }

    @Override
    public String getTipoServico(){
        return "Diagnóstico Elétrico";
    }
}
