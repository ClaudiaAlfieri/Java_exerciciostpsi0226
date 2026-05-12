package Ex02_interfaces;

public class Livro2 extends ItemBiblioteca2{

    private String autor;
    private int numeroPaginas;
    private double valorBaseMulta;


    public Livro2(String titulo, int anoPublicacao, String autor, int numeroPaginas, double valorBaseMulta) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.valorBaseMulta = valorBaseMulta;
    }

    @Override
    public double getValorBaseMulta() {
        return valorBaseMulta;
    }

    @Override
    public String getDescricao() {
        return String.format("Livro: %s (%d) - %s, %d", getTitulo(), getAnoPublicacao(), autor, numeroPaginas);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * valorBaseMulta;
    }
}
