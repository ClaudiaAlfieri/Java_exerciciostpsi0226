package Ex04;

public class MainBiblioteca {
    static void main() {

        Obra livro = new Livro("Os maias", 1888, "Eça de Queirós", 656);
        Obra revista = new Revista("National Geographic", 2024, 305, "Junho");
        Obra dvd = new DVD("Interstellar",2014, 169, "Christopher Nolan");
        Obra jornal = new Jornal("Público", 2025, "2025-11-17");

        //Colocar todas numa coleção:

        Obra[] obras = {livro, revista, dvd, jornal};

        //Testar polimorfismo:

        for (Obra o : obras){
            System.out.println(o.getDescricao());
        }


    }

}
