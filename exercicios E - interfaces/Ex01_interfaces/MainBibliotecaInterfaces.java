package Ex01_interfaces;

import java.util.ArrayList;
import java.util.List;

public class MainBibliotecaInterfaces {
    public static void main(String[] args) {

        // Criar vários itens de biblioteca
        Emprestavel livro = new Livro(
                "Os Maias",
                1888,
                "Eça de Queirós",
                656
        );

        Emprestavel dvd = new DVD(
                "Interstellar",
                2014,
                "Christopher Nolan",
                169
        );

        Emprestavel revista = new RevistaDigital(
                "National Geographic",
                2024,
                "App"
        );

        Emprestavel jornal = new Jornal(
                "Público",
                2025,
                "2025-11-17"
        );

        // Colocar todos numa coleção polimórfica
        List<Emprestavel> itens = new ArrayList<>();
        itens.add(livro);
        itens.add(dvd);
        itens.add(revista);
        itens.add(jornal);

        System.out.println("=== Estado inicial dos itens ===");
        for (Emprestavel e : itens) {
            // Cast opcional se quiseres usar getDescricao() de ItemBiblioteca
            ItemBiblioteca item = (ItemBiblioteca) e;
            System.out.println(item.getDescricao() + " -> " + e.getInfoEmprestimo());
        }

        // Emprestar alguns itens
        livro.emprestar();
        dvd.emprestar();

        System.out.println("\n=== Depois de alguns empréstimos ===");
        for (Emprestavel e : itens) {
            ItemBiblioteca item = (ItemBiblioteca) e;
            System.out.println(item.getDescricao() + " -> " + e.getInfoEmprestimo());
        }

        // Devolver um item
        dvd.devolver();

        System.out.println("\n=== Depois de devolver o DVD ===");
        for (Emprestavel e : itens) {
            ItemBiblioteca item = (ItemBiblioteca) e;
            System.out.println(item.getDescricao() + " -> " + e.getInfoEmprestimo());
        }
    }
}