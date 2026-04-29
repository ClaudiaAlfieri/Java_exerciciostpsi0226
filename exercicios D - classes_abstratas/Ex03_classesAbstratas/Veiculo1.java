package Ex03_classesAbstratas;

public abstract class Veiculo1 {

    private String marca;
    private String modelo;
    private int ano;

    public Veiculo1(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getIdentificacao(){
        return String.format("%s %s(%d)", marca, modelo, ano);
    }

    public void ligar(){
        System.out.println("O veículo está ligado");
    }

    public abstract String getDescricao();

}
