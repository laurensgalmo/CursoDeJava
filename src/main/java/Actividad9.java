


/*
ACTIVIDAD 9
Reemplaza todas las “a” del String anterior por una “e”.
*/
public class Actividad9 {

    public static void main(String[] args) {
        
        //Variable
        
        String frase = "La lluvia en Sevilla es una maravilla";
        
        //Imprimimos la frase normal
         
        System.out.println(frase);
        
        //Método replace() para cambiar la letra por la otra
        
        String reemplazar = frase.replace('a', 'e');
        
        //Imprimir
             
        System.out.println(reemplazar);       
    }  
}
   