package Ex06_all;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Armazem {

    private HashMap<String, List<Produto>> produtosPorCategoria;

    public Armazem() {
        produtosPorCategoria = new HashMap<>();
    }

    public void adicionarProduto(Produto p) {
        String cat = p.categoria;
        if (!produtosPorCategoria.containsKey(cat)) {
            produtosPorCategoria.put(cat, new ArrayList<>());
        }
        produtosPorCategoria.get(cat).add(p);
    }

    public void entradaStock(String nome, int quantidade) {
        for (List<Produto> lista : produtosPorCategoria.values()) {
            for (Produto p : lista) {
                if (p.nome.equals(nome)) {
                    p.entrada(quantidade);
                }
            }
        }
    }

    public void saidaStock(String nome, int quantidade) throws StockInsuficienteException {
        for (List<Produto> lista : produtosPorCategoria.values()) {
            for (Produto p : lista) {
                if (p.nome.equals(nome)) {
                    p.saida(quantidade); // sem try/catch — deixa propagar
                }
            }
        }
    }

    public void listarTodosPorNome() {
        List<Produto> todos = new ArrayList<>();
        for (List<Produto> lista : produtosPorCategoria.values()) {
            todos.addAll(lista);
        }
        Collections.sort(todos);
        for (Produto p : todos) {
            System.out.println(p.resumo());
        }
    }

    public void listarTodosPorQuantidade() {
        List<Produto> todos = new ArrayList<>();
        for (List<Produto> lista : produtosPorCategoria.values()) {
            todos.addAll(lista);
        }
        todos.sort(Comparator.comparingInt(p -> p.stock));
        for (Produto p : todos) {
            System.out.println(p.resumo());
        }
    }

    public void listarPorCategoria(String categoria) {
        List<Produto> lista = produtosPorCategoria.get(categoria);
        if (lista == null) {
            System.out.println("Categoria não encontrada.");
            return;
        }
        for (Produto p : lista) {
            System.out.println(p.resumo());
        }
    }
}