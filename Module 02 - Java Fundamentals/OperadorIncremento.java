public class OperadorIncremento {
  
  public static void main(String[] args) {     
     int totalDownloads = 10;

     // totalDownloads = totalDownloads + 1;
     // totalDownloads += 1;
     
     // totalDownloads++; Operador incremento forma pos-fixada.

     // int novoTotalDownloads = totalDownloads++;

     int novoTotalDownloads = ++totalDownloads;  // Operador incremento pre-fixada.

     // Operador incremento pre-fixada primeiro incrementa antes de atribuir.
     
     System.out.println("Total de downloads: " + totalDownloads);
     System.out.println("Novo total de downloads: " + novoTotalDownloads);
  }

}