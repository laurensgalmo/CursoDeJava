import java.util.Scanner;



/*
ACTIVIDAD 3
Haz una aplicación que calcule el área de un círculo(pi*R2).
El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble ).
Usa la constante PI y el método pow de Math.
*/

public class Actividad3 {

    public static void main(String[] args) {

        // Scanner
        
        Scanner scan = new Scanner(System.in);
        
        //Pedir por pantalla el radio
        
        System.out.println("Introduzca el radio: ");
        
        //Variable Radio
        
        String r2 = scan.nextLine();
        double doubleR2 = Double.parseDouble(r2);
        
        //Calcular área de un círculo
        
        double calcularAreaCirculo = Math.PI * Math.pow(doubleR2, 2);
        
        //Mostrar por pantalla el resultado
        
        System.out.println("El área del círculo es: " + calcularAreaCirculo);

    }
    
}
