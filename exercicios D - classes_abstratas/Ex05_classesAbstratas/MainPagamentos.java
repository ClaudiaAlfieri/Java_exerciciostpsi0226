package Ex05_classesAbstratas;

import java.util.ArrayList;

public class MainPagamentos {
    public static void main(String[] args) {

        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new PagamentoCartao(
                "REF001",
                75.50,
                "2026-04-28",
                "1234",
                "Ana Silva"
        ));

        pagamentos.add(new PagamentoMBWay(
                "REF002",
                22.90,
                "2026-04-28",
                "912345678",
                true
        ));

        pagamentos.add(new PagamentoTransferenciaBancaria(
                "REF003",
                150.00,
                "2026-04-29",
                "PT50002700000001234567833",
                2
        ));

        for (Pagamento pagamento : pagamentos) {
            System.out.println(pagamento.getDescricao());
            System.out.println(pagamento.processarPagamento());
            System.out.printf("Taxa: %.2f€%n", pagamento.calcularTaxa());

            if (pagamento.isValorValido()) {
                System.out.println("Estado do valor: válido");
            } else {
                System.out.println("Estado do valor: inválido");
            }

            System.out.println();
        }
    }
}