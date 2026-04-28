package Ex03;

public class Funcionario extends Pessoa {

    //Atributos
    private String funcao;
    private int anosServico;

    //Getters e Setters

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getAnosServico() {
        return anosServico;
    }

    public void setAnosServico(int anosServico) {
        this.anosServico = anosServico;
    }

    //Construtor

    public Funcionario(String nome, int idade, String funcao, int anosServico) {
        super(nome, idade);
        this.funcao = funcao;
        this.anosServico = anosServico;
    }

    //Outros Metodos
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.printf("Função: %s, Anos de Serviço: %d%n", this.funcao, this.anosServico);
    }
}
