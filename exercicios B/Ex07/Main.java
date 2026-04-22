package Ex07;

public class Main {
    static void main() {

        Processador cpu = new Processador("Intel", "i7-12700K",3.8);
        Memoria ram = new Memoria(16, "DDR5");
        DiscoRigido disco = new DiscoRigido(1000, "SSD");
        PlacaMae placa = new PlacaMae("ASUS Prime Z690", cpu, ram, disco);
        Computador pc = new Computador("Lenovo", false, placa);

        pc.exibirDetalhes();
        System.out.println();
        pc.ligar();
        pc.exibirDetalhes();
        System.out.println();
        pc.desligar();
        pc.exibirDetalhes();
    }
}
