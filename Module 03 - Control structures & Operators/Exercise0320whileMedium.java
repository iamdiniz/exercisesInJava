/*
Escreva um programa que solicita um número inteiro para o usuário e imprime na saída o
número com os dígitos invertidos.
Por exemplo, se o número digitador for 98765, a saída deve ser 56789
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