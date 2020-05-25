
import java.util.Scanner;
public class Conta {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);   
         int opc;
         String maisOp;
        do{ 
         do{
          System.out.println("Informe a opção:\n[1]-Saldo\n[2]-Depósito\n[3]-Saque");
          opc = teclado.nextInt(); 
          switch(opc){
             case 1:{
                      ContaOperacao.saldo();
                      break;
                    }
             case 2:{
                     ContaOperacao.deposito();
                     break;
                    }
             case 3:{
                    ContaOperacao.saque();
                    break;
                   }
             default:{
                 System.out.println("Opção Errada, informe Novamente!");
             }
          }//final do switch
         }while( (opc < 1) || (opc > 3) ); // fecha o 1º do While
        System.out.println("Mais Operações [S][N]");
        maisOp = teclado.next();
     }while(maisOp.equals("S") || maisOp.equals("s"));  // fecha o 2º do While
  }//main      
}