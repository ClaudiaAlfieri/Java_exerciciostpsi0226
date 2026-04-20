package _20260417.classes_especializadas;

public class Carro {

    private String matricula;
    private int ano;
    public static int num_carros = 0;
    public int nc =0;
    public Pneu fe;
    public Pneu fd;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Carro(String matricula, int ano) {
        this.matricula = matricula;
        this.ano = ano;
        Carro.num_carros ++;
        this.nc++;
    }

    public void setFe(Pneu fe) {
        this.fe = fe;
    }

    public void setFd(Pneu fd) {
        this.fd = fd;
    }

    public static int somaInt(int a, int b){
        return a+b;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "matricula='" + matricula + '\'' +
                ", ano=" + ano +
                ", NC=" + this.nc +
                ", Numero_carros=" + num_carros +
                '}';
    }
}
