package Ex02;

public class ContaBancaria {

    //Atributos
    private int numeroConta;
    private double saldo;

    //Metodos

    //Getters e Setters

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Construtor

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    //Outros métodos

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void levantar(double valor){
        saldo = saldo - valor;
    }

    public void exibirDetalhes(){
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }
}
