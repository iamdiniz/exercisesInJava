/*
Escreva um programa que solicita números inteiros ao usuário de forma contínua e soma
todos os números informados.
O programa deve parar de solicitar mais números e imprimir a soma deles na saída apenas
quando o valor total somado for igual ou superior a 100.
*/

import java.util.Scanner;

public class Exercise03020while {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int soma = 0;

    while (soma <= 100) {
      System.out.print("Digite um numero inteiro: ");
      int numero = sc.nextInt();

      soma += numero;
    }

    System.out.printf("A soma dos numeros digitados foi: %d", soma);
    
  }

}