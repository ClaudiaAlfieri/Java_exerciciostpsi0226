package Ex04;

public class Revista extends Obra{

    //Atributos

    private int numero;
    private String mes;

    //Getters e Setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    //Construtor

    public Revista(String titulo, int anoPublicacao, int numero, String mes) {
        super(titulo, anoPublicacao);
        this.numero = numero;
        this.mes = mes;
    }

    //Outros Metodos
    @Override
    public String getDescricao() {
        return String.format("Revista: %s - %d, %s", super.getDescricao(), this.numero, this.mes);
    }

}
