/* 5- Supondo que a população da Noruega seja da ordem de 900.000 habitantes com uma taxa
anual de crescimento de 4.5% e que a população da Eslovénia seja 1.200.000 habitantes com
uma taxa de crescimento de 2%. Faça um programa que calcule e apresente o número de anos
necessários para que a população da Noruega ultrapasse ou iguale a população da Eslovénia,
mantidas as taxas de crescimento.
*/
package Prazo280420;
import java.text.DecimalFormat;
public class Exer5CalcPopCrescAlcanc {public static void main(String[]args) {
    DecimalFormat formatpop = new DecimalFormat("#,###.#");
    DecimalFormat formatdif = new DecimalFormat("##,#####");
    double popn = 900000, pope = 1200000, dif = 0;
    int anos = 0;
    while(popn<pope){
        popn = popn*1.045;
        pope = pope*1.02;
        anos++;
        System.out.println("Em "+anos+" Ano(s), Noruega "+formatpop.format(popn)+" e Eslovênia "+formatpop.format(pope));}
dif=popn-pope;
System.out.println("Portanto, em "+anos+" Ano(s) a Diferença Populacional Será de "+formatdif.format(dif));
    } // classe
} // programa
