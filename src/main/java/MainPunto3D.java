
import java.awt.Point;





public class MainPunto3D {

    public static void main(String[] args) {
        
        Punto uno = new Punto(6, 3, 2);
        Punto dos = new Punto(4, 8, 9);
        
        
        
        System.out.println("Las coordenadas del punto uno son: " + uno.toString());
        System.out.println("Vamos a mover las coordenadas del punto uno");
        uno.move(7, 4, 2);
        System.out.println("Ahora las coordenadas del punto uno se encuentran aquí: " + uno.toString());
        
        
        System.out.println("Las coordenadas del punto dos son: " + dos.toString()); 
        
        
        int sumaDePuntos =  uno.sumatorio() + dos.sumatorio();
        System.out.println("La suma de los puntos es igual a " + sumaDePuntos);
        
    }
    
    
}
