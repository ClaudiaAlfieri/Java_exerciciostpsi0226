package _20260417.classes_especializadas;

//Conceitos de classes especializadas e atributos static

//Metodos e atribuos estaticos pertencem a classe e são invocados utilizando o nome da classe.
//Static = variavel global.


public class App {

    static void main(){

        int a = 6;
        Integer a1 = 8;

        System.out.println(Math.sqrt(4.0));


        Carro c = new Carro("MX-MX-45", 2014);
        c.setFe(new Pneu());
        c.setFd(new Pneu());
        System.out.println(c.toString());

        for (int i =0; i <5; i++) {
            c=new Carro("AA-DD-0"+i, 2017+i);
            System.out.println(c);
        }

        System.out.println(Carro.num_carros);

        System.out.println(Carro.somaInt(4,7));
    }
}
