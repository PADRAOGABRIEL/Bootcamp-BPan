import java.util.Scanner;

public class Pj10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma frase qualquer: ");
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
        
           for (int i = 0; i < str.length(); i++){
             char c = str.toLowerCase().charAt(i);
               if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                 quantVogais++;
               }
           }

       System.out.println("Espacos em branco: " + espacosEmBranco + "   -->   Vogais: " + quantVogais);

       }
}
