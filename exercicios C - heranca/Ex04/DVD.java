package Ex04;

public class DVD extends Obra{

    //Atributos
    private int duracaoMinutos;
    private String realizador;

    //Getters e Setters

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getRealizador() {
        return realizador;
    }

    public void setRealizador(String realizador) {
        this.realizador = realizador;
    }

    //Construtor

    public DVD(String titulo, int anoPublicacao, int duracaoMinutos, String realizador) {
        super(titulo, anoPublicacao);
        this.duracaoMinutos = duracaoMinutos;
        this.realizador = realizador;
    }

    //Outros Metodos

    @Override
    public String getDescricao() {
          return String.format("DVD: %s - %s, %d", super.getDescricao(), this.realizador, this.duracaoMinutos);

    }
}
