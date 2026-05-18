package Ex07_all;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class GestorComboios {

    private List<Comboio> comboios;

    public GestorComboios() {
        this.comboios = new ArrayList<>();
    }

    public void adicionarComboio(String nome, String destino, int vagoes, String tipo) {
        Comboio c;
        if (tipo.equals("P")) {
            c = new ComboioPassageiros(nome, destino, vagoes);
        } else {
            c = new ComboioMercadorias(nome, destino, vagoes);
        }
        comboios.add(c);
    }

    public void listarPorNome() {
        List<Comboio> ordenada = new ArrayList<>(comboios);
        Collections.sort(ordenada);
        for (Comboio c : ordenada) {
            System.out.println(c.resumo());
        }
    }

    public void listarPorVagoes() {
        List<Comboio> ordenada = new ArrayList<>(comboios);
        ordenada.sort(Comparator.comparingInt(c -> c.vagoes));
        for (Comboio c : ordenada) {
            System.out.println(c.resumo());
        }
    }

    public void listarPorDestino(String destino) {
        for (Comboio c : comboios) {
            if (c.destino.equals(destino)) {
                System.out.println(c.resumo());
            }
        }
    }

    public void partirComboio(String nome) {
        for (Comboio c : comboios) {
            if (c.nome.equals(nome)) {
                try {
                    c.partir();
                } catch (EstadoInvalidoException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }
    }

    public void chegarComboio(String nome) {
        for (Comboio c : comboios) {
            if (c.nome.equals(nome)) {
                try {
                    c.chegar();
                } catch (EstadoInvalidoException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }
    }

}
