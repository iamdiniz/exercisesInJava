import java.util.Scanner;

public class Exercise0304 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ano: ");
    int ano = sc.nextInt();

    boolean anoBissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 !=0);

    System.out.println(anoBissexto);
  }

}