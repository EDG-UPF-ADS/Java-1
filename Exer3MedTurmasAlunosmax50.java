/* 3- Faça um programa que calcule o número médio de alunos em uma turma. Para isto, peça a
quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais
de 50 alunos. Se tiver, pedir novamente a quantidade de alunos
*/
package Prazo280420;
import java.util.Scanner;
public class Exer3MedTurmasAlunosmax50 {public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    int a=0,t=0,m=0;
    boolean med;
    System.out.println("Digite A Quantidade de Turmas: ");
    t=teclado.nextInt();
        for(int i=1;i<=t;i++){
            System.out.println("Digite a Quantidade de Alunos da Turma "+i);
            a=teclado.nextInt();
            while(a>50){
            System.out.println("Quantidade Inválida!");
            System.out.println("Digite a Quantidade de Alunos da Turma "+i);
            a=teclado.nextInt();
            } //fim do while
            m+=a;
                                } //final do for
    m=m/t;
    System.out.println("Com "+t+" turmas cadastradas, a média é de "+m+" alunos por Turma.");
    } // fim da classe
} // fim do programa 
