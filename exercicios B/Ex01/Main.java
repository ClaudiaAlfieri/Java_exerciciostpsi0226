package Ex01;

public class Main {
    public static void main() {

        Livro livro = new Livro("1984", "George Orwell",1946, true);
        livro.exibirDetalhes();
        livro.emprestar();
        livro.exibirDetalhes();
        livro.devolver();
        livro.exibirDetalhes();

    }
}
