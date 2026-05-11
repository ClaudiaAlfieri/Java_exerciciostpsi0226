/*package _20260423.Ex1;

public class Escola {
    private String nome;

    //Associação com a Classe Pessoa1
    private Pessoa1 pessoa11;
    private Pessoa1 pessoa12;
    private Pessoa1 pessoa13;

    public Escola(String nome) {
        this.nome = nome;
    }

    public void criarAluno(String nome, String nif, int idade, double nota) {
        if (pessoa11 == null)
            this.pessoa11 = new Aluno(nif, nome, idade, nota);
        else if (pessoa12 == null)
            this.pessoa12 = new Aluno(nif, nome, idade, nota);
        else if (pessoa13 == null)
            this.pessoa13 = new Aluno(nif, nome, idade, nota);
        else
            System.out.println("ERRO! Escola Cheia");


    }

    public void criarProfessor(String nome, String nif, int idade, double ordenado) {
        if (pessoa11 == null)
            this.pessoa11 = new Professor(nif, nome, idade, ordenado);
        else if (pessoa12 == null)
            this.pessoa12 = new Professor(nif, nome, idade, ordenado);
        else if (pessoa13 == null)
            this.pessoa13 = new Professor(nif, nome, idade, ordenado);
        else
            System.out.println("ERRO! Escola Cheia");
    }

    public void listarPessoas() {
        System.out.println(String.format("######## %s #########",this.nome));
        System.out.println(this.pessoa11);
        System.out.println(this.pessoa12);
        System.out.println(this.pessoa13);
    }
}*/
