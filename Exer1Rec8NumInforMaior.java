/*
 1- Faça um programa que leia 8 números e informe o maior número.
*/
package Prazo280420;
import java.util.Scanner;
public class Exer1Rec8NumInforMaior {public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    int v,maior=0;
    System.out.println("Informe 8 Valores Aleatórios: ");
        for(int i=1;i<=8;i++){
            v = teclado.nextInt();
            if(i==1){maior=v;}
            else
            if(v>maior){maior=v;}}
    System.out.println("O Maior Valor é "+maior);
    } // fim da classe
} // fim do programa.
