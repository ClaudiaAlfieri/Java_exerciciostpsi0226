package _20260428;

public class Gerente extends Empregado {

    private double despesasRepresentacao;

    public double getDespesasRepresentacao() {
        return despesasRepresentacao;
    }

    public void setDespesasRepresentacao(double despesasRepresentacao) {
        this.despesasRepresentacao = despesasRepresentacao;
    }

    public Gerente(double salario_base, String nome, String nif, double despesasRepresentacao) {
        super(salario_base, nome, nif);
        this.despesasRepresentacao = despesasRepresentacao;
    }
}
