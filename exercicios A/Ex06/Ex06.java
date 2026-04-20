package Ex06;

public class Ex06 {
    static void main() {

        //Através de ciclos de repetição implemente o seguinte padrão como output:

        // ##########
        // #**#**#**#
        // #**#**#**#
        // ##########

        char ast='*';
        char cardinal='#';

        System.out.println();

        for(int linha = 0; linha <= 3; linha++){

            if(linha == 0 || linha == 3) {
                for (int l = 0; l <= 9; l++) {
                    System.out.print(cardinal);
                }
            }

            if (linha == 1 || linha == 2) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print(cardinal);
                    System.out.print(ast);
                    System.out.print(ast);
                }
                System.out.print(cardinal);
            }

            System.out.println();
        }
    }
}
