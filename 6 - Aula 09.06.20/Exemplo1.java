// Link para a documentação do Java
//https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html
import java.util.*;
import java.util.Scanner;
public class Exemplo1 {
  public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
   
    double v =0;
    System.out.println("Informe um valor ");
   
    try{
      v = teclado.nextDouble();
    
    }catch(InputMismatchException e){
        System.out.println("ERROR, problema na leitura do valor => "+e);
    }
    int aux = 1;
    try{
     for(int i=0; i<2; i++){
        if(i >= 1){
            aux = i/aux;
            System.out.println("VALOR de aux "+aux);
        }  
     }// final do FOR
    }catch(ArithmeticException e){
        System.out.println("Ocorreu um erro de divisão por 0 "+e);        
    }finally{
       System.out.println("Sempre mostra");
    } 
    
    int vetor [] = new int[3];
    System.out.println("Informe os dados do vetor");
    try{
     for (int i=0; i<=3; i++){
      vetor[i] = teclado.nextInt();
     }
    }catch(ArrayIndexOutOfBoundsException e){
       System.out.println("Fora dos limites do Array "+e);
    }
    
    //ou pode ser feito
  /*  try{
      v = teclado.nextDouble();
      int aux = 1;
      for(int i=0; i<2; i++){
        if(i >= 1){
            aux = i/aux;
            System.out.println("VALOR de aux "+aux);
        }  
       }// final do FOR
    
      int vetor [] = new int[3];
      System.out.println("Informe os dados do vetor");
      for (int i=0; i<=3; i++){
        vetor[i] = teclado.nextInt();
       }
         
     }catch(InputMismatchException e){
        System.out.println("ERROR, problema na leitura do valor => "+e);
     }catch(ArithmeticException e){
        System.out.println("Ocorreu um erro de divisão por 0 "+e);        
     } catch(ArrayIndexOutOfBoundsException e){
       System.out.println("Fora dos limites do Array "+e);
     } finally{
       System.out.println("Sempre mostra");
    } 
    */
    
 }//main   
}//final
