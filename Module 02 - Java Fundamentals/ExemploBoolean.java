public class ExemploBoolean {

  public static void main(String[] args) {
    boolean compraAprovada = true;
    boolean clienteBloqueado = false;

    System.out.println(compraAprovada);
    System.out.println(clienteBloqueado);

    int quantidadeEstoque = 10;
    int quantidadePedidoCompra = 9;

    boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra;

    /*
    Fiz isso só pra brincar.
    System.out.print("Estoque esta disponivel? ");
    if (estoqueSuficiente == false) {
      System.out.println("Indisponivel");
    }
    */

    System.out.println("Estoque disponivel: " + estoqueSuficiente);
  }

}