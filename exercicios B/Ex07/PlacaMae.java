package Ex07;

public class PlacaMae {

    //Atributos
    private String modelo;
    private Processador processadorModelo;
    private Memoria memoriaModelo;
    private DiscoRigido discoModelo;

    //Métodos

    //Getters e Setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Processador getProcessadorModelo() {
        return processadorModelo;
    }

    public void setProcessadorModelo(Processador processadorModelo) {
        this.processadorModelo = processadorModelo;
    }

    public Memoria getMemoriaModelo() {
        return memoriaModelo;
    }

    public void setMemoriaModelo(Memoria memoriaModelo) {
        this.memoriaModelo = memoriaModelo;
    }

    public DiscoRigido getDiscoModelo() {
        return discoModelo;
    }

    public void setDiscoModelo(DiscoRigido discoModelo) {
        this.discoModelo = discoModelo;
    }

    //Construtor

    public PlacaMae(String modelo, Processador processadorModelo, Memoria memoriaModelo, DiscoRigido discoModelo) {
        this.modelo = modelo;
        this.processadorModelo = processadorModelo;
        this.memoriaModelo = memoriaModelo;
        this.discoModelo = discoModelo;
    }

    //Outros métodos
    public void exibirDetalhes(){
        System.out.println("  - Modelo: " + modelo);
        System.out.println("Processador: ");
        processadorModelo.exibirDetalhes();
        System.out.println("Memória: ");
        memoriaModelo.exibirDetalhes();
        System.out.println("Disco Rígido: ");
        discoModelo.exibirDetalhes();
    }
}
