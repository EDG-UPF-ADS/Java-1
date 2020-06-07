import java.util.*;
public class Exercicio7 {
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Random random = new Random();
    int aposta1 [] = new int[6];
    int aposta2 [] = new int[6];
    int sorteados [] = new int[6];  
    
    System.out.println("Informe os valores da Aposta 1");
    for(int i=0; i<6; i++){
       aposta1[i] = teclado.nextInt();     
    }
    System.out.println("Informe os valores da Aposta 2");
    for(int i=0; i<6; i++){
       aposta2[i] = teclado.nextInt();     
    }
    System.out.println("Sorteando ....");
    for(int i=0; i<6; i++){
       sorteados[i] = random.nextInt(60);    
       if(sorteados[i] == 0){
         i--;
       }       
    } 
    System.out.println("Números Sorteados!");
    for(int i=0; i<6; i++){
       System.out.print(sorteados[i] +" - ");     
    } 
    
    int acertos1=0,acertos2=0;
    System.out.println("Verificando Resultado!");
     for(int i=0; i<6; i++){   // esse loop controla o sorteio
       for(int j=0; i<6; i++){ // loop controla as apostas
           if(sorteados[i] == aposta1[j]){
               acertos1++;
           }//final do if
           
           if(sorteados[i] == aposta2[j]){
               acertos2++;
           }//final do if
        }      
      }
    System.out.println("Acertos da Aposta 1= "+acertos1);
    System.out.println("Acertos da Aposta 2= "+acertos2);
    
    
}//main
} 
