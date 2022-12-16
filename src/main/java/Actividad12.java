
import java.util.Scanner;

/*
ACTIVIDAD 12
Crear un programa, con dos variables enteros donde los valores se pedirán por
consola. Mostrará finalmente un mensaje: “La suma de XX y YY es ZZ”.
*/

public class Actividad12 {

    public static void main(String[] args) {
        
       //Scanners
       
       Scanner scan = new Scanner(System.in);
       
       //Variables de tipo entero
       
        System.out.println("Primer número: ");
       
        int var1 = scan.nextInt();
       
        System.out.println("Segundo número: ");
       
        int var2 = scan.nextInt();
       
       //Mensaje
       
        int resultado = var1 + var2;
       
        System.out.println("La suma de " + var1 + " y " + var2 + " es: " + resultado);
      
    }
    
}
