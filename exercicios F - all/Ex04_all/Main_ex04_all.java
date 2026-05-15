package Ex04_all;

public class Main_ex04_all {

    public static void main(String[] args) {
        GestorServicos gestor = new GestorServicos();

        ServicoAgua agua1 = new ServicoAgua("Água - Janeiro", 25.0);
        ServicoInternet net1 = new ServicoInternet("Internet - Janeiro", 30.0);
        ServicoAgua agua2 = new ServicoAgua("Água - Fevereiro", 28.5);
        ServicoInternet net2 = new ServicoInternet("Internet - Fevereiro", 32.0);

        gestor.adicionarServico(agua1);
        gestor.adicionarServico(net1);
        gestor.adicionarServico(agua2);
        gestor.adicionarServico(net2);

        System.out.println("Serviços pendentes:");
        gestor.listarPendentes();

        // Pagar um deles com valor incorreto
        try {
            agua1.pagar(20.0);
        } catch (PagamentoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Pagar corretamente
        try {
            net1.pagar(30.0);
        } catch (PagamentoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\nServiços pagos:");
        gestor.listarPagos();

        System.out.println("\nPagamento automático dos restantes:");
        gestor.pagarTodos();

        System.out.println("\nResumo final:");
        gestor.listarPagos();
    }
}
