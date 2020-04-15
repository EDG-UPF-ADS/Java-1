/* Faça um programa que apresente a soma dos valores de um intervalo definido pelo usuário.
O usuário deverá informar os valores do intervalo. Por exemplo: se informar 5 e 8 (5+6+7+8) o
resultado dever ser 26. Apenas faça o cálculo se o primeiro valor informado para o intervalo for menor que o segundo
Utilize a estrutura de repetição For.
*/
package Aula140420;
import java.util.Scanner;
public class SomaValInterDef1 {public static void main(String[]args) {
    Scanner teclado = new Scanner(System.in);
    int a,b,soma=0;
    do{
        System.out.println("Digite o Numero A: ");
        a=teclado.nextInt();
        System.out.println("Digite o Numero B: ");
        b=teclado.nextInt();
    }while(b<a);{for(int i=a; i<=b; i++){soma+=i;} // fim do while
System.out.println ("Valor Total: "+soma);
} // fim do método.
} // fim do programa.