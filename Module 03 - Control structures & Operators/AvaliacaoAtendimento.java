import java.util.Scanner;

public class AvaliacaoAtendimento {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Avalie o nosso atendimento (1 a 5): ");
    int nota = sc.nextInt();

    String descricaoNota;

    switch (nota) {
      case 1:
        descricaoNota = "Muito ruim";
        break;
      case 2:
        descricaoNota = "Ruim";
	break;
      case 3:
        descricaoNota = "Razoavel";
	break;
      case 4:
        descricaoNota = "Muito bom";
	break;
      case 5:
        descricaoNota = "Excelente";
	break;
      default:
        descricaoNota = "Opcao invalida";
	break;
    }


    System.out.printf("Sua nota foi: %d - %s%n", nota, descricaoNota);
  }

}