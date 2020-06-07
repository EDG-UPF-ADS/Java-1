import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int t,cont; 
    double soma,media;
    soma=0; media=0; cont=0;
    
    System.out.println("Informe o número de notas");
    t = teclado.nextInt();
    
    double notas [] = new double[t];
    
    System.out.println("Notas: ");
    for (int i=0; i < notas.length; i++){
        notas[i] = teclado.nextDouble();
        soma = soma + notas[i];
    }// for da entrada de dados
    
     media = soma / notas.length;
     
     for (int i=0; i < notas.length; i++){
         if (notas[i] > media){
          cont++;
         }
    }// for verifica acima da média
    
    System.out.println("Média das Notas: "+media);
    System.out.println("Quantas estão acima da Média "+cont);
    }
}    