package _20260417.classes2;

public class Carro {

    //Atributos
    public String matricula;
    private int ano;

    //Getters e  Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Cosntrutores

    public Carro(String matricula, int ano) {
        this.matricula = matricula;
        this.ano = ano;
    }

    public Carro(int ano) {
        this.ano = ano;
    }

    //Atalho para fazer um construtor: alt + insert


}
