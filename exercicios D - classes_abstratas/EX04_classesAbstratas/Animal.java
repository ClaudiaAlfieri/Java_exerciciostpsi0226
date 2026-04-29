package EX04_classesAbstratas;

public abstract class Animal {

    private String nome;
    private int idade;
    private double peso;

    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getIdentificacao(){
        return String.format(" %s - %d anos, %1f kg", nome, idade, peso);
    }

    public boolean isAdulto(){
        return idade >= 2;
    }

    public abstract String emitirSom();
    public abstract String getTipoAlimentacao();
    public abstract String getDescricao();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
