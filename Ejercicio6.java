
package ejercicio.pkg6;


public class Ejercicio6 {

    public static void main(String[] args) {
// Maria Valentina Urquijo Camargo, Laura Sofia Garcia
// Realice algoritmo que genere la siguiente sucesión hasta los 10 primeros números ( 5,15,45,135,405,1215)

// DE: Primer número de la sucesión
// DS: 10 primeros números sucesión


int numeroUno;
int numeroDos;
int cantNumeros;
int sucesion;
sucesion=0;
numeroUno= 5;
numeroDos= 3;
cantNumeros= 10;

int myArray[]= new int[cantNumeros];

        for (int i = 0; i < cantNumeros; i++) {
           
            myArray[i]=numeroUno;
            sucesion= numeroUno * numeroDos;
            numeroUno= sucesion;
        
            }

        for (int i = 0; i < cantNumeros; i++) {
            
        System.out.println("La sucesión es: "+(myArray[i]));
        
        }
   
    }
    
}