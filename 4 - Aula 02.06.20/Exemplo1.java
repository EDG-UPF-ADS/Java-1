//Fazer uma programa que armazena em uma matriz 2x2 valores de preços de
//produtos. Encontre o menor preco e 10% da soma de todos os valores da Matriz
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     double m [][] = new double[2][2];
     double soma,var10,menor;
     soma =0; var10=0; menor=0;
     
     System.out.println("Informe 4 valores: ");
     for (int linha=0; linha < 2; linha++){  // armazena dos dados na matriz
         for(int coluna=0; coluna < 2; coluna++){
             m[linha][coluna]= teclado.nextDouble();        
         } //for COLUNA       
     }// for LINHA
  
     for (int linha=0; linha < 2; linha++){  // Fazer o soma dos elementos
         for(int coluna=0; coluna < 2; coluna++){
             soma = soma + m[linha][coluna];
         } //for COLUNA       
     }// for LINHA
     
     for (int linha=0; linha < 2; linha++){  // percorre a matriz e acha o menor
         for(int coluna=0; coluna < 2; coluna++){
             if( (linha == 0) && (coluna == 0)){
                 menor = m[linha][coluna];
             }
             if( m[linha][coluna] < menor){
                 menor = m[linha][coluna];
             }// segundo if
         } //for COLUNA       
     }// for LINHA
     
     
     var10 = soma * 10/100;
     System.out.println("10% da soma "+soma+"=> "+var10);
     System.out.println("Menor Preco "+menor);
    } // main   
}
