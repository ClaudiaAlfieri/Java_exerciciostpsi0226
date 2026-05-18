package Ex07_all;

public abstract class Comboio implements Comparable<Comboio>{

    protected String nome;
    protected String destino;
    protected int vagoes;
    protected String estado;

    public Comboio(String nome, String destino, int vagoes) {
        this.nome = nome;
        this.destino = destino;
        this.vagoes = vagoes;
        this.estado = "Parado";
    }

    public void partir() throws EstadoInvalidoException {
        if (estado.equals("Em Viagem")) {
            throw new EstadoInvalidoException("O comboio " + nome + " já está em viagem.");
        }
        estado = "Em Viagem";
        System.out.println("Comboio " + nome + " partiu.");
    }

    public void chegar() throws EstadoInvalidoException {
        if (estado.equals("Parado")) {
            throw new EstadoInvalidoException("O comboio " + nome + " já está parado.");
        }
        estado = "Parado";
        System.out.println("Comboio " + nome + " chegou.");
    }

    public String resumo(){
        return String.format("%s | Destino: %s | Vagões: %d | Estado: %s", nome, destino, vagoes, estado);
    }

    @Override
    public int compareTo(Comboio outro) {
        return this.nome.compareTo(outro.nome);
    }
}
