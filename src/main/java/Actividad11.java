import java.util.Scanner;

/*
ACTIVIDAD 11
Dada una frase que se pide por consola, el programa debe separarlo en palabras.
*/
public class Actividad11 {

    public static void main(String[] args) {
        
        //Scanner
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduzca una frase para separarla en palabras: ");
        
        //Variables
        
        String frase = scan.nextLine();
        
        //Array
        
        String [] arr = frase.split(" ");
        
        //Bucle for
        
        for(int i = 0 ; i < arr.length ; i++){
            
            System.out.println(arr[i]);
            
        } 
    }  
}
