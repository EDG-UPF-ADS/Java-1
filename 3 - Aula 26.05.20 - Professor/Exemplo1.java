import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      //Declaração do Array 
        //int[] nomeDoArray; 
      //Declaração e inicialização do array 
        int vetor[] = new int[4];
        
        System.out.println("Informe 4 valores do Vetor");
        for (int i=0; i < 4; i++){
          vetor[i] = teclado.nextInt();
        }
      
        for (int i=0; i <= 3; i++){     
          System.out.println("Os dados do Vetor, são: " +vetor[i]);   
        }
    }
    
    
    
}
