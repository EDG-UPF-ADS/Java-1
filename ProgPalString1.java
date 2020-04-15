package Aula130420;
/*
1- Faça um programa que recebe uma palavra. Neste programa faça operações, usando métodos
da classe String, para:
✓ Retornar o caracter da posição 1
✓ Retornar o tamanho da String
✓ Retornar os dois primeiros caracteres da palavra
✓ Retornar toda palavra em letras maiúsculas
Exemplos para testar o programa
Exemplo de entrada
ads
Exemplo de saída
d - 3 - ad - ADS
 */
import java.util.Scanner;
import java.lang.String;
public class ProgPalString1 {public static void main(String[]args) {
    Scanner teclado = new Scanner(System.in);
    String pal ;
    System.out.println("Digite a Palavra Desejada: ");
    pal = teclado.next();
    System.out.println("O Caractere da Posição 1 é "+pal.charAt(0)); //retorna com o caractere 0. 
    System.out.println("O Tamanho da String é "+pal.length()); //retorna com o tamanho em cadacteres INT do valor armazenado. 
    System.out.println("Os Dois Primeiros Caracteres São "+pal.substring(0,2));  //começa do 0 vai até o 2,
    System.out.println("A Palavra em Maiúsculas é "+pal.toUpperCase());  //converte para maiúsculas.  
    System.out.println("Esses fiz a mais para Treinar...");  
    System.out.println("Os Cinco Primeiros Caracteres São "+pal.substring(0,5));  //começa do 0 vai até o 5.
    System.out.println("Em Minúsculas Ficam "+pal.toLowerCase());  //converte em minusculas.
} //final do método
} //final da classe
