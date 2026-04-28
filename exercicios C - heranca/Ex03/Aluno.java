package Ex03;

public class Aluno extends Pessoa {

    private int numeroAluno;
    private String curso;

    //Getters e Setters

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Construtor

    public Aluno(String nome, int idade, int numeroAluno, String curso) {
        super(nome, idade);
        this.numeroAluno = numeroAluno;
        this.curso = curso;
    }

    //Outros Metodos
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.printf("Numero: %d, Curso: %s%n", this.numeroAluno, this.curso);
    }
}
