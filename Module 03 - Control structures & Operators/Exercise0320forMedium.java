/*
Escreva um programa que solicita um número inteiro positivo para o usuário e imprime na
saída uma mensagem dizendo se o número digitado é um número primo ou não.
Números primos são números naturais que possuem dois divisores: 1 e ele mesmo.
Por exemplo, o número 1 não é um número primo, porque ele tem apenas o número 1 (ele
mesmo) como divisor. O número 2 é primo, porque ele é divisível por 1 e ele mesmo. O
número 4 não é primo, porque ele é divisível por 1, 2 e 4.
Para saber se um número é divisível por outro, basta usar o operador de módulo (resto) e
avaliar se é igual a 0.
*/

import java.util.Scanner;

public class Exercise0320forMedium {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um numero positivo inteiro: ");
    int numero = sc.nextInt();

    boolean numeroPrimo = true;

    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) { // Se o resto da div do numero for exato, significa que ele é divisivel por mais d 2 numeros.
        numeroPrimo = false; // Nesse caso, ele não é primo, numeroPrimo false
        break;
      }
    }

    if (numeroPrimo && numero > 1) { // Agora se o if não for satisfeito, é pq o numeroPrimo foi true.
      System.out.printf("%d numero primo", numero); // e se o numero for maior q 1, ele é divisivel por dois numeros
    } else { // 1 e ele mesmo, tornando-se um numero primo
      System.out.printf("%d nao e numero primo", numero);
    }

  }
}