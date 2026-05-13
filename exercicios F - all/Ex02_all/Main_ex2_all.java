package Ex02_all;

public class Main_ex2_all {

    public static void main(String[] args) {
        Drone d = new Drone(202);
        d.mostrarEstado();

        // Teste 1: tentar executar comando com bateria fraca
        try {
            d.executarComando("Tirar fotografia");
        } catch (BateriaFracaException e) {
            System.out.println("Erro 1: " + e.getMessage());
        }

        // Teste 2: recarregar 30 minutos (aumenta 15%)
        d.recarregar(30);
        d.mostrarEstado();

        // Teste 3: comando deve funcionar agora
        try {
            d.executarComando("Levantar voo");
        } catch (BateriaFracaException e) {
            System.out.println("Erro 2: " + e.getMessage());
        }

        d.mostrarEstado();
    }
}
