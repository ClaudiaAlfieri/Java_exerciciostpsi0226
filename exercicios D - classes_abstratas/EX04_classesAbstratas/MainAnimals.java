package EX04_classesAbstratas;

import java.util.ArrayList;

public class MainAnimals {
        public static void main(String[] args) {

            ArrayList<Animal> animais = new ArrayList<>();

            animais.add(new Leao(
                    "Simba",
                    5,
                    190.5,
                    true,
                    2
            ));

            animais.add(new Papagaio(
                    "Louro",
                    1,
                    0.9,
                    "Verde",
                    25
            ));

            animais.add(new Golfinho(
                    "Splash",
                    8,
                    160.0,
                    55.5,
                    true
            ));

            for (Animal animal : animais) {
                System.out.println(animal.getDescricao());
                System.out.println("Som: " + animal.emitirSom());
                System.out.println("Alimentação: " + animal.getTipoAlimentacao());

                if (animal.isAdulto()) {
                    System.out.println("Estado: adulto");
                } else {
                    System.out.println("Estado: jovem");
                }

                System.out.println();
            }
        }
    }

