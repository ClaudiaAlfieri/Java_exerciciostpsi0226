package Ex05;

public class Motor {

    //Atributos

    private double cilindrada;
    private int potenciaCV;
    private boolean ligado;

    //Métodos

    //Getters e Setters

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    //Construtor

    public Motor(double cilindrada, int potenciaCV, boolean ligado) {
        this.cilindrada = cilindrada;
        this.potenciaCV = potenciaCV;
        this.ligado = ligado;
    }

    //Outros métodos

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public void exibirDetalhes(){
        System.out.println("  - Cilindrada: " + cilindrada);
        System.out.println("  - Potência: " + potenciaCV);
        System.out.println("  - Estado: " + (ligado ? "Ligado" : "Desligado"));
    }
}
