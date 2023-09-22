import java.util.Scanner;

public class HorarioFuncionamento {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc): ");
    String diaSemana = sc.nextLine();

    System.out.print("Mes: ");
    int mes = sc.nextInt();

    // Switch expressions a partir do Java 14
    /*
    String horarioFuncionamento = switch (diaSemana) {
      case "seg" -> "Fechado";
      case "ter", "qua", "qui", "sex" -> "08:00 as 18:00";
      case "sab", "dom" -> "08:00 as 12:00";
      default -> "Dia invalido";
    };
    */

    System.out.printf("Horario de funcionamento: %s%n", switch (diaSemana) {
      case "seg" -> {
        if (mes == 12) {
          yield "08:00 as 16:00";
        }
	yield "Fechado";
      }
      case "ter", "qua", "qui", "sex" -> "08:00 as 18:00";
      case "sab", "dom" -> "08:00 as 12:00";
      default -> "Dia invalido";
    });

    /*
    String horarioFuncionamento;

    switch (diaSemana) {
      case "seg" -> horarioFuncionamento = "Fechado";
      case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 as 18:00";
      case "sab", "dom" -> horarioFuncionamento = "08:00 as 12:00";
      default -> horarioFuncionamento = "Dia invalido";
    }
    */

    // System.out.printf("Horario de funcionamento: %s%n", horarioFuncionamento);
  }

}