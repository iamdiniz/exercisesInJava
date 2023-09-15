public class OperadorIncremento {
  
  public static void main(String[] args) {     
     int limiteTentativasLogin = 10;
 
     // limiteTentativasLogin--; pos-fixada

     int novoLimiteTentativasLogin = --limiteTentativasLogin; // pre-fixada

     System.out.println("Limite de tentativas de login: " + limiteTentativasLogin);
     System.out.println("Novo limite de tentativas de login: " + novoLimiteTentativasLogin);
  }

}