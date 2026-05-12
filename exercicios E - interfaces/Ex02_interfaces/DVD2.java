package Ex02_interfaces;

public class DVD2 extends ItemBiblioteca2{

    private String realizador;
    private int duracaoMinutos;
    private double valorBaseMulta;

    @Override
    public double getValorBaseMulta() {
        return valorBaseMulta;
    }

    public DVD2(String titulo, int anoPublicacao, String realizador, int duracaoMinutos, double valorBaseMulta) {
        super(titulo, anoPublicacao);
        this.realizador = realizador;
        this.duracaoMinutos = duracaoMinutos;
        this.valorBaseMulta = valorBaseMulta;
    }

    @Override
    public String getDescricao() {
        return String.format("DVD: %s (%d) - %s, %d", getTitulo(), getAnoPublicacao(), realizador, duracaoMinutos);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        if (diasAtraso <= 3){
           return diasAtraso * valorBaseMulta;
        }else{
            return (diasAtraso * valorBaseMulta) * 2;
        }
    }
}
