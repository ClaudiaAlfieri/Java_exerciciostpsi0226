package Ex04;

public class Obra {

    //Atributos
    private String titulo;
    private int anoPublicacao;

    //Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    //Construtor

    public Obra(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    //Outros Metodos
    public String getDescricao() {
        return String.format("%s (%d)", this.titulo, this.anoPublicacao);
    }
}
