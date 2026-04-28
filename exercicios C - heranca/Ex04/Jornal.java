package Ex04;

public class Jornal extends Obra {

    //Atributos
    private String dataEdicao;

    //Getters e Setters

    public String getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    //Construtor

    public Jornal(String titulo, int anoPublicacao, String dataEdicao) {
        super(titulo, anoPublicacao);
        this.dataEdicao = dataEdicao;
    }

    //Outros Metodos
    @Override
    public String getDescricao() {
         return String.format("Jornal: %s - %s", super.getDescricao(), this.dataEdicao);
    }
}
