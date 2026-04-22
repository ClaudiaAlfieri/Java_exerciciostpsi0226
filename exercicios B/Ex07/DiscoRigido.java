package Ex07;

public class DiscoRigido {

    //Atributos
    private int capacidadeGB;
    private String tipo;

    //Métodos
    //Getters e Setters

    public int getCapacidade() {
        return capacidadeGB;
    }

    public void setCapacidade(int capacidade) {
        this.capacidadeGB = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Construtor

    public DiscoRigido(int capacidade, String tipo) {
        this.capacidadeGB = capacidade;
        this.tipo = tipo;
    }

    //Outros métodos
    public void exibirDetalhes(){
        System.out.println("  - Capacidade: " + capacidadeGB + " GB");
        System.out.println("  - Tipo: " + tipo);
    }
}
