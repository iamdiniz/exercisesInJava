import java.util.Scanner;

public class CaixaLoja {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Preco dos produtos: ");
    double precoProdutos = sc.nextDouble();
 
    System.out.print("Cobrar frete? ");
    boolean cobrarFrete = sc.nextBoolean();

    double valorFrete;

    if (cobrarFrete) {
      System.out.print("Valor do frete: ");
      valorFrete = sc.nextDouble();
    } else {
      valorFrete = 0;
    }

    double valorTotal = precoProdutos + valorFrete;

    System.out.printf("Valor total: R$%.2f%n", valorTotal);
  }

}