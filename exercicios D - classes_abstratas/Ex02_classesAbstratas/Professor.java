package Ex02_classesAbstratas;

public class Professor extends Pessoa {

    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Professor(String nome, int idade, String departamento) {
        super(nome, idade);
        this.departamento = departamento;
    }

    public void mostrarDepartamento() {
        System.out.printf("Departamento: %s ", departamento);
    }
}
