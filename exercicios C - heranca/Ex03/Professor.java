package Ex03;

public class Professor extends Pessoa {

    //Atributos
    private String disciplina;
    private double salario;

    //Getters e Setters

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Construtor

    public Professor(String nome, int idade, String disciplina, double salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    //Outros Metodos
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.printf("Disciplina: %s, Salário: %f%n", this.disciplina, this.salario);
    }
}
