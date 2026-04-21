package Ex05;

public class Carro {

    //Atributos

    private String marca;
    private String modelo;
    private int ano;
    private Motor motorCarro;
    private Condutor condutorCarro;

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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotorCarro() {
        return motorCarro;
    }

    public void setMotorCarro(Motor motorCarro) {
        this.motorCarro = motorCarro;
    }

    public Condutor getCondutorCarro() {
        return condutorCarro;
    }

    public void setCondutorCarro(Condutor condutorCarro) {
        this.condutorCarro = condutorCarro;
    }

    //Construtor:

    public Carro(String marca, String modelo, int ano, Motor motorCarro, Condutor condutorCarro) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motorCarro = motorCarro;
        this.condutorCarro = condutorCarro;
    }

    //Outros métodos

    public void ligar(){
        if (condutorCarro.isCartaValida() == true){
            motorCarro.ligar();
            System.out.println("Carro ligado com sucesso");
        }
        else{
            System.out.println("Não é possível ligar: condutor sem carta válida.");
        }
    }

    public void desligar(){
        motorCarro.desligar();
        System.out.println("Carro desligado.");
    }

    public void exibirDetalhes(){
        System.out.println("Carro:");
        System.out.println("  - Marca/Modelo: " + marca + " " + modelo);
        System.out.println("  - Ano: " + ano);
        System.out.println("Condutor:");
        condutorCarro.exibirDetalhes();
        System.out.println("Motor:");
        motorCarro.exibirDetalhes();
        System.out.println();
    }



}
