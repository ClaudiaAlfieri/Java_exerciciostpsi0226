package _20260428;

public abstract class Empregado {

    private double salario_base;
    private String nome;
    private String nif;

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Empregado(double salario_base, String nome, String nif) {
        this.salario_base = salario_base;
        this.nome = nome;
        this.nif = nif;
    }


}
