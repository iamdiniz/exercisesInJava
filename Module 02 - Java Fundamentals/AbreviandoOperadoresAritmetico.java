public class AbreviandoOperadoresAritmetico {
  
  public static void main(String[] args) {
    int quantidadeProdutos = 10;

    // Isso aqui:
    // quantidadeProdutos = quantidadeProdutos + 3;

    // é o mesmo que isso aqui:
    // quantidadeProdutos += 3;

    // quantidadeProdutos -= 3;

    // quantidadeProdutos *= 3;

    // quantidadeProdutos /= 3;

    quantidadeProdutos %= 4;

    System.out.println(quantidadeProdutos);  
  }

}