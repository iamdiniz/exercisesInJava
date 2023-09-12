public class ExemploLong {

  public static void main(String[] args) {
    long populacaoUberlandia = 699_097;

    // long populacaoMaxima = 2_147_483_648; assim não compila.
    // Porque qualquer valor que digitamos no literal no nosso código fonte java, ele é INTEIRO!

    /*
       Para que o Java interprete nosso valor que digitamos no literal no nosso código fonte java,
       precisamos colocar um 'L' tanto maiusculo tanto minusculo no final para que o compilador
       interprete como um tipo Long.
    */
 
    long populacaoMaxima = 2_147_483_648L;

    // System.out.println(2_147_483_648); não compila
    System.out.println(2_147_483_648L);
  }

}