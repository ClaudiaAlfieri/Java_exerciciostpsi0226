package Ex01_interfaces;

public class DVD extends ItemBiblioteca {

    private String realizador;
    private int duracaoMinutos;

    public DVD(String titulo, int anoPublicacao, String realizador, int duracaoMinutos) {
        super(titulo, anoPublicacao);
        this.realizador = realizador;
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String getDescricao() {
        return String.format("DVD: %s (%d) - %s, %d", getTitulo(), getAnoPublicacao(), realizador, duracaoMinutos);
    }
}
