
package guiados;

import java.util.Scanner;

public class ejercicio9 {
 public static void main(String[] args) {
 
int posiciones;

Scanner leer = new Scanner(System.in);

     System.out.println("Porfavor ingrese la cantidad de posiciones");
     posiciones = leer.nextInt();
     
int[] myArray = new int[posiciones];
        
     for (int i = 0; i < posiciones; i++) {
         
         if (myArray[i] % 2 == 0) {
             
             myArray[i] = 0;
            
         }else{
             
             myArray[i] = 1;
         }
         System.out.println("El arreglo es:" + myArray[i]);
         }

     
      
     
     }
   
     
         
        
             
       
        
    }
    
