package Ex07;

public class Computador {

    //Atributos
    private String marca;
    private boolean ligado;
    private PlacaMae placaComputador;

    //Métodos
    //Getters e Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public PlacaMae getPlacaComputador() {
        return placaComputador;
    }

    public void setPlacaComputador(PlacaMae placaComputador) {
        this.placaComputador = placaComputador;
    }

    //Construtor

    public Computador(String marca, boolean ligado, PlacaMae placaComputador) {
        this.marca = marca;
        this.ligado = ligado;
        this.placaComputador = placaComputador;
    }

    //Outros métodos

    public void ligar(){
        ligado = true;
        System.out.println("Computador ligado");
    }

    public void desligar(){
        ligado = false;
        System.out.println("Computador desligado");
    }

    public void exibirDetalhes(){
        System.out.println("Computador:");
        System.out.println("  - Marca: " + marca);
        System.out.println("  - Estado: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("Placa Mãe: ");
        placaComputador.exibirDetalhes();
    }
}
