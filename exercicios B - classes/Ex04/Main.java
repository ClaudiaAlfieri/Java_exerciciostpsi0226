package Ex04;

public class Main {
    static void main() {

        Quarto quarto = new Quarto(305, "Suíte", 120.0);
        Hospede hospede = new Hospede("Miguel ROcha", "123456");
        ReservaHotel reserva = new ReservaHotel("RZ-001", 3, false, quarto, hospede);

        reserva.exibirDetalhes();
        System.out.printf("Total: %.2f €%n%n", reserva.calcularTotal());

        reserva.confirmar();
        reserva.exibirDetalhes();

        reserva.cancelar();
        reserva.exibirDetalhes();

    }
}
