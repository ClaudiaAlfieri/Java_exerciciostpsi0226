package Ex04;

public class Hospede {

    //Atributos

    private String nome;
    private String documento;

    //Métodos

    //Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    //Construtor

    public Hospede(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    //Outros métodos

    public void exibirDetalhes(){
        System.out.println("  - Nome: " + nome);
        System.out.println("  - Documento: " + documento);
    }
}
