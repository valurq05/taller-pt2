
package guiados;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        
float numero;
float operacion;
float primos;
float residuo;
primos = 0;

Scanner leer = new Scanner(System.in);


        System.out.println("Porfavor digite el número");
        numero = leer.nextFloat();
        
        for (int i = 1; i < numero; i++) {
            
            operacion = numero/i+1;
            residuo = operacion % 1;
           
            if (residuo == 0) {
                
               primos = primos + operacion;
  
            }else if (residuo < 0) {
                
               primos = primos + operacion;
      
            }
        }
        if (primos <= numero+1) {
           
            System.out.println("El numero es primo");
            
        }else{
        
            System.out.println("El numero no es primo");
        
        }
    }
}
  
 