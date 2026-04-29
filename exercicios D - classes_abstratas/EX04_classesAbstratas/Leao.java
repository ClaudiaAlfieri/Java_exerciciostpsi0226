package EX04_classesAbstratas;

public class Leao extends Animal{

    private boolean liderAlcateia;
    private int numeroPresasPorDia;

    public Leao(String nome, int idade, double peso, boolean liderAlcateia, int numeroPresasPorDia) {
        super(nome, idade, peso);
        this.liderAlcateia = liderAlcateia;
        this.numeroPresasPorDia = numeroPresasPorDia;
    }

    @Override
    public String emitirSom() {
        return "Rugido";
    }

    @Override
    public String getTipoAlimentacao() {
        return "Carnívoro";
    }

    @Override
    public String getDescricao() {
        if (liderAlcateia) {
            return String.format("Leão: %s - %s, líder da alcateia, %d presas/dia",
                    getIdentificacao(), getTipoAlimentacao(), numeroPresasPorDia);
        } else {
            return String.format("Leão: %s - %s, não é líder, %d presas/dia",
                    getIdentificacao(), getTipoAlimentacao(), numeroPresasPorDia);
        }
    }

    public double calcularCustoMensalAlimentacao(){
        return (numeroPresasPorDia * 30 * 12.5);
    }
}
