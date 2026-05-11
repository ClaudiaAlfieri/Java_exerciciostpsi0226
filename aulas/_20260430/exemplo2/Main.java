package _20260430.exemplo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    static void main() {
        ArrayList<Pessoa> pessoas=new ArrayList<>();
        pessoas.add(new Pessoa("Paulo",45));
        pessoas.add(new Pessoa("Anabela", 36));
        pessoas.add(new Pessoa("Vitor",49));
        pessoas.add(new Pessoa("Zacarias",17));
        pessoas.add(new Pessoa("Carlota",17));
        pessoas.add(new Pessoa("Manuel", 36));
        LinkedList<Pessoa> pessosL=new LinkedList<>();


        System.out.println(Math.max(45,87));

        //System.out.println("Ana".compareTo("Bia"));
        //System.out.println("Ana".compareTo("Ana"));
        //System.out.println("Bia".compareTo("Ana"));

        for (Pessoa p:pessoas){
            System.out.println(p);
        }
        System.out.println("-----");
        Collections.sort(pessoas);
        for (Pessoa p:pessoas){
            System.out.println(p);
        }
    }

}
