package Ex01_classesAbstratas;

public class Main_01 {
    public static void calcularAreas(Forma[] formas) {
        for (Forma forma : formas) {
            //Percorre o array — a cada volta do loop, a variável forma representa um elemento do array
            forma.calcularArea();
            //Chama o metodo calcularArea() da forma atual — pode ser um Circulo ou Retangulo, o Java sabe qual usar
        }
    }

    public static void main(String[] args) {
        Forma[] formas = new Forma[3];
        formas[0] = new Circulo("Circulo1", 4);
        formas[1] = new Retangulo("Retangulo1", 6, 3);
        formas[2] = new Circulo("Circulo2", 5);

        calcularAreas(formas);
    }
}
