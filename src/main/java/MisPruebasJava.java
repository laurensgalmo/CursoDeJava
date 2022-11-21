


public class MisPruebasJava {

    public static void main(String[] args) {
       
   /* 
    int david = 0;

    if(david > 0){
         System.out.println("POSITIVO");    
    }else if(david < 0){
         System.out.println("NEGATIVO"); 
    }else{
        System.out.println("IGUAL A CERO"); 
    }
        */

    Coche miCoche = new Coche();
    
    miCoche.incrementarPuerta();
    int resultadoTotal = miCoche.sumarVariables(3, 4, 5);

    System.out.println("Mi coche tiene: " + miCoche.puertas + " puertas.");
    System.out.println("La suma es igual a: " + resultadoTotal + ".");
         
        }     
}
        


