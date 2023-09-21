import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Peso: ");
    int peso = sc.nextInt();

    System.out.print("Altura: ");
    double altura = sc.nextDouble();

    double imc = peso / (altura * altura);

    if (imc < 18.5) {
      System.out.println("Abaixo do peso ideal.");
    } else if (imc < 25) {
      System.out.println("Peso ideal.");
    } else if (imc < 30) { 
      System.out.println("Acima do peso.");
    } else if (imc < 35) {
      System.out.println("Obesidade graau I.");
    } else if (imc < 40) {
      System.out.println("Obesidade grau II.");
    } else { 
      System.out.println("Obesidade grau III.");
    }

    System.out.println("Fim do programa.");
  }

}