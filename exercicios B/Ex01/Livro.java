package Ex01;

public class Livro {

    //Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    //Metodos

    //Métodos get e set para cada atributo.

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Cosntrutor que inicia todos os atributos:
    public Livro(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    //Um metodo emprestar() que define o atributo disponivel como false.

    public void emprestar(){
        disponivel = false;
    }

    //Um metodo devolver() que define o atributo disponivel como true.

    public void devolver(){
        disponivel = true;
    }

    //Um metodo exibirDetalhes() que imprime os detalhes do livro (título, autor, ano de publicação e disponibilidade).

    public void exibirDetalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Disponível: " + disponivel);
   }

}
