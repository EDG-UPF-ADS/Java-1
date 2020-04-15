/* 4- O Departamento Nacional de Meteorologia precisa desenvolver um programa que leia um
conjunto determinado de temperaturas (10) exatamente as 12h. Informe o mês, dia e a
temperatura. Ao final a menor e a maior temperaturas informadas, bem como a média das
temperaturas.
 */
package Prazo280420;
import java.util.Scanner;
public class Exer4InfTempMaiorMenor {public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    int t, d, m, dma=0, mma=0, ma=0, dme=0, mme=0, me=0, med=0, i;
        for(i=0;i<10;i++)  {
        System.out.println("Digite O Dia, o Mês e a Temperatura");
        d=teclado.nextInt();
        m=teclado.nextInt();
        t=teclado.nextInt();
        if (i == 0) {mma=m; dma=d; ma=t; mme=m; dme=d; me=t;}
        if (t>ma) {mma=m; dma=d; ma=t;}
        if (t<me) {mme=m; dme=d; me=t;}
        med+=t;} // final do FOR. 
med=med/i;
System.out.println("No Dia "+dma+" do mês "+mma+" foi registrada a maior temperatura de "+ma+" Graus");
System.out.println("No Dia "+dme+" do mês "+mme+" foi registrada a menor temperatura de "+me+" Graus");
System.out.println("A Média de Temperatura foi de "+med+" Graus, entre "+i+" medições Meteorológicas");
    } // final MAIN.
} // final PUBLIC.
