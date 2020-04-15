/* 2- Faça um programa que recebe um número inteiro e calcule a tabuada (de 1 até 10) 
deste número. Utilize a estrutura de repetição For.
*/
package Aula140420;
import java.util.Scanner;
public class RecIntCalTabuada1s10Exer2 {public static void main(String[]args) {
    Scanner teclado = new Scanner(System.in);
    int n,tab;
    System.out.println("Digite o Numero Para Tabuaoa: ");
        n=teclado.nextInt();
        for(int i=1;i<=10;i++){
            tab=n*i
                System.out.println(n+" Multiplicado por "+i+" é Igual á "+tab);
        } // fim do for. 
    } //fim do método.
} // fim do programa.
