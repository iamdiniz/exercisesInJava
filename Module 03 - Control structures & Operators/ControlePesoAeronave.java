import java.util.Scanner;

public class ControlePesoAeronave {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Peso maximo da aeronave: ");
    int pesoMaximo = sc.nextInt();

    int pesoTotalPassageiros = 0;
    boolean incluirNovoPassageiro = true;

    while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro) {
      System.out.print("Peso do passageiro: ");
      int pesoPassageiro = sc.nextInt();

      pesoTotalPassageiros += pesoPassageiro;

      System.out.print("Incluir novo passageiro? ");
      incluirNovoPassageiro = sc.nextBoolean();
    }

    System.out.printf("Peso maximo da aeronave: %d kg%n", pesoMaximo);
    System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
    System.out.printf("Situacao da aeronave: %s%n",
	pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");
  }

}