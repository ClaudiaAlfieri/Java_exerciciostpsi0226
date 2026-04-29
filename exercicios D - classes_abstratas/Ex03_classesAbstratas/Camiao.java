package Ex03_classesAbstratas;

public class Camiao extends Veiculo1 {

    private double cargaMaximaToneladas;
    private int numeroEixos;

    public Camiao(String marca, String modelo, int ano, double cargaMaximaToneladas, int numeroEixos) {
        super(marca, modelo, ano);
        this.cargaMaximaToneladas = cargaMaximaToneladas;
        this.numeroEixos = numeroEixos;
    }

    @Override
    public String getDescricao(){
        return String.format("Camiao: %s - %f toneladas, %d eixos", getIdentificacao(), cargaMaximaToneladas, numeroEixos);
    }
}
