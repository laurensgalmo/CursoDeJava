import java.util.Scanner;


/*
ACTIVIDAD 7
Pedir dos palabras por teclado, indicar si son iguales.
*/

public class Actividad7 {

    public static void main(String[] args) {
        
        //Scanner
        
        Scanner scan = new Scanner(System.in);
        
        //Pedir por teclado
       
        System.out.println("Introduzca la primera palabra:");
        
        String palabra1 = scan.nextLine(); //Variable 1
        
        System.out.println("Introduzca la segunda palabra:");
        
        String palabra2 = scan.nextLine(); //Variable 2
        
        //Condicion IF
        
        if(palabra1.equalsIgnoreCase(palabra2)){ //Con equalsIgnoreCase, no considera las mayusculas
            
            System.out.println("Las palabras introducidas son iguales");
        }else{
            
            System.out.println("Las palabras introducidas son diferentes");
        }    
    }
    
}
