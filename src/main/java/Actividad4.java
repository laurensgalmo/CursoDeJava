import java.util.Scanner;



/*
ACTIVIDAD 4
Lee un número por teclado y muestra por consola, el carácter al que pertenece
en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una “a”.
*/


public class Actividad4 {

    public static void main(String[] args) {
        
        //Scanner
        
        Scanner scan = new Scanner(System.in);
        
        //Teclado
             
        System.out.println("Introduzca un número: ");
        
        //Variable
        
        int numero = scan.nextInt();
        char ch = (char)numero;
        
        //Mensaje codigo ASCII
        
        System.out.println("El número introducido es la letra " + ch + " en código ASCII.");
        
    }
    
}
