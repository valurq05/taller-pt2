
package ejercicio.pkg8;


public class Ejercicio8 {

   
    public static void main(String[] args) {
        
// Realizar un algoritmo que resuelva el siguiente problema: un progresión geometrica comienza en 1 y tiene razon 2.
// encontrar los trés terminos consecutivos (de la sucesión) cuyo producto es 512
        
// DE: numeros que hacen parte de la gestión geometrica
// DS: terminos consecutivos de la sucesión 

int numero;
int total;
int longitud;
longitud= 5;
total=0;
numero=0; 

int myArray[] = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            
            numero= (int) Math.pow (2, i);
            myArray[i] = numero;
                    
        }

            
    System.out.println("Los términos sucesivos son: "+ myArray[2] + "\t" + myArray[3] + "\t" + myArray[4]);
    total= myArray[2]*myArray[3]*myArray[4];
    System.out.println("El producto de la sucesión es: "+ total); 
  
        
     
        
        
        
        
    }
}
