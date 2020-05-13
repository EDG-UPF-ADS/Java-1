package Trabalho120520;
import java.util.Scanner;
class MedAri5Notas{public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    float n=0,m=0,mn=11,notas=0;
    for(int i=1;i<=5;i++){
    System.out.println("Nota do Aluno "+i+" = ");
    n=teclado.nextFloat();
    while(n<0 || n>10){
        System.out.println("Repita a Nota Aluno "+i+" = ");
        n=teclado.nextFloat();}
    if(n<mn){mn=n;}
    notas+=n;    
    }
    m=somatorio(notas,mn);
    out(m);
    }
  public static float somatorio(Float notas, Float med){
    float media=0;
    media=(notas-med)/4;   
    return media;
  }
  public static void out(float med){
    System.out.println("A Média das Notas Foi = "+med);
  }
}