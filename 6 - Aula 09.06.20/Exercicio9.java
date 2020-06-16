import java.util.Scanner;
public class Exercicio9 {
 public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
   double m[][] = new double [4][4];
    System.out.println("Informe os valores da Matriz[4][4] ");
    //i= linha  e j = coluna
    for(int i=0; i < 4; i++){
     for(int j=0; j < 4; j++){     
       m[i][j] = teclado.nextDouble();
     }//j
    }//i
    // Somar valores
    double soma=0;
     for(int i=0; i < 1; i++){
       for(int j=0; j < 4; j++){     
        soma = soma + m[i][j];
     }//j
    }//i 
     System.out.println("Soma da linha 1 "+soma);
     double soma2=0;
     // solucao 1
     /* for(int i=0; i < 4; i++){
       for(int j=2; j < 3; j++){
        //System.out.println("i =  "+i+ " j "+j);        
        soma2 = soma2 + m[i][j];
     }//j
    }//i */
    //solucao 2
      for(int i=0; i < 4; i++){
       for(int j=0; j < 4; j++){
        if(j==2){        
          soma2 = soma2 + m[i][j];
        }  
     }//j
    }//i 
    System.out.println("Soma da coluna 3 "+soma2); 
     
    
    
 }//main   
}// classe
