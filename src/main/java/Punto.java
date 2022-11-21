
import java.awt.*;


public class Punto extends Point {
    
    public int z;
    
    public Punto(int x, int y, int z){
        
        super(x, y);
        this.z = z;
        
    }
    
    public void move(int x, int y, int z){
        this.z = z;
        super.move(x, y);
        
    }
    
    public void translate(int x, int y, int z){
        this.z += z;
        super.translate(x, y);
        
    }
    
    public int sumatorio(){
        
        int suma = super.x + super.y + this.z;
        
        return suma;
    }
    
    
    
    
   public String toString(){
    
       return "[x = " + super.x + ", y = " + super.y + ", z = " + this.z + "]";
        
    } 
            
    
}
