
package guiados;

import java.util.Scanner;

public class ejercicio33 {
 public static void main(String[] args) {
       
int inicioIntervalo;
int finalIntervalo;
int intervalo;
int salto;
int total;
total = 0;
intervalo = 0;

Scanner leer = new Scanner(System.in);

     System.out.println("Porfavor digite el inicio del intervalo");
     inicioIntervalo = leer.nextInt();
     
     System.out.println("Porfavor digite el final del intervalo");
     finalIntervalo = leer.nextInt();
     
     System.out.println("Porfavor ingrese el valor del salto del intervalo");
     salto = leer.nextInt();
     
     finalIntervalo = finalIntervalo-inicioIntervalo;
     finalIntervalo = finalIntervalo + 1;
     
     int[] arrayIntervalo = new int[finalIntervalo];
     
     
     for (int i = 0; i < finalIntervalo; i++) {
         
         intervalo = inicioIntervalo;
         inicioIntervalo = intervalo + salto ;
         arrayIntervalo[i] = intervalo;
   
         System.out.println("Los números del intervalo son: " + arrayIntervalo[i] );
     }
     
     for (int j = 0; j < finalIntervalo; j++) {
        
         total = total + arrayIntervalo[j];
     
     }
     
      System.out.println("La suma de los números de su intervalo es:" + total);
 }
     
 
     
    }
    

