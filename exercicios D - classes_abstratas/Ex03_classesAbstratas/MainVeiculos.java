package Ex03_classesAbstratas;

public class MainVeiculos {
    public static void main (String[] args){

        Veiculo1 carro = new Carro(
                "Toyota",
                "Corolla",
                2020,
                5,
                "Gasolina"
        );

        Veiculo1 mota = new Mota(
                "Yamaha",
                "MT-07",
                2022,
                689,
                true
        );

        Veiculo1 camiao = new Camiao(
                "Volvo",
                "FH",
                2019,
                18.5,
                4
        );

        Veiculo1[] veiculos = {carro, mota, camiao};

        for(Veiculo1 v : veiculos){
            v.ligar();
            System.out.println(v.getDescricao());
            System.out.println();
        }
    }
}
