import java.util.Scanner;
public class Exercicio4 {
   public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
   double v[] = new double [100];
   double aux = 0;
   double reajuste;

   System.out.println("Informe os Salários [até -1] ");
 
   int cont=0;    
       for(int i=0; i<100; i++){
         v[i] = teclado.nextDouble();
         aux = v[i];
         cont++;
         if (aux == -1){
             System.out.println("Informe o reajuste");
             reajuste = teclado.nextDouble();
           for(int j=0; j < cont-1; j++){
               v[j] = v[j] + (v[j] * reajuste/100);
               System.out.println("Salarios...."+v[j]);
           } 
           System.out.println("saindo....");
           break;
         }
       }      
    
 }//main
}//classe