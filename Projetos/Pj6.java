import java.util.Scanner;

public class Pj6 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
       int morangos = input.nextInt();
       int macas = input.nextInt();
       double preçoFinalMorango;
       double preçoFinalMaca;
       
       if (morangos > 5){
         preçoFinalMorango = morangos * 2.20;
       } else{
         preçoFinalMorango = morangos * 2.50;
       }
       
       if (macas > 5){
         preçoFinalMaca = macas * 1.50;
       } else{
         preçoFinalMaca = macas * 1.80;
       }
       
       int quantidadeTotal = macas + morangos;
       
       double precoFinalCompra = preçoFinalMaca + preçoFinalMorango;
       
       if (quantidadeTotal > 8 || precoFinalCompra > 25.0){
         precoFinalCompra = precoFinalCompra * 0.9;
       }
       
       System.out.println(precoFinalCompra);
    }
}
