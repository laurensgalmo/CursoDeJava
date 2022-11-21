




public class ProgramacionOrientadaObjetos {
    
    String estatus;
    int velocidad;
    float temperatura;
    
    void comprobarTemperatura(){
        
        if(temperatura > 660){
            estatus = "VOLVIENDO A CASA";
            velocidad = 5;
        }
    }
    
    void mostrarAtributos(){
    
        System.out.println("ESTATUS: " + estatus);
        System.out.println("VELOCIDAD:  " + velocidad);
        System.out.println("TEMPERATURA " + temperatura);     
}
}
