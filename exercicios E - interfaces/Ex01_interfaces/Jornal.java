package Ex01_interfaces;

public class Jornal extends ItemBiblioteca{

    private String dataEdicao;

    public Jornal(String titulo, int anoPublicacao, String dataEdicao) {
        super(titulo, anoPublicacao);
        this.dataEdicao = dataEdicao;
    }

    @Override
    public String getDescricao() {
        return String.format("Jornal: %s (%d) - Edição de %s", getTitulo(), getAnoPublicacao(), dataEdicao);
    }
}
