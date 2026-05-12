package Ex02_interfaces;

public class Revista2 extends ItemBiblioteca2 {
    private int numero;
    private String mes;
    private double valorBaseMulta;

    @Override
    public double getValorBaseMulta() {
        return valorBaseMulta;
    }

    public Revista2(String titulo, int anoPublicacao, int numero, String mes, double valorBaseMulta) {
        super(titulo, anoPublicacao);
        this.numero = numero;
        this.mes = mes;
        this.valorBaseMulta = valorBaseMulta;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * valorBaseMulta;
    }

    @Override
    public String getDescricao() {
        return String.format("Revista Digital: %s (%d) - %d - %s", getTitulo(), getAnoPublicacao(), numero, mes);

    }
}
