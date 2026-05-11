package _20260430.exemplo1;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Valoravel> objetos=new ArrayList<>();

        objetos.add(new Cadeira(34));
        objetos.add(new Quadro(56));
        objetos.add(new Animal(345));

        for (Valoravel v: objetos){
            System.out.println(v.valor_objeto());
        }
    }
}
