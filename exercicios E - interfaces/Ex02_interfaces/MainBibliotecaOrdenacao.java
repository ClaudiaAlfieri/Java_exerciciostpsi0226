package Ex02_interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainBibliotecaOrdenacao {
    public static void main(String[] args) {

        List<ItemBiblioteca2> itens = new ArrayList<>();

        itens.add(new Livro2(
                "Os Maias",
                1888,
                "Eça de Queirós",
                656,
                0.50
        ));

        itens.add(new Livro2(
                "1984",
                1949,
                "George Orwell",
                328,
                0.40
        ));

        itens.add(new DVD2(
                "Interstellar",
                2014,
                "Christopher Nolan",
                169,
                1.00
        ));

        itens.add(new Revista2(
                "National Geographic",
                2024,
                305,
                "Junho",
                0.30
        ));

        itens.add(new Jornal2(
                "Público",
                2025,
                "2025-11-17",
                0.20
        ));

        System.out.println("=== Lista original (sem ordenação) ===");
        for (ItemBiblioteca2 item : itens) {
            System.out.println(item.getDescricao());
        }

        // Ordenar usando Comparable
        Collections.sort(itens);

        System.out.println("\n=== Lista ordenada (Collections.sort) ===");
        for (ItemBiblioteca2 item : itens) {
            System.out.println(item.getDescricao());
        }

        int diasAtraso = 5;
        System.out.println("\n=== Multas para " + diasAtraso + " dias de atraso ===");
        for (ItemBiblioteca2 item : itens) {
            double multa = item.calcularMulta(diasAtraso);
            System.out.printf("%s -> Multa: %.2f €%n", item.getDescricao(), multa);
        }
    }
}