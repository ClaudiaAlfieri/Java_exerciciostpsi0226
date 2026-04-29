package EX04_classesAbstratas;

public class Papagaio extends Animal {

    private String corPrincipal;
    private int numeroPalavras;

    public Papagaio(String nome, int idade, double peso, String corPrincipal, int numeroPalavras) {
        super(nome, idade, peso);
        this.corPrincipal = corPrincipal;
        this.numeroPalavras = numeroPalavras;
    }

    @Override
    public String emitirSom() {
        return "Imita sons";
    }

    @Override
    public String getTipoAlimentacao() {
        return "Omnívoro";
    }

    @Override
    public String getDescricao() {
        return String.format("Papagaio: %s - cor principal: %s, sabe repetir %d palavras",
                getIdentificacao(), corPrincipal, numeroPalavras);
    }

    public double calcularCustoMensalAlimentacao(){
        return (getPeso() * 30 * 1.2);
    }
}
