/* Faça um programa que recebe um vetor com 5 elementos. Apresente:
1- os elementos do vetor em ordem decrescente;
2- informe um elemento para pesquisa e apresente se este elemento está no vetor e em qual
posição (se houve repetição, apresente apenas a ULTIMA posição na qual o elemento se encontra)
*/
package Trabalhos070620;
import java.util.Scanner;
public class Questao1 {
    public static void main (String[]args){      
      Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[5];
        System.out.println("Informe 5 Valores Para o Vetor: ");
        for (int i=0; i<5; i++){
          vetor[i] = teclado.nextInt();
        } // final do for leitura do vetor. 
        int dec=1;
        int x=0;
        System.out.println("Ordenando o Vetor em Ordem Decrescente...");        
        while(dec != 0){
           dec=0;
           for (int i=0; i<4; i++){
               if(vetor[i]<vetor[i+1]){
                   x=vetor[i];
                   vetor[i]=vetor[i+1];
                   vetor[i+1]=x;
                   dec=1;
                   } // final do if de comparação.
                } // final do for. 
        } // final do while. 
        for (int i=0; i<5; i++){     // exibe o vetor. 
          System.out.println("Os Dados do Vetor Decrescetente, é: Posição ["+i+"] Valor: "+vetor[i]);   
        } // final do for exibe resultado. 
        System.out.println("Informe um Elemento para Pesquisa No Vetor: ");
        int pesq = teclado.nextInt();
        x=0;
        for (int i=0; i<5; i++){
            if(pesq==vetor[i]){
                x=i; 
                } // final do if de comparação.
            } // final do for. 
        if(x==0){
        System.out.println("O Elemento Digitado "+pesq+" Não Esta Presente no Vetor");    
        }else{
        System.out.println("O Elemento "+pesq+" Esta no Vetor na Ultima Posição "+x);        
        } // final do else
    } // final do método. 
} // final do main 