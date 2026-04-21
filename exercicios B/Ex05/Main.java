package Ex05;

public class Main {
    static void main() {

        Motor motor = new Motor(2.0, 150, false);
        Condutor condutor = new Condutor("Ana Silva", true);
        Carro carro = new Carro("Toyota", "Corolla", 2020, motor, condutor);

        carro.exibirDetalhes();
        carro.ligar();
        carro.exibirDetalhes();
        carro.desligar();
        carro.exibirDetalhes();

        Condutor semCarta = new Condutor("Rui Costa", false);
        carro.setCondutorCarro(semCarta);
        carro.ligar();
    }
}
