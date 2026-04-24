package Ex04;

public class ReservaHotel {

    //Atributos:

    private String codigo;
    private int noites;
    private boolean confirmada;
    private Quarto quartoReserva;
    private Hospede hospedeReserva;

    //Métodos

    //Getters e Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNoites() {
        return noites;
    }

    public void setNoites(int noites) {
        this.noites = noites;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public Quarto getQuartoReserva() {
        return quartoReserva;
    }

    public void setQuartoReserva(Quarto quartoReserva) {
        this.quartoReserva = quartoReserva;
    }

    public Hospede getHospedeReserva() {
        return hospedeReserva;
    }

    public void setHospedeReserva(Hospede hospedeReserva) {
        this.hospedeReserva = hospedeReserva;
    }

    //Construtor

    public ReservaHotel(String codigo, int noites, boolean confirmada, Quarto quartoReserva, Hospede hospedeReserva) {
        this.codigo = codigo;
        this.noites = noites;
        this.confirmada = confirmada;
        this.quartoReserva = quartoReserva;
        this.hospedeReserva = hospedeReserva;
    }

    //Outros métodos

    public void confirmar(){
        confirmada = true;
    }

    public void cancelar() {
        confirmada = false;
    }

    public double calcularTotal(){
        double total = noites * quartoReserva.getPrecoNoite();
        return total;
    }

    public void exibirDetalhes(){
        System.out.println("Reserva:");
        System.out.println("  - Código: " + codigo);
        System.out.println("  - Noites: " + noites);
        System.out.println("  - Estado: " + (confirmada ? "Confirmada" : "Pendente/Cancelada"));
        System.out.println("Hóspede:");
        hospedeReserva.exibirDetalhes();
        System.out.println("Quarto:");
        quartoReserva.exibirDetalhes();
        System.out.println();

    }

}
