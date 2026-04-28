package Ex03;

public class Ex003 {
    static void main() {

        Aluno alunoNovo =new Aluno("Maria", 10, 123, "Primaria");
        Professor professor1 = new Professor("Joao", 45, "Java", 2000);
        Funcionario funcionario1 = new Funcionario("Mario", 36,"Porteiro", 8);

        alunoNovo.getInfo();
        professor1.getInfo();
        funcionario1.getInfo();

    }
}
