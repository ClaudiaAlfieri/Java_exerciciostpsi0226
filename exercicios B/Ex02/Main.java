package Ex02;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(1234, 4563);

        conta1.depositar(500);
        conta1.levantar(200);
        conta1.getNumeroConta();
        conta1.getSaldo();
        conta1.exibirDetalhes();

    }
}
