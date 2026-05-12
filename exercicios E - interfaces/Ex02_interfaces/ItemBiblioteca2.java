package Ex02_interfaces;

public abstract class ItemBiblioteca2 implements Multavel, Comparable<ItemBiblioteca2> {

    private String titulo;
    private int anoPublicacao;

    public ItemBiblioteca2(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

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

    public abstract String getDescricao();

    @Override
    public int compareTo(ItemBiblioteca2 outro) {
        // 1º — compara os títulos
        int resultadoTitulo = this.titulo.compareTo(outro.getTitulo());

        // se os títulos forem diferentes, já tens a resposta
        if (resultadoTitulo != 0) {
            return resultadoTitulo;
        }

        // se os títulos forem iguais, desempata pelo ano
        return Integer.compare(this.anoPublicacao, outro.getAnoPublicacao());
    }
}
