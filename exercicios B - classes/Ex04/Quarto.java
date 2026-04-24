package Ex04;

public class Quarto {

    //Atributos
    private int numero;
    private String tipo;
    private double precoNoite;

    //Metodos:

    //Getters and Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoNoite() {
        return precoNoite;
    }

    public void setPrecoNoite(double precoNoite) {
        this.precoNoite = precoNoite;
    }

    //Construtor


    public Quarto(int numero, String tipo, double precoNoite) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoNoite = precoNoite;
    }

    //Outros métodos

    public void exibirDetalhes(){
        System.out.println("  - Número: " + numero);
        System.out.println("  - Tipo: " + tipo);
        System.out.println("  - Preço noite: " + precoNoite);
    }
}
