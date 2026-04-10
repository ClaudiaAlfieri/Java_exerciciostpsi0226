package Ex01;

public class Ex01 {
    static void main() {
        //Condição partida
        int menor=Integer.MAX_VALUE;
        int maior=Integer.MIN_VALUE;
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números pretende introduzir: ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Número não válido");
            return;
        }
        //Solicitar numeros ao user
        for(int i=1;i<=n;i++){
            System.out.printf("Insira número %d: ",i);
            input=sc.nextInt();
            if(input<menor){
                menor=input;
            }
            if(input>maior){
                maior=input;
            }
        }

        System.out.println("Menor: "+menor);
        System.out.println("Maior: "+maior);

    }
}
