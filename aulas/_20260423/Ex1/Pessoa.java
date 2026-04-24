package _20260423.Ex1;

public class Pessoa {
    private String nif;
    private String nome;
    private int idade;

    public String getNif() {
        return nif;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa(String nif, String nome, int idade) {
        this.nif = nif;
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nif, String nome) {
        this.nif = nif;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %d",
                this.nome,
                this.nif,
                this.idade
        );
    }
}

// PROFESSOR: <Nome> - <nif> - <idade> - (<ordenado> €)
// ALUNO: <Nome> - <nif> - <idade> - (<nota>)