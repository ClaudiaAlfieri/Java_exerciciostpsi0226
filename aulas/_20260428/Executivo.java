package _20260428;

public class Executivo extends Gerente{

    private double isencaoHorario;

    public double getIsencaoHorario() {
        return isencaoHorario;
    }

    public void setIsencaoHorario(double isencaoHorario) {
        this.isencaoHorario = isencaoHorario;
    }

    public Executivo(double salario_base, String nome, String nif, double despesasRepresentacao, double isencaoHorario) {
        super(salario_base, nome, nif, despesasRepresentacao);
        this.isencaoHorario = isencaoHorario;
    }
}
