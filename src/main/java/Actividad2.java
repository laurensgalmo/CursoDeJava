import java.util.Scanner;


/*
ACTIVIDAD 2:
Definir tres variables locales nombre, apellidos y edad, siendo esta última de tipo entero. 
Estas variables se introducirán por consola.
Finalmente mostrará un mensaje en consola usando las variables de la siguiente forma: 
“Hola nombre apellidos tienes edad años”.
*/

public class Actividad2 {

    public static void main(String[] args) {
      
    //Introducir datos por consola; Declarar Scanner al principio, siempre
    
    Scanner scan = new Scanner(System.in);
       
    //Variables
    
    String nombre = scan.nextLine();
    String apellidos = scan.nextLine();
    int edad = scan.nextInt();
    
  //Mostrar mensaje por consola
  
  System.out.println("Hola " + nombre + " " + apellidos + " " + "tienes " + edad + " años.");
    
        
        
    }
    
}
