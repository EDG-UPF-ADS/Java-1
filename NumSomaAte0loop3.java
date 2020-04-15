/* 3- Faça um programa que recebe um número e vai somando este número até o usuário digitar
o valor 0 (zero). Ou seja, somar todos os valores que o usuário digitar, porém quando ele digitar
0 o “loop” finaliza e encerra a execução do programa. A cada iteração do loop apresentar o resultado atual da soma.
 */
package Aula130420;
import java.util.Scanner;
public class NumSomaAte0loop3 {public static void main(String[]args) {
    Scanner teclado = new Scanner(System.in);
    int i=1,n=0,soma=0;
        while(i!=0){
        System.out.println ("A Soma Parcial é "+soma);
        System.out.println ("Informe o Número Desejado");
        n=teclado.nextInt();
        i=n;
        soma+=n;
 } // fim while. 
System.out.println("A Soma Total é "+soma);        
} // fim método.
} // fim classe. 
