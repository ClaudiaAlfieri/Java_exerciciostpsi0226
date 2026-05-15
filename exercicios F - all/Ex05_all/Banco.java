package Ex05_all;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Operavel> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    };

    public void adicionarConta(Operavel conta){
        contas.add(conta);
    };

    public void listarContas(){
        for (Operavel conta : contas) {
            System.out.println(conta.resumo());
        }
    };

    public void levantarDeTodos(double valor) {
        for (Operavel conta : contas) {
            try {
                conta.levantar(valor);
            } catch (OperacaoInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
