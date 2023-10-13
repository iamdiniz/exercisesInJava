/*
Escreva um programa que solicita números inteiros ao usuário de forma contínua e soma
todos os números informados.
O programa deve parar de solicitar mais números e imprimir a soma deles na saída apenas
quando o valor total somado for igual ou superior a 100.
*/

import java.util.Scanner;

public class Exercise0320whileMedium {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um numero inteiro: ");
    int numeroOriginal = sc.nextInt();
 
    int numeroPendenteInversao = numeroOriginal;
    int numeroInvertido = 0;

    while (numeroPendenteInversao > 0) {
      int resto = numeroPendenteInversao % 10; // Pega o último dígito
      numeroInvertido = numeroInvertido * 10 + resto; // Joga o último dígito a esquerda
      numeroPendenteInversao /= 10; // tira o último dígito armazenado, para fazer o loop do próximo.
    }

    System.out.println("Inverso de " + numeroOriginal + " = " + numeroInvertido);
    
  }

}