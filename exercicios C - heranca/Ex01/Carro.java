package Ex01;

public class Carro extends Veiculo{

    //Atributos
    private int numeroDePortas;


    //Getter
    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    //Construtor
    public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo);
        this.numeroDePortas = numeroDePortas;
    }

    //Outros métodos

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.printf("Número de portas: %d%n", this.numeroDePortas);
    }
}
