package Ex01_classesAbstratas;

public class Circulo extends Forma{

    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * raio * raio;
        System.out.printf("Área do círculo é %f ", area);
    }

}
