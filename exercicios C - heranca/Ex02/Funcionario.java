package Ex02;

public class Funcionario {

    //Atributos
    private String nome;
    private double salario;

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Construtor

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


}
