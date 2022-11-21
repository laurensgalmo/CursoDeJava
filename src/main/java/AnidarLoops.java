



public class AnidarLoops {
    
    public static void main(String[] args){
        
        int puntos = 0;
        int target = 100;
        
        nombreWhile: //SI NO LE DAMOS NOMBRE A ESTE LOOP SERÍA INFINITO. LUEGO USAMOS EL NOMBRE JUNTO EL BREAK.
        while(target <= 100){
            
            for(int i=0; i < target ; i++){
                
                if(puntos > 50){
                    
                    System.out.println("Hemos llegado a " + puntos + " puntos. Saliendo del programa..." );
                    
                    break nombreWhile;
                } 
                    puntos = puntos + i; 
            }
           
        }
        
    }
    
}
