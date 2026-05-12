package Ex02_interfaces;

public class Jornal2 extends ItemBiblioteca2{

    private String dataEdicao;
    private double valorBaseMulta;

    @Override
    public double getValorBaseMulta() {
        return valorBaseMulta;
    }

    public Jornal2(String titulo, int anoPublicacao, String dataEdicao, double valorBaseMulta) {
        super(titulo, anoPublicacao);
        this.dataEdicao = dataEdicao;
        this.valorBaseMulta = valorBaseMulta;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * valorBaseMulta;
    }

    @Override
    public String getDescricao() {
        return String.format("Jornal: %s (%d) - Edição de %s", getTitulo(), getAnoPublicacao(), dataEdicao);
    }
}
