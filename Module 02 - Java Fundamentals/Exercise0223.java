/*
A empresa que você trabalha descobriu que você está indo muito bem neste
curso de Java e pediu para que você desenvolvesse um programa que calcula
os pagamentos para os prestadores de serviços da empresa.
Este programa deve receber as seguintes entradas de dados do usuário:
• Nome (texto)
• Valor por hora (decimal)
• Horas trabalhadas (inteiro)
• Valor dos descontos (decimal)
A saída do programa deve ser um resumo da folha de pagamento, mostrando os
cálculos e os resultados finais, como no exemplo abaixo:
Folha de pagamento: Thiago Faria
172 horas x R$150.20 = R$25834.40
Descontos: R$482.88
Total devido: R$25351.52
Use a formatação de saída com printf para imprimir na saída e o
tipo Scanner para receber a entrada de dados do usuário.
*/

import java.util.Scanner;

public class Exercise0223 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine();

    System.out.print("Valor por hora: ");
    double horasTrabalhadas = sc.nextDouble();

    System.out.print("Horas trabalhadas: ");
    int horas = sc.nextInt();

    System.out.print("Valor dos descontos: ");
    double descontos = sc.nextDouble();

    double quantoRecebePorHora = horas * horasTrabalhadas; // TUDO OK
    double totalComDesconto = quantoRecebePorHora - descontos;
    System.out.println("");

    System.out.printf("Folha de pagamento: %s%n", nome);
    System.out.printf("%d horas x R$%.2f = R$%.2f%n", horas, horasTrabalhadas, quantoRecebePorHora);
    System.out.printf("Descontos: R$%.2f%n", descontos);
    System.out.printf("Total devido: R$%.2f%n", totalComDesconto);
  }

}