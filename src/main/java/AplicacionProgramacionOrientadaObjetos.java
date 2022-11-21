


public class AplicacionProgramacionOrientadaObjetos {

  
    public static void main(String[] args) {
      
        //PASO 1; INSTANCIAR UNA CLASE
        
        ProgramacionOrientadaObjetos objeto = new ProgramacionOrientadaObjetos();  
        
        //PASO 2; LLAMAR A LOS ATRIBUTOS PARA EL OBJETO CREADO Y DAR VALOR
        
        objeto.estatus = "EXPLORANDO...";
        objeto.velocidad = 2;
        objeto.temperatura = 510;
        
        //PASO 3; LLAMAR AL METODO MOSTRARATRIBUTOS
        
        objeto.mostrarAtributos();
        
        System.out.println("INCREMENTANDO VELOCIDAD A 3 ");
        
        objeto.velocidad = 3;
   
        objeto.mostrarAtributos();
    }
    
}
