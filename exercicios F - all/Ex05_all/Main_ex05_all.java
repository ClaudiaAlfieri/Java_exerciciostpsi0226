package Ex05_all;

public class Main_ex05_all {

    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc = new ContaCorrente("João");
        ContaPoupanca cp = new ContaPoupanca("Maria");
        ContaEmpresarial ce = new ContaEmpresarial("Empresa ABC");

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.adicionarConta(ce);

        cc.depositar(100.0);
        cp.depositar(200.0);
        ce.depositar(300.0);

        System.out.println("Contas iniciais:");
        banco.listarContas();

        System.out.println("\nLevantamentos individuais:");
        try {
            cc.levantar(50.0);
        } catch (OperacaoInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            cp.levantar(180.0); // Excede 75%
        } catch (OperacaoInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            ce.levantar(750.0); // Permite descoberto
        } catch (OperacaoInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\nResumo após levantamentos:");
        banco.listarContas();

        System.out.println("\nLevantamento geral de 50€ de todas as contas:");
        banco.levantarDeTodos(50.0);

        System.out.println("\nResumo final:");
        banco.listarContas();
    }
}
