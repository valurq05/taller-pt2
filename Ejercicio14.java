
package ejercicio.pkg14;

public class Ejercicio14 {

   
    public static void main(String[] args) {
        
 // La suma de 6 números impares consecutivos vale 120. Encontrar esos números

 
 
 // DE: números impares
 // DS: Los 6 números impares que suman 120
 
int[] numeros= new int[6];
int resultado=0;
int contador=0;
int impar=1;
      
      while(resultado !=120){
          numeros[contador]=impar;
          resultado=numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4]+numeros[5];
          impar=impar+2;
          if(contador==5){
              contador=0;
          }
          else{
              contador=contador+1;
          }
      }
      
      for (int i=0;i<6;i++){
          System.out.println(numeros[i]);
      }
     
   
      System.out.println("el resultado es: "+ resultado);
    }
    
}
