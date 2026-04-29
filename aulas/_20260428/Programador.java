package _20260428;

public class Programador extends Empregado {

    private int numeroHoras;
    private double valorHora;

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Programador(double salario_base, String nome, String nif, int numeroHoras, double valorHora) {
        super(salario_base, nome, nif);
        this.numeroHoras = numeroHoras;
        this.valorHora = valorHora;
    }
}
