package Ex06_all;

public abstract class Produto implements Movimentavel, Comparable<Produto> {

    protected String nome;
    protected String categoria;
    protected int stock;

    public Produto(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    @Override
    public void entrada(int quantidade) {
        if (quantidade > 0){
            stock += quantidade;
        }
    }

    @Override
    public void saida(int quantidade) throws StockInsuficienteException {
        if (stock >= quantidade){
            stock -= quantidade;
        }else{
            throw new StockInsuficienteException("Estoque insuficiente");
        }
    }

    @Override
    public String resumo() {
        return nome + " | " + categoria + " | Stock: " + stock;
    }

    @Override
    public int compareTo(Produto outro) {
        return this.nome.compareTo(outro.nome);
    }
}
