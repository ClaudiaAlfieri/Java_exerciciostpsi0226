package Ex02_all;

public class Drone extends Veiculo implements ControlavelRemotamente, Recarregavel {

    public Drone(int id) {
        super(id);
    }

    @Override
    public void executarComando(String comando) throws BateriaFracaException {
            if(nivelBateria < 20.0){
            throw new BateriaFracaException("Bateria demasiado fraca para o comando: " + comando);
        }
        else{
            System.out.println("Comando executado: " + comando);
            nivelBateria = 15.0;
            nivelBateria = Math.max(0.0, nivelBateria - 15.0);
        }
    }

    @Override
    public void recarregar(int minutos) {
        setNivelBateria(Math.min(100.0, nivelBateria + minutos * 0.5));
        System.out.println("Drone carregando por " + minutos + "minutos.");

    }


}
