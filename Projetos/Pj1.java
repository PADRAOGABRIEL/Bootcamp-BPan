import java.util.Scanner;

public class Pj1{

    /*Calcular custo de um carro 0Km para a loja de carros */

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o custo da fábrica: ");
    int custoFabrica = scan.nextInt();
      System.out.println("Digite a porcentagem do distribuidor: ");  
      int porcentagemDistribuidor = scan.nextInt();
      System.out.println("Digite a porcentagem de impostos: ");
      int PercentualImpostos = scan.nextInt();

          int custoConsumidor;
   
          int Distribuidor;
          int ValorImpostos;

      Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
      ValorImpostos = (custoFabrica* PercentualImpostos) / 100;
    

      System.out.println(Distribuidor+custoFabrica+ValorImpostos);
  }

}
