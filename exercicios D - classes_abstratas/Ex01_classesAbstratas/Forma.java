package Ex01_classesAbstratas;

public abstract class Forma {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Forma(String nome) {
        this.nome = nome;
    }

    public abstract void calcularArea();


}
