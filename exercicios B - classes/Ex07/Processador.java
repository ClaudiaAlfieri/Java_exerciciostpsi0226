package Ex07;

public class Processador {

    //Atributos:
    private String marca;
    private String modelo;
    private double frequenciaGhz;

    //Métodos

    //Getters e Setters:

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrequenciaGhz() {
        return frequenciaGhz;
    }

    public void setFrequenciaGhz(double frequenciaGhz) {
        this.frequenciaGhz = frequenciaGhz;
    }

    //Construtor

    public Processador(String marca, String modelo, double frequenciaGhz) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequenciaGhz = frequenciaGhz;
    }

    //Outros métodos

    public void exibirDetalhes(){
        System.out.println("  - Marca: " + marca);
        System.out.println("  - Modelo: " + modelo);
        System.out.println("  - Frequência: " + frequenciaGhz + " GHz");
    }
}
