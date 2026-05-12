package Ex01_interfaces;

public class Livro extends ItemBiblioteca{

    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, int anoPublicacao, String autor, int numeroPaginas) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String getDescricao() {
        return String.format("Livro: %s (%d) - %s, %d", getTitulo(), getAnoPublicacao(), autor, numeroPaginas);
    }
}
