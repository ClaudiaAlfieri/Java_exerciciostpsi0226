package Ex02_all;

public abstract class Veiculo {

    protected int id;
    protected double nivelBateria;

    public Veiculo(int id) {
        this.id = id;
        this.nivelBateria = 10.0;
    }

    public void mostrarEstado(){
        System.out.println("Veículos: #" + id + "| Bateria: " + nivelBateria + "%");
    };

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
}
