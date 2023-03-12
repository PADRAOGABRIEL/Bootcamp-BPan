import java.io.IOException;
import java.util.Scanner;

/*Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli. 
Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda */

public class Pj8 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira seu salário para ver a alíquota de imposto: ");
        double renda = leitor.nextDouble();
        double imposto=0.00;
     
          if (renda <= 2000.00){
            imposto = 0.00;
            System.out.println("Isento");
          } else if(2000.00 < renda && renda <= 3000.00){
            double diferencaSalario = renda - 2000.00;
            imposto = diferencaSalario * 0.08;
            System.out.printf( "R$ %.2f ", imposto );
          } else if (3000.00 < renda && renda <= 4500.00){
            double diferencaSalario = renda - 3000.00;
            imposto = (diferencaSalario * 0.18) + (1000 * 0.08) ;
            System.out.printf( "R$ %.2f ", imposto );
          } else if (renda > 4500.00){
            double diferencaSalario = renda - 4500.00;
            imposto = (diferencaSalario * 0.28) + (1000.00*0.08) + (1500.00*0.18);
            System.out.printf( "R$ %.2f ", imposto );
          } else {
            
          }
    
        }
        
}
