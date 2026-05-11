package _20260511;

public class Aluno implements Comparable<Aluno>{
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public int compareTo(Aluno a) {
        //Comparação alfabetica por nome
        return this.nome.compareTo(a.getNome());
    }

    @Override
    public String toString() {
        return String.format("[%d] %s",this.id,this.nome);
    }
}
