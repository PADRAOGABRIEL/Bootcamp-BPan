import java.util.Scanner;

/*Leia 6 valores. Em seguida, mostre quantos destes valores
 digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal. */

public class Pj2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
     int cont = 0;
     double media = 0;
     double x;
     double[] array = new double[6];

        for (int i=0;i<=5;i++) {
        	array[i] = leitor.nextDouble();
        	if(array[i] > 0){
        	  cont++;
        	  media += array[i];
        	}
        }
        
        media = media/cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
