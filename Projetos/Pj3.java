import java.util.Scanner;

/*Neste desafio, faça um programa que calcule o valor de H com N termos. 

Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.  */

public class Pj3 {
    public static void main(String[] Args) {

        double h=0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double fraçao=0.00;
        
   
        for (int i = 1; i <= n; i++) {
        fraçao = 1.00/i;
        h += fraçao;
       }
       
        System.out.println(String.format("%.0f", h));
      }
}
