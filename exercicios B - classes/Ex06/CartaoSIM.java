package Ex06;

public class CartaoSIM {

    //Atributos:

    private String operadora;
    private String numero;
    private boolean ativo;

    //Métodos

    //Getters e Setters

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    //Construtor

    public CartaoSIM(String operadora, String numero, boolean ativo) {
        this.operadora = operadora;
        this.numero = numero;
        this.ativo = ativo;
    }

    //Outros métodos:
    public void ativar(){
        ativo = true;
    }

    public void desativar(){
        ativo = false;
    }

    public void exibirDetalhes(){
        System.out.println("  - Operadora: " + operadora);
        System.out.println("  - Número: " + numero);
        System.out.println("  - Estado: " + (ativo ? "Ativo" : "Desativado"));
    }
}
