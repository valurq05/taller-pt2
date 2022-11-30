
package ejercicio.pkg7;

public class Ejercicio7 {

    
    public static void main(String[] args) {

// Generar la siguiente sucesión:  1,4,9,16,25,36,49

// DE: Numeros    
// DS: Sucesión

int numeroUno;
int numeroDos;
int cantNumeros;
int sucesion;
sucesion=0;
numeroUno= 1;
numeroDos= 3;
cantNumeros= 10;

int myArray[]= new int[cantNumeros];

        for (int i = 0; i < cantNumeros; i++) {
           
            myArray[i]=numeroUno;
            sucesion= numeroUno + numeroDos;
            numeroUno= sucesion;
            numeroDos= numeroDos + 2;
            
            }

        for (int i = 0; i < cantNumeros; i++) {
            
        System.out.println("La sucesión es: "+(myArray[i]));
        
        }
       
       
       
    }
    
}
