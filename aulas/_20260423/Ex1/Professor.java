package _20260423.Ex1;

public class Professor extends Pessoa {
    private double ordenado;

    public double getOrdenado() {
        return ordenado;
    }

    public Professor(String nif, String nome, int idade, double ordenado) {
        super(nif, nome, idade);
        this.ordenado = ordenado;
    }

    @Override
    public String toString() {
        return String.format("PROFESSOR: %s - %s - %d - (%.2f €)",
                super.getNome(),
                super.getNif(),
                super.getIdade(),
                this.ordenado
        );
    }
}
