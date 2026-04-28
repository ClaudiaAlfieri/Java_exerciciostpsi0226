package Ex02;

public class Ex002 {
    static void main() {

        Gerente gerente1 = new Gerente("Joao", 2000);
        Gerente gerente2 = new Gerente("Marcio", 2700);
        Programador programador1 = new Programador("Luis", 2000);
        Programador programador2 = new Programador("Pedro", 1900);

        gerente1.gerirEquipa();
        gerente2.gerirEquipa();
        programador1.desenvolverSoftware();
        programador2.desenvolverSoftware();
    }
}
