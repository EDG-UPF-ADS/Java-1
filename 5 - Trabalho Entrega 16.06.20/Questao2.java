/* Faça um programa que leia uma matriz 2x3 de número inteiros. Depois, encontre na matriz
a localização (linha e coluna) do maior elemento da matriz.
Mostrar todas as localizações, caso o maior valor se repete na matriz.
*/
package Trabalhos070620;
import java.util.Scanner;
public class Questao2 {
    public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    int m [][] = new int[2][3];
    int maior=0;   
    System.out.println("Informe Matriz de 2x3: ");
    for (int l=0; l<2; l++){ 
        for(int c=0; c<3; c++){
            System.out.print("Posição "+l+c+" : ");
            m[l][c]= teclado.nextInt();        
        } // for c
    } // for l
    // achar o maior valor. 
    for (int l=0; l<2; l++){  // percorre a matriz e acha o maior. 
        for(int c=0; c<3; c++){
            if( (l==0)&&(c==0)){
                maior = m[l][c];
            }
            if(m[l][c]>maior){
                maior=m[l][c];
            }// segundo if
        } //for COLUNA       
    }// for LINHA
    System.out.println("O Maior foi "+maior);
         for (int l=0; l<2; l++){  // percorre a matriz e acha a posiçao do maior.
            for(int c=0; c<3; c++){
                if(maior==m[l][c]){
                    System.out.println("A Posiçao que o Valor Apecece na Matriz é "+l+c);
            } //for COLUNA       
        }// for LINHA
    } //final do main. 
} // final do método. 
}
