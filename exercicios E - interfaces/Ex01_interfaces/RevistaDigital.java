package Ex01_interfaces;

public class RevistaDigital extends ItemBiblioteca {

    private String plataforma;

    public RevistaDigital(String titulo, int anoPublicacao, String plataforma) {
        super(titulo, anoPublicacao);
        this.plataforma = plataforma;
    }

    @Override
    public String getDescricao() {
        return String.format("Revista Digital: %s (%d) - %s", getTitulo(), getAnoPublicacao(), plataforma);
    }
}
