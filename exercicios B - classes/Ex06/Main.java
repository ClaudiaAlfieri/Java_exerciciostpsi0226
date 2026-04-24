package Ex06;

public class Main {
    static void main() {

        Bateria bat = new Bateria(4000, 500);
        CartaoSIM sim = new CartaoSIM("MEO", "930455119", true);
        Smartphone tel = new Smartphone("Xiaomi", "Mi 11", false, bat, sim );

        tel.exibirDetalhes();
        tel.ligar();
        tel.fazerChamada(5);
        tel.exibirDetalhes();
        bat.carregar(1000);
        tel.exibirDetalhes();
        tel.desligar();
        tel.exibirDetalhes();
    }
}
