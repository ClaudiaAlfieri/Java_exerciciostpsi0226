package Ex01;

public class Veiculo {

    //Atributos
    private String marca;
    private String modelo;

    //Getters e Setters
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

    //Construtor

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Outros métodos

    public void exibirDetalhes(){
        System.out.println("Veiculo:");
        System.out.printf("Marca %s e Modelo %s%n", this.marca, this.modelo);
    }
}
