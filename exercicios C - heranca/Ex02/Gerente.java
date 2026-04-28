package Ex02;

public class Gerente extends Funcionario {

    // Construtor
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    //Metodo

    public void gerirEquipa(){
        System.out.println("Gerindo a equipa");
    }
}
