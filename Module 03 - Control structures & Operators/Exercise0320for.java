/*
Escreva um programa que solicita 10 números para o usuário e imprime na saída a soma
dos números digitados.
Permita que o usuário digite apenas números pares. Caso um número ímpar seja informado,
ignore e solicite um novo número ao usuário.Escreva um programa que solicita 10 números para o usuário e imprime na saída a soma
dos números digitados.
Permita que o usuário digite apenas números pares. Caso um número ímpar seja informado,
ignore e solicite um novo número ao usuário.

*/

import java.util.Scanner;

public class Exercise0320for {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite 10 numeros pares!");
    int somaNumeros = 0;
  
    for (int i = 1; i <= 10; i++) {
      System.out.printf("Numero par #%d: ", i);
      int numero = sc.nextInt();

      if (numero % 2 == 0) {
        somaNumeros += numero;
      } else {
        System.out.println("Ops, voce digitou um numero impar! Digite um numero par.");
        i--;
      }
    }
    
    System.out.printf("Soma dos numeros pares: %d%n", somaNumeros);
  }
}