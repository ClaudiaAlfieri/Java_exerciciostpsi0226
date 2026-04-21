package Ex03;

public class Main {
    public static void main() {

        Veiculo carro = new Veiculo("Citroen", "C3", 2021);

        carro.getMarca();
        carro.getModelo();
        carro.getAno();
        carro.exibirDetalhes();
    }
}
