package Ex03_classesAbstratas;

public class Carro extends Veiculo1 {

    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(String marca, String modelo, int ano, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String getDescricao(){
        return String.format("Carro: %s - %d portas, %s", getIdentificacao(), numeroPortas, tipoCombustivel);
    }
}
