package Ex06;

public class Bateria {

    //Atributos:

    private int capacidadeMah;
    private int cargaAtualMah;

    //Métodos:

    //Getters e Setters


    public int getCapacidadeMah() {
        return capacidadeMah;
    }

    public void setCapacidadeMah(int capacidadeMah) {
        this.capacidadeMah = capacidadeMah;
    }

    public int getCargaAtualMah() {
        return cargaAtualMah;
    }

    public void setCargaAtualMah(int cargaAtualMah) {
        this.cargaAtualMah = cargaAtualMah;
    }

    //Construtor:


    public Bateria(int capacidadeMah, int cargaAtualMah) {
        this.capacidadeMah = capacidadeMah;
        this.cargaAtualMah = cargaAtualMah;
    }

    //Outros métodos:

    public void carregar(int mah){
        cargaAtualMah = Math.min(cargaAtualMah + mah, capacidadeMah);
        System.out.println("Bateria carregada com + " + mah + " mah.");
    }

    public void consumir(int mah){
        cargaAtualMah = Math.max(cargaAtualMah - mah, 0);
    }

    public double percentagem(){
        return (cargaAtualMah * 100)/capacidadeMah;
    }

    public void exibirDetalhes(){
        System.out.println("  - Capacidade: " + capacidadeMah);
        System.out.println("  - Carga atual: " + cargaAtualMah);
        System.out.println("  - Percentagem: " + percentagem() + "%");
    }
}
