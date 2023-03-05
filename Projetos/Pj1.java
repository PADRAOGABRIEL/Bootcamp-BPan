import java.util.Scanner;

public class Pj1{

    /*Calcular custo de um carro 0Km para a loja de carros */

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int custoFabrica = scan.nextInt();
      int porcentagemDistribuidor = scan.nextInt();
      int PercentualImpostos = scan.nextInt();

          int custoConsumidor;
   
          int Distribuidor;
          int ValorImpostos;

      Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
      ValorImpostos = (custoFabrica* PercentualImpostos) / 100;
    

      System.out.println(Distribuidor+custoFabrica+ValorImpostos);
  }

}
