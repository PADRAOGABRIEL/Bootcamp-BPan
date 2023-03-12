import java.io.IOException;
import java.util.Scanner;
/*Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e caso negativo calcule a área do trapézio
 */

public class Pj7 {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com um valor: ");
		double A = leitor.nextDouble();
        System.out.println("Entre com um valor: ");
		double B = leitor.nextDouble();
        System.out.println("Entre com um valor: ");
		double C = leitor.nextDouble();
		double maior;
		double soma;
		double areaTriangulo;
		
		if (A > B && A > C){
		  maior = A;
		  if (B+C > A && C+A > B && B+A > C){
		    soma = A+B+C;
		    System.out.println("Perimetro = " + soma);
		  } else {
		    areaTriangulo = ((A+B)*C)/2;
		    System.out.println("Area = " + areaTriangulo);
		  }
		} else if(B > A && B > C){
		  maior = B;
		  if (B+C > A && C+A > B && B+A > C){
		    soma = A+B+C;
		    System.out.println("Perimetro = " + soma);
		  } else {
		    areaTriangulo = ((A+B)*C)/2;
		    System.out.println("Area = " + areaTriangulo);
		  }
		} else{
		  maior = C;
		  if (B+C > A && C+A > B && B+A > C){
		    soma = A+B+C;
		    System.out.println("Perimetro = " + soma);
		  } else {
		    areaTriangulo = ((A+B)*C)/2;
		    System.out.println("Area = " + areaTriangulo);
		  }
		}
		
	}
}
