
import java.util.Scanner;

/*
ACTIVIDAD 14
Lee un número por teclado que pida el precio de un producto
(puede tener decimales) y calcule el precio final con IVA.
El IVA será una constante y será el 21%.
*/
public class Actividad14 {

    public static void main(String[] args) {
      
        //Constante IVA
        
        final int NUMERO_IVA = 21;
        
        //Scanner
        
        Scanner scan = new Scanner(System.in);
        
        //Variables
        
        System.out.println("Introduzca el precio del producto deseado: ");
        
        int precio = scan.nextInt();
        int precioIva = (precio * NUMERO_IVA) / 100;
        int precioTotal = precioIva + precio;
        
        //Resultado 
        
        System.out.println("El precio del producto con IVA 21% es de: " + precioTotal + " euros.");
    
    }
    
}
