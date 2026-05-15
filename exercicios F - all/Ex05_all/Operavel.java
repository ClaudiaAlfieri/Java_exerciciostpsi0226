package Ex05_all;

public interface Operavel {

    void depositar(double valor);
    void levantar(double valor) throws OperacaoInvalidaException;
    String resumo();
}
