
package guiados;


public class GuiaDos {

public static void main(String[] args) {
        
        
int numeroUno;
int numeroDos;
int sucesion;
numeroUno = 0;
numeroDos = 1;

    for (int i = 0; i < 10; i++) {
     
      System.out.println("Los primeros números de la sucesión son: " + numeroUno);
      
      sucesion = numeroUno + numeroDos;
      numeroUno = numeroDos;
      numeroDos = sucesion;
      
        
    }
        
    
    }
    
}
