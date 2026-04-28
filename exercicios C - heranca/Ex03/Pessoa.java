package Ex03;

public class Pessoa {

    //Atributos
    private String nome;
    private int idade;

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Construtor

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Outros Metodos

    public void getInfo(){
        System.out.printf("Nome: %s, Idade: %d, ", this.nome, this.idade);
    }
}
