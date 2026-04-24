package Ex07;

public class Memoria {

    //Atributos

    private int capacidadeGB;
    private String tipo;

    //Métodos

    //Getters e Setters

    public int getCapacidadeGB() {
        return capacidadeGB;
    }

    public void setCapacidadeGB(int capacidadeGB) {
        this.capacidadeGB = capacidadeGB;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Construtor

    public Memoria(int capacidadeGB, String tipo) {
        this.capacidadeGB = capacidadeGB;
        this.tipo = tipo;
    }

    //Outros métodos:

    public void exibirDetalhes(){
        System.out.println("  - Capacidade: " + capacidadeGB + " GB");
        System.out.println("  - Tipo: " + tipo);
    }
}
