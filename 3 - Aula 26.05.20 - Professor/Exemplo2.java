
import java.util.Scanner;

//Faça um programa que armazena 7 preços em um vetor.
//Depois apresente apenas os valores que são maiores que 10.5

public class Exemplo2 {
      public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
  
      double precos[] = new double[7];
        
      for (int i=0; i < 7; i++){
          System.out.print("Informe "+(i+1)+"º valor: ");
          precos[i] = teclado.nextDouble();
      }// for da entrada de dados
     
      System.out.println("Valor do vetor > 10.5 : ");
      for (int i=0; i < 7; i++){
          if(precos[i] > 10.5){
             System.out.println(precos[i]);
          }
      }// for da entrada de dados
      
    }//main
}