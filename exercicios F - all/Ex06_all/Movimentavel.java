package Ex06_all;

public interface Movimentavel {
    void entrada(int quantidade);
    void saida(int quantidade) throws StockInsuficienteException;
    String resumo();

    int compareTo(Produto outro);
}
