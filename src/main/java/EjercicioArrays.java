
import java.util.*;

public class EjercicioArrays {
    
 
    public static void main(String[] args){

     //CREAMOS NUESTRA PRIMERA ARRAY
     
     String [] nombreImpresoras = {"Epson" , "Canon" , "Dell" , "Brother"};
     
     System.out.println("Hay " + nombreImpresoras.length + " marcas de impresora.");
   
     
    
    //CREAMOS UN ARRAY CON EL METODO TOCHARARRAY
    
    String moraleja = "La vanidad y el exceso de confianza nos puede jugar una mala pasada";
    
    char [] moralejaChar = moraleja.toCharArray();
    
    for(int i = 0 ; i < moraleja.length() ; i++){
        
       if(moralejaChar[i] != ' '){
           
            System.out.print(moralejaChar[i]);
            
       } else{
           
            System.out.print('.');
       }
    }
      

    //METODO SORT PARA ORDENAR ARRAYS
    
    
    String [] viajes = {"Toledo" , "Asturias" , "Portugalete" , "Madrid" , "Almería" };
    
    //DESORDENADO
    
    for(int destino = 0 ; destino < viajes.length ; destino++){
    
        System.out.println(viajes[destino]);

}
    
    //ORDENADO; SE PUEDE BORRAR EL FOR DE ARRIBA
    
    Arrays.sort(viajes); //EL METODO SORT NOS AYUDA A INTRODUCIR UN ORDEN, AL SER UN STRING PUES ALFABÉTICAMENTE
  
     for(int destino = 0 ; destino < viajes.length ; destino++){
    
        System.out.println(viajes[destino]);

}
    
}
  }
  
   
   
