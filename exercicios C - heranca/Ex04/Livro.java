package Ex04;

public class Livro extends Obra{

    //Atributos
    private String autor;
    private int numeroPaginas;

    //Getters e Setters

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    //Construtor

    public Livro(String titulo, int anoPublicacao, String autor, int numeroPaginas) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    //Outros Metodos
    @Override
    public String getDescricao() {
        return String.format("Livro: %s - %s, %d", super.getDescricao(), this.autor, this.numeroPaginas);
    }
}
