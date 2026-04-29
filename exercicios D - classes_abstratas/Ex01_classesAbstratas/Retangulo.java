package Ex01_classesAbstratas;

public class Retangulo extends Forma{

    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = largura*altura;
        System.out.printf("A área do retangulo é %f", area);

    }
}
