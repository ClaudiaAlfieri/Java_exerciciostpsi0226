package Ex05;

public class Condutor {

    //Atributos:
    private String nome;
    private boolean cartaValida;

    //Métodos

    //Getters e Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isCartaValida() {
        return cartaValida;
    }

    public void setCartaValida(boolean cartaValida) {
        this.cartaValida = cartaValida;
    }

    //Construtor

    public Condutor(String nome, boolean cartaValida) {
        this.nome = nome;
        this.cartaValida = cartaValida;
    }

    //Outros métodos

    public void exibirDetalhes(){
        System.out.println("  - Nome: " + nome);
        System.out.println("  - Carta é válida: " + cartaValida);
    }
}
