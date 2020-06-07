// 8- Faça um programa que leia uma matriz 5x3 e em seguida apresente quantos
// elementos são maiores que 10 e 20% da soma de todos os elementos da matriz
// fiz dizendo a posição que está lendo do vetor. 
import java.util.Scanner;
public class Exercicio8{
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);
        int mat[][]=new int[5][3];
        int lin=0, col=0, porc20=0, soma=0, mai10=0;
        for(lin=0;lin<5;lin++){
            for(col=0;col<3;col++){
                System.out.print("Digite o Valor da Matriz Posição"+lin+col+" : ");
                mat[lin][col]=teclado.nextInt();
            } // final coluna         
        } // final linha
        for(lin=0;lin<5;lin++){
            for(col=0;col<3;col++){
                soma+=mat[lin][col]; // faz o somatório. 
                if(mat[lin][col]>10){
                    mai10++;
                } // if maior 10
            } //final coluna 2
        } // final linha 2 
        porc20=soma*20/100;
    System.out.println("Somatório Total: "+soma);
    System.out.println("20% dos Valores: "+porc20);
    System.out.println("Maiores que 10: "+mai10);
    } // main
} //final