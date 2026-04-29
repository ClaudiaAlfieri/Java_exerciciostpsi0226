package EX04_classesAbstratas;

public class Golfinho extends Animal {

    private double velocidadeMaxima;
    private boolean treinado;

    public Golfinho(String nome, int idade, double peso, double velocidadeMaxima, boolean treinado) {
        super(nome, idade, peso);
        this.velocidadeMaxima = velocidadeMaxima;
        this.treinado = treinado;
    }

    @Override
    public String emitirSom() {
        return "Cliques e assobios";
    }

    @Override
    public String getTipoAlimentacao() {
        return "Carnívoro";
    }

    @Override
    public String getDescricao() {
        if (treinado) {
            return String.format("Golfinho: %s - velocidade máxima: %.1f km/h, treinado",
                    getIdentificacao(), velocidadeMaxima);
        } else {
            return String.format("Golfinho: %s - velocidade máxima: %.1f km/h, não treinado",
                    getIdentificacao(), velocidadeMaxima);
        }
    }

    public double calcularCustoMensalAlimentacao(){
        return (getPeso() * 30 * 2.8);
    }
}
