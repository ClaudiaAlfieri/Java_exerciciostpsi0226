package Ex06;

public class Smartphone {

    //Atributos:

    private String marca;
    private String modelo;
    private boolean ligado;
    private Bateria bateriaTel;
    private CartaoSIM cartaoTel;

    //Métodos

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

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public Bateria getBateriaTel() {
        return bateriaTel;
    }

    public void setBateriaTel(Bateria bateriaTel) {
        this.bateriaTel = bateriaTel;
    }

    public CartaoSIM getCartaoTel() {
        return cartaoTel;
    }

    public void setCartaoTel(CartaoSIM cartaoTel) {
        this.cartaoTel = cartaoTel;
    }

    //Construtor

    public Smartphone(String marca, String modelo, boolean ligado, Bateria bateriaTel,CartaoSIM cartaoTel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
        this.bateriaTel = bateriaTel;
        this.cartaoTel = cartaoTel;
    }

    //Outros módulos

    public void ligar(){
        if (bateriaTel.percentagem() > 0){
            ligado = true;
            System.out.println("Telefone ligado");
        }
    }

    public void desligar(){
        ligado = false;
        System.out.println("Telefone desligado");
    }

    public void fazerChamada(int minutos){
        if (ligado && cartaoTel.isAtivo()){
            bateriaTel.consumir(minutos*50);
            System.out.println("Chamada de " + minutos + " minutos " + "efetuada. Consumo: " + (minutos *50) + "mah");
        }
    }

    public void exibirDetalhes(){
        System.out.println("Smartphone: ");
        System.out.println("  - Marca/Modelo: " + marca + modelo);
        System.out.println("  - Estado: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("Cartão SIM:");
        cartaoTel.exibirDetalhes();
        System.out.println("Bateria:");
        bateriaTel.exibirDetalhes();
        System.out.println();
    }

}

