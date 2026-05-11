package _20260511;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    static void main() {

        //Cenário 1 - Lista de Alunos (lista de objetos ordenável)
        ArrayList<Aluno> alunos=new ArrayList<>();
        alunos.add(new Aluno(1,"Vitor"));
        alunos.add(new Aluno(2,"Vitor"));
        alunos.add(new Aluno(1,"Ana"));
        alunos.add(new Aluno(3,"Anabel"));
        alunos.add(new Aluno(1,"Xavier"));


        System.out.println(alunos.get(2));
        System.out.println("Iteração da Lista");
        for (Aluno a:alunos)
            System.out.println(a);

        Collections.sort(alunos);
        System.out.println("Iteração da Lista - Ordenada");
        for (Aluno a:alunos)
            System.out.println(a);


        alunos.remove(2);
        System.out.println("Iteração da Lista - com menos um");
        System.out.println(alunos.size());
        for (Aluno a:alunos)
            System.out.println(a);

        //Cenário 2 - Mapa de Alunos (HashMap) - Para pesquisar, inserir, remover, etc...
        System.out.println("----- MAPAS ------");
        HashMap<Integer,Aluno> mapa_alunos=new HashMap<>();
        mapa_alunos.put(1,new Aluno(1,"Vitor"));
        System.out.println(mapa_alunos.size());
        if(!mapa_alunos.containsKey(2))
            mapa_alunos.put(2,new Aluno(2,"Anibal"));
        else
            System.out.println("A chave 1 já existia. Não foi inserido");
        System.out.println(mapa_alunos.size());
        for (Aluno a: mapa_alunos.values())
            System.out.println(a);

        mapa_alunos.put(3,new Aluno(3,"Luís"));
        mapa_alunos.put(8,new Aluno(8,"Catarina"));
        mapa_alunos.put(6,new Aluno(6,"Filipe"));

        //Ordenação de uma mapa -> com recurso a uma lista
        System.out.println("Mapa de Alunos ordenados");
        ArrayList<Aluno> alunos_ordenados=new ArrayList<>(mapa_alunos.values());
        Collections.sort(alunos_ordenados);
        for (Aluno a: alunos_ordenados)
            System.out.println(a);

        mapa_alunos.get(2).setNome("Anibal Asdrubal");
        System.out.println("Após alterar o valor de um objeto no MAP");
        for (Aluno a: alunos_ordenados)
            System.out.println(a);

        System.out.println(mapa_alunos.containsKey(9));


    }
}
