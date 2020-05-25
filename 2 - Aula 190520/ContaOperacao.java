import java.util.Scanner;
public class ContaOperacao {
  static Scanner teclado = new Scanner(System.in);
  static double s = 100;
  static double v;        
    public static void saldo(){
        System.out.println("O valor do Saldo é "+s);
    }//final do método saldo
    public static void deposito(){
      System.out.println("Informe o valor do Depósito: ");
      v = teclado.nextDouble();
      s = s + v;
    }//final do metodo deposito
     public static void saque(){
       System.out.println("Informe o valor do Saque: ");
       v = teclado.nextDouble();
       s = s - v;
    }//final do metodo saque
    
}// final da classe
