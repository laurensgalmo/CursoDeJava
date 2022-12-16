


/*
ACTIVIDAD 8
Del siguiente String “La lluvia en Sevilla es una maravilla”
cuenta cuantas vocales hay en total (recorre el String con charAt).
*/

public class Actividad8 {

    public static void main(String[] args) {
        
        //Variable
        
        String frase = "La lluvia en Sevilla es una maravilla";
        int totalVocales = 0;
        
        //Recorrer String
        
        for(int i = 0 ; i < frase.length() ; i++){
     
            //System.out.print(frase.charAt(i));
            
             if((frase.charAt(i) =='a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i') || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')){
             
                totalVocales++;
             }  
        }
        
        System.out.print("Hay un total de " + totalVocales + " vocales."); 
    }
    
}
