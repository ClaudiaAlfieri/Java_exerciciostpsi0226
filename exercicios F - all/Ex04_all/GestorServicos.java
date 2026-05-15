package Ex04_all;

import java.util.ArrayList;
import java.util.List;

public class GestorServicos {

    private List<Pagavel> lista;

    public GestorServicos() {
        this.lista = new ArrayList<>();
    }

    public void adicionarServico(Pagavel s) {
        lista.add(s);
    }

    public void listarPendentes() {
        for (Pagavel s : lista) {
            if (!s.isPago()) {
                System.out.println(s.resumo());
            }
        }
    }

    public void listarPagos() {
        for (Pagavel s : lista) {
            if (s.isPago()) {
                System.out.println(s.resumo());
            }
        }
    }

    public void pagarTodos() {
        for (Pagavel s : lista) {
            if (!s.isPago()) {
                try {
                    s.pagar(((Servico) s).getValor());
                } catch (PagamentoInvalidoException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }
    }
}