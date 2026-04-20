package _20260417.classes1;

public class Pessoa {

        //Atributos
        public String Nome;
        public int idade;
        //etc


    //->Construtor
    // Não possui valor de retorno
    // É sempre público
    // Possui o nome da classe

        public Pessoa(String nome, int idade) {
            this.Nome = nome;
            this.idade = idade;
        }

        public Pessoa(){

        }

        public Pessoa(String nome){
            this.Nome=nome;
        }


        //Métodos
    public void dormir(){
        System.out.println(this.Nome + ": zzzzzzzz");
    }

    //Não é acessível fora da classe
    private int abc(int a, int b){
        return a + b;
    }

    @Override
    public String toString(){
        return String.format("Olá, bom dia sou o/a %s, e tenho %d anos", this.Nome, this.idade);
    }






}
