package _20260423.Ex1;

public class Main {

    static void main() {
       Escola escola=new Escola("Atec");
        /* Aluno a=new Aluno();
        a.nif="22222";
        Professor p=new Professor();
        p.ordenado=22454567658.90;

        Pessoa pessoa=new Pessoa();
        pessoa.idade=12;
        */

        //Menu para criar ou ver alunos ou professores

        //CriarAluno
        escola.criarAluno("Anabela","999999",23,18.9);
        escola.criarAluno("João","66666666",13,13.6);
        //Criar Professor
        //escola.criarProfessor();
        escola.criarProfessor("Vitor","1111111",50,4986745967954.9);
        escola.criarProfessor("Anibal","2354678",44,12.89);
        //Listar Pessoas da Escola
        //escola.listarPessoas();
        escola.listarPessoas();

        //etc....
    }

}
