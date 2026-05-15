package Ex04_all;

public interface Pagavel {
    void pagar(double valor) throws PagamentoInvalidoException;
    boolean isPago();
    String resumo();
}
