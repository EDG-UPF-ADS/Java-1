package Trabalho120520;
import java.util.Scanner;
class MedAri5NotasMain{public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    float n=0,m=0,mn=11,med=0,notas=0;
    for(int i=1;i<=5;i++){
    System.out.println("Nota do Aluno "+i+" = ");
    n=teclado.nextFloat();
    while(n<0 || n>10){
        System.out.println("Repita a Nota Aluno "+i+" = ");
        n=teclado.nextFloat();}
    if(n<mn){mn=n;}
    notas+=n;    
    }
    System.out.println("Variável Notas "+notas+" e Variável Menor Valor "+mn);
  }
}