package Ex03_classesAbstratas;

public class Mota extends Veiculo1 {

    private int cilindrada;
    private boolean temTopCase;

    public Mota(String marca, String modelo, int ano, int cilindrada, boolean temTopCase) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
        this.temTopCase = temTopCase;
    }

    @Override
    public String getDescricao(){
        if (temTopCase) {
            return String.format("Mota: %s - %dcc, com top case", getIdentificacao(), cilindrada);
        } else {
            return String.format("Mota: %s - %dcc, sem top case", getIdentificacao(), cilindrada);
        }
    }
}
