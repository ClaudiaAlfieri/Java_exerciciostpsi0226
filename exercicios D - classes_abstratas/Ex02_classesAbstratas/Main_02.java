package Ex02_classesAbstratas;

import java.util.ArrayList;

public class Main_02 {

    public static void main(String[] args){
        //Criar ArrayList de pessoas
        ArrayList<Pessoa> pessoas = new ArrayList<>();


        //Adicionar objetos Aluno e Professor ao ArrayList
        pessoas.add(new Aluno("Joao", 20, "Engenharia"));
        pessoas.add(new Professor("Dr.Silva", 45, "Matemática"));

        //Iterar sobre o ArrayList e invocar métodos específicos

        for (Pessoa pessoa : pessoas){
            pessoa.exibirDetalhes();
            if(pessoa instanceof Aluno){
                ((Aluno) pessoa).mostrarCurso();
            } else if (pessoa instanceof Professor){
                ((Professor) pessoa).mostrarDepartamento();
            }
        }
    }
}
