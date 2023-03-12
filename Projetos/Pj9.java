import java.io.IOException;
import java.util.Scanner;

public class Pj9 {
    public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String AN1,AN2,AN3;
		String vertebrado = "vertebrado";
		String invertebrado = "invertebrado";
		String ave = "ave";
		String carnivoro = "carnivoro";
		String mamifero = "mamifero";
		String onivoro = "onivoro";
		String inseto = "inseto";
		String hematofago = "hematofago";
		String anelideo = "anelideo";
		
		
        System.out.println("Animal vertebrado ou invertebrado? ");
		AN1 = sc.nextLine();
        if (AN1.equals(vertebrado)){
            System.out.println("ave ou mamifero? ");
        } else {
            System.out.println("inseto ou anelideo? ");
        }
		AN2 = sc.nextLine();
        if (AN2.equals(mamifero)){
            System.out.println("onivoro ou herbivoro? ");
        } else if (AN2.equals(ave)){
            System.out.println("carnivoro ou onivoro? ");
        } else if (AN2.equals(inseto)){
            System.out.println("hematofago ou herbivoro? ");
        } else {
            System.out.println("hematofago ou onivoro? ");
        }
		AN3 = sc.nextLine();
	
    if (AN1.equals(vertebrado)){
      if (AN2.equals(ave)){
        if(AN3.equals(carnivoro)){
            System.out.println("ANIMAL ENCONTRADO!!!");
          System.out.println("aguia");
        } else {
            System.out.println("ANIMAL ENCONTRADO!!!");
          System.out.println("pomba");
        }
      } else if (AN2.equals(mamifero)){
        if(AN3.equals(onivoro)){
            System.out.println("ANIMAL ENCONTRADO!!!");
          System.out.println("homem");
        } else {
            System.out.println("ANIMAL ENCONTRADO!!!");
          System.out.println("vaca");
        }
      }
    } else if (AN1.equals(invertebrado)){
      if (AN2.equals(inseto)){
        if(AN3.equals(hematofago)){
            System.out.println("ANIMAL ENCONTRADO!!!");
          System.out.println("pulga");
        } else {
            System.out.println("ANIMAL ENCONTRADO!!!");
          System.out.println("lagarta");
        }
      } else if (AN2.equals(anelideo)){
        if(AN3.equals(hematofago)){
            System.out.println("ANIMAL ENCONTRADO!!!");
          System.out.println("sanguessuga");
        } else {
            System.out.println("ANIMAL ENCONTRADO!!!");
          System.out.println("minhoca");
        }
      }
    }
	}
}
