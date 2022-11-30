
package guiados;

import java.util.Scanner;

public class ejercicio4 {
public static void main(String[] args) {
       
int numero;


Scanner leer = new Scanner(System.in);

    System.out.println("Porfavor ingrese un número entero");
    numero = leer.nextInt();
    
    do{
        if (numero % 2 == 0) {
        numero = numero/2;
            System.out.println("La sucesión es: " + numero);

        }else if(numero % 2 != 0 ){
       
           numero = ((numero * 3)+1);
            System.out.println("La sucesión es: " + numero);
        }
    
    }while(numero != 1);    
        
       
   

      
    }
}      
    
    

