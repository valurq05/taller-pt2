
package guiados;

import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    
int numero;
int factorial;
numero = 1;


Scanner leer = new Scanner(System.in);

      System.out.println("Porfavor ingrese un número");
      factorial = leer.nextInt();
 
      
      for (int i = 0; i <= factorial + 1 ; i++) {
         
          if (factorial != 1) {
      
          numero = numero * factorial ;
          factorial = factorial - 1;
         
          
        System.out.println("La factorial de su numero es: " + numero);  
          }
      }
      
      
      
    }
    
}
