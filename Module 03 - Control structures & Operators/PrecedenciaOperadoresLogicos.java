public class PrecedenciaOperadoresLogicos {

  public static void main(String[] args) {
    int x = 10;
    int y = 20;

    // Quando for avaliar, pense assim
    // boolean resultado = (x == 13 && x == 15) || y == 20; isso é a mesma coisa

    // Disso:
    // boolean resultado = (x == 13 && x == 15) || y == 20;
    // Resultado é true igual, Operador E tem precedência.
    // Use o parentesês para melhor legibilidade do código.

    // boolean resultado = x == 13 && x == 15 || y == 20; // true
    // boolean resultado = (x == 13 && x == 15) || y == 20; // true
    boolean resultado = x == 13 && (x == 15 || y == 20); // false

    System.out.println(resultado);
  }

}