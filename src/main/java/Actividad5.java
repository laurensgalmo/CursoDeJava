
import java.util.Scanner;

/*
ACTIVIDAD 5
Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un
carácter ( char ) y muestre su código en la tabla ASCII.
*/

public class Actividad5 {

    public static void main(String[] args) {
      
        //Scanner
        
        Scanner scan = new Scanner(System.in);
        
        //Teclado
             
        System.out.println("Introduzca una letra: ");
        
        //Variable
        
        char letra = scan.next().charAt(0);
        int numero = (int)letra;
        
        
        //Mensaje codigo ASCII
        
        System.out.println("La letra introducida es el número " + numero + " en código ASCII.");
        
        
    }
    
}
