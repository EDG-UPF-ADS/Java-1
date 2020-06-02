import java.util.Scanner;
public class Exercicio5 {
       public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String A[] = new String[5];
    int cont=0;
    System.out.println("Informe 5 Siglas de Cursos [ABC]");
    for (int i=0; i < 5; i++){
        A[i] = teclado.next();
    }// for da entrada de dados
    
    for (int i=0; i < 5; i++){
        if(A[i].equalsIgnoreCase("ADS")){
            cont++;  //igual cont=cont + 1
        }
    }// conta o número de ADSs
    System.out.println("Quantos ADSs "+cont);
    
    String B[] = new String[5];
    int j=0;
    for (int i=0; i < 5; i++){
        if((i%2)!=0){
          B[j]=A[i]; 
          j++;
        }
    }// busca aqueles que estão na posição impar
    
    System.out.println("Vetor B ");
    for (int i=0; i < 2; i++){
        System.out.println(B[i]);   
    } // mostra elementos do Vetor B
    }//
  }//main
    
       
