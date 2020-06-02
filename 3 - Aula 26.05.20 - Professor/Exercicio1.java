//1- Faça um programa que recebe em um vetor 5 valores inteiros. Apresente qual é o maior valor e a
//sua posição no vetor.
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int v[] = new int[5];
    int posicao=0; int maior=0;
    
    System.out.print("Informe 5 valor: ");
    for (int i=0; i < 5; i++){
        v[i] = teclado.nextInt();
    }// for da entrada de dados

    // loop para encontrar o maior valor
    for (int i=0; i < 5; i++){
        if (i==0){
         maior = v[i];
         posicao = i;
        }else{ 
            if(maior < v[i]){
               maior = v[i];
               posicao = i;
            }
        }// final do else
    }// for para achar o maior
    
    System.out.println("Maior Valor=>  "+maior+" e sua posição[] "+posicao);

    }//main
}