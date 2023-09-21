/*
Em aulas anteriores, nós implementamos as regras da Organização Mundial de
Saúde para calcular o IMC (Índice de Massa Corporal).
Existem outras regras mais detalhadas, como as da NHANES II survey (USA
1976-1980), que indicam os seguintes critérios para adultos:
Condição IMC em mulheres IMC em homens
Abaixo do peso Menor que 19.1 Menor que 20.7
No peso ideal Entre 19.1 e 25.8 Entre 20.8 e 26.4
Um pouco acima do peso Entre 25.9 e 27.3 Entre 26.5 e 27.8
Acima do peso ideal Entre 27.4 e 32.3 Entre 27.9 e 31.1
Obeso Maior que 32.3 Maior que 31.1
Implemente um programa que obtém os valores como entrada do usuário e
imprime na tela o resultado (condição da pessoa), usando essas regras e
aplicando todos os conteúdos que você aprendeu até agora neste módulo.
*/

import java.util.Scanner;

public class Exercise0309 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite 1 para 'Mulher' ou 2 para 'Homem': ");
    char sexo = sc.next().charAt(0);
    System.out.print("Peso: ");
    int peso = sc.nextInt();

    System.out.print("Altura: ");
    double altura = sc.nextDouble();

    double imc = peso / (altura * altura);

    // Lê-se: Se for homem e o imc dele for tanto, execute isso. Ou se for mulher e o imc dela for tanto, execute isso

      if ((sexo == '1' && imc < 19.1) || (sexo == '2' && imc < 20.7)) {
      System.out.println("Abaixo do peso ideal.");
    } else if ((sexo == '1' && imc <= 25.8) || (sexo == '2' && imc <= 26.4)) {
      System.out.println("Peso ideal.");
    } else if ((sexo == '1' && imc <= 27.3) || (sexo == '2' && imc <= 27.8)) { 
      System.out.println("Um pouco acima do peso.");
    } else if ((sexo == '1' && imc <= 32.3) || (sexo == '2' && imc <= 31.1)) {
      System.out.println("Acima do peso ideal.");
    } else { 
      System.out.println("Obeso");
    }

    System.out.println("Fim do programa.");
  }

}