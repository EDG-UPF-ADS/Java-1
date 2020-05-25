import java.util.Scanner;
public class Conta190520 {
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    int opc;
    String maisOp;
    do{
    do{    
    System.out.println("Bem Vindos ao Banco Online\nInforme a Opção:\n[1] Saldo\n[2] Depósito\n[3] Saque");
    opc = teclado.nextInt();
    switch(opc){
        case 1:{ContaOperacao.saldo();break;}
        case 2:{ContaOperacao.deposito();break;}
        case 3:{ContaOperacao.saque();break;}
        default:{System.out.println("Opção Errada. Try Again");}
    }
    }while(opc<1 || opc>3);
    System.out.println("Mais Operações [S][N]");
    maisOp = teclado.next();
    }while(maisOp.equals("S") || maisOp.equals("s"));
System.out.println("Volte Sempre!");
} //final da classe
}
