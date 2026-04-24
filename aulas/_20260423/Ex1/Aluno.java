package _20260423.Ex1;

public class Aluno extends Pessoa {
    private double nota;

    public double getNota() {
        return nota;
    }

    public Aluno(String nif, String nome, int idade, double nota) {
        super(nif, nome, idade);
        this.nota = nota;

    }

    @Override
    public String toString() {
        return String.format("ALUNO: %s - (%.2f)",
                super.toString(),
                this.nota
        );
    }
}
