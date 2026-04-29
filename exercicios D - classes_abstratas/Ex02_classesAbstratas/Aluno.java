package Ex02_classesAbstratas;

public class Aluno extends Pessoa {

    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public void mostrarCurso() {
        System.out.printf("Curso: %s ", curso);
    }

}
