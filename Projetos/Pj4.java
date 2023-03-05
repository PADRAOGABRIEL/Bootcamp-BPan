import java.util.Scanner;

public class Pj4 {
    public static void main(String[] args){
        int casos, poderDeLuta;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número de consultas: ");
        casos = ler.nextInt();

        for(int i = 0; i < casos; i++){
            System.out.println("Digite o poder de luta: ");
            poderDeLuta = ler.nextInt();
            if(poderDeLuta > 8000){
                System.out.println("Mais de 8000!");
            } else {
                System.out.println("Inseto!");
            }
        }
}
}
