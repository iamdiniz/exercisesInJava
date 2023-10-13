/*
Escreva um programa que solicita números inteiros para o usuário de forma "infinita", até
que o usuário escolha não digitar mais nenhum número (pergunte ao usuário após informar
cada número).
Some todos os números ímpares e todos os números pares e imprima na saída o resultado.

*/
// Perfect
import java.util.Scanner;

public class Exercise0320doWhile {

  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);

    int parar = 1;
    int numero;
    int numeroImpar = 0;
    int numeroPar = 0;

    do {
      System.out.print("Digite um numero inteiro: ");
      numero = sc.nextInt();

      if (numero % 2 == 0) {
        numeroPar += numero;
      } else {
        numeroImpar += numero;
      }
 
      System.out.print("Deseja continuar? ('1' sim, '2' nao): ");
      parar = sc.nextInt();
 
    } while (parar == 1);

    System.out.printf("Soma dos numeros pares: %d%n", numeroPar);
    System.out.printf("Soma dos numeros impares: %d%n", numeroImpar);
    
  }

}