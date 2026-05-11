package _20260430.exemplo2;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return String.format("%s [%d]", this.nome, this.idade);
    }

    @Override
    public int compareTo(Pessoa o) {
        return 0;
    }
}
