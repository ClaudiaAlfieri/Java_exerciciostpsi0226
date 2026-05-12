package Ex03_interfaces;

import java.util.ArrayList;
import java.util.List;

public class MainOficina {
    public static void main(String[] args) {

        Faturavel servico1 = new Revisao(
                1,
                "AA-00-BB",
                2.0,       // horas
                35.0,      // preço/hora
                120000,    // km
                80.0       // filtros + óleo
        );

        Faturavel servico2 = new Pintura(
                2,
                "CC-11-DD",
                5.0,       // horas
                35.0,      // preço/hora
                "Vermelho",
                150.0      // tintas
        );

        Faturavel servico3 = new ReparacaoMecanica(
                3,
                "EE-22-FF",
                3.0,       // horas
                40.0,      // preço/hora
                "Embraiagem",
                250.0      // peças
        );

        Faturavel servico4 = new DiagnosticoEletrico(
                4,
                "GG-33-HH",
                1.5,       // horas
                45.0,      // preço/hora
                "Luzes do tablier acendem aleatoriamente",
                60.0       // custo equipamento
        );

        List<Faturavel> servicos = new ArrayList<>();
        servicos.add(servico1);
        servicos.add(servico2);
        servicos.add(servico3);
        servicos.add(servico4);

        double totalGlobal = 0.0;

        System.out.println("=== Lista de serviços da oficina ===");
        for (Faturavel f : servicos) {
            ServicoOficina s = (ServicoOficina) f;
            System.out.println(s.toString());
            System.out.printf("  Total do serviço: %.2f EUR%n", f.calcularTotal());
            System.out.println("  Fatura: " + f.getDescricaoFatura());
            System.out.println();
            totalGlobal += f.calcularTotal();
        }

        System.out.printf("TOTAL GLOBAL DA OFICINA: %.2f EUR%n", totalGlobal);
    }
}