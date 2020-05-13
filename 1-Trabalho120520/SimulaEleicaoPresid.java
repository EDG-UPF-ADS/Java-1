package Trabalho120520;
import java.util.Scanner;
class SimulaEleicaoPresid {
    public static void main (String[] args){
    int voto=6; int v1=0,v2=0,v3=0,v4=0,v5=0,cont=0; int v4p=0,v5p=0;
    Scanner teclado = new Scanner(System.in);
    while(voto!=0){
    System.out.println("Vote 1, 2 ou 3. 4 Nulo e 5 em Branco. 0 para Sair.");
    voto = teclado.nextInt();
    if(voto!=1 && voto!=2 && voto!=3 && voto!=4 && voto!=5 && voto!=0){System.out.println("Voto Inválido");}
    else{System.out.println("Voto Válido");}
    if(voto==1){v1+=1;cont+=1;}
    if(voto==2){v2+=1;cont+=1;}
    if(voto==3){v3+=1;cont+=1;}
    if(voto==4){v4+=1;cont+=1;}
    if(voto==5){v5+=1;cont+=1;}
    } // fim do while
    v4p=(v4*100)/cont;
    v5p=(v5*100)/cont;
    System.out.println("Votação Encerrada");
    System.out.println("Candidato 1 = "+v1+" Votos.");
    System.out.println("Candidato 2 = "+v2+" Votos.");
    System.out.println("Candidato 3 = "+v3+" Votos.");
    System.out.println("Votos Nulos = "+v4+" Votos, com a porcentagem total de "+v4p+"%");
    System.out.println("Votos Brancos = "+v5+" Votos, com a porcentagem total de "+v5p+"%");
    }   
}