/*
 2- Faça um programa que recebe 5 números e informe a soma e a média dos números informados
 */
package Aula130420;
import java.util.Scanner;
public class Prog5NumSomaMedia2 {public static void main(String[]args) {
    Scanner teclado = new Scanner(System.in);
 double n=0,soma=0,media=0;
 for (int i=1; i <=5; i++) {
     System.out.println("Digite Número Aleatório: ");
     n=teclado.nextDouble();
     soma+=n;
 }
 media=soma/5;
 System.out.println ("A Soma dos Numeros é "+soma+"e a média é "+media);
}    
}
