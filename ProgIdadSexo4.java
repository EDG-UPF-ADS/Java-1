/* 4- Faça um programa que recebe a idade e o sexo de ‘n’ pessoas. A cada entrada de dados, pedir
ao usuário se deseja informar mais dados. Ao final da execução do programa apresente:
a idade média das mulheres; a idade média dos homens. número total de mulheres;
*/
package Aula130420;
import java.util.Scanner;
import java.lang.String;
public class ProgIdadSexo4 {public static void main(String[]args) {
    Scanner teclado = new Scanner(System.in);
    String sexo;
    String rep;
    int idd=0,idm=0,idf=0,imt=0,ift=0;
    do{   
      System.out.println("Digite o Sexo [M/F]: ");
      sexo=teclado.next();
      if(sexo.equalsIgnoreCase("m")){
        imt++;
        System.out.println("Masculino - Digite a Idade: ");
        idd=teclado.nextInt();
        idm+=idd;
      }else if(sexo.equalsIgnoreCase("f")){
        ift++;
        System.out.println("Feminino - Digite a Idade: ");
        idd=teclado.nextInt();
        idf+=idd;
      }else{
          System.out.println("Sexo Não Reconhecido");
            }
      System.out.println("Devemos Continuar: [S/N]");
      rep=teclado.next();
      }while(rep.equalsIgnoreCase("s"));
      if (imt!=0 && ift!=0){
          idm=idm/imt;
          idf=idf/ift;
        System.out.println("Homens Total: "+imt+" | Mulheres Total: "+ift);
        System.out.println("Idade Média Homens: "+idm+" | Idade Média Mulheres: "+idf);
      }else{
      System.out.println("Não Foram Digitados Dados Válidos");
      }
      }
    } // fim da classe
