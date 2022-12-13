


/*
ACTIVIDAD 1:
Crea un programa donde definamos las siguientes var. y las convirtamos a los
distintos tipos indicados, mostrando el resultado de la conversión por consola.

int a = 65;  long y char
long b = 10  double y int
char c = ‘A’  int
double d = 1.8  float y int
*/


public class Actividad1 {

    public static void main(String[] args) {
        
    //Variables
    
    int a = 65;
    long b = 10;
    char c = 'A';
    double d = 1.8;
    
    
    //Conversiones
    
    long one = a;
    char two = (char)a;
    double three = b;
    int four = (int)b;
    int five = c;
    float six = (float)d;
    int seven = (int)d;
    
    
    //Mostrar por consola
    
    System.out.println("CASTING DE INT A LONG: " + one);
    System.out.println("CASTING DE INT A CHAR: " + two);
    System.out.println("CASTING DE LONG A DOUBLE: " + three);
    System.out.println("CASTING DE LONG A INT: " + four);
    System.out.println("CASTING DE CHAR A INT: " + five);
    System.out.println("CASTING DE DOUBLE A FLOAT: " + six);
    System.out.println("CASTING DE DOUBLE A INT: " + seven);    
    
    }
}
    