package _20260423.Ex1;

public class Escola {
    private String nome;

    //Associação com a Classe Pessoa
    private Pessoa pessoa1;
    private Pessoa pessoa2;
    private Pessoa pessoa3;

    public Escola(String nome) {
        this.nome = nome;
    }

    public void criarAluno(String nome, String nif, int idade, double nota) {
        if (pessoa1 == null)
            this.pessoa1 = new Aluno(nif, nome, idade, nota);
        else if (pessoa2 == null)
            this.pessoa2 = new Aluno(nif, nome, idade, nota);
        else if (pessoa3 == null)
            this.pessoa3 = new Aluno(nif, nome, idade, nota);
        else
            System.out.println("ERRO! Escola Cheia");


    }

    public void criarProfessor(String nome, String nif, int idade, double ordenado) {
        if (pessoa1 == null)
            this.pessoa1 = new Professor(nif, nome, idade, ordenado);
        else if (pessoa2 == null)
            this.pessoa2 = new Professor(nif, nome, idade, ordenado);
        else if (pessoa3 == null)
            this.pessoa3 = new Professor(nif, nome, idade, ordenado);
        else
            System.out.println("ERRO! Escola Cheia");
    }

    public void listarPessoas() {
        System.out.println(String.format("######## %s #########",this.nome));
        System.out.println(this.pessoa1);
        System.out.println(this.pessoa2);
        System.out.println(this.pessoa3);
    }
}
