public class ExemploByteShort {

  public static void main(String[] args) {
    byte idade = 127; // 127 é o máximo que ele aguenta
    // byte idade2 = 128; não cabe dentro de um byte. não compila

    short quantidadeEstoque = 32767; // valor máximo
    // short quantidadeEstoque2 = 32768; // Excede o valor máximo suportado. Não Compila!!
  }

}