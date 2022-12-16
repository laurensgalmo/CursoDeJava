


/*
ACTIVIDAD 13
Declara dos variables numéricas (con el valor que desees), muestra por consola
la suma, resta, multiplicación, división y módulo (resto de la división).
*/

public class Actividad13 {

    public static void main(String[] args) {
        
        //Variables
        
        int valor1 = 6;
        int valor2 = 2;

        //Operaciones
        
        int resultadoSuma = valor1 + valor2;
        int resultadoResta = valor1 - valor2;
        int resultadoMultip = valor1 * valor2;
        int resultadoDiv = valor1 / valor2;
        int resultadoModulo = valor1 % valor2;
        
        //Mostrar resultados
        
        System.out.println("Resultado suma: " + resultadoSuma);
        System.out.println("Resultado resta: " + resultadoResta);
        System.out.println("Resultado multiplicación: " + resultadoMultip);
        System.out.println("Resultado división: " + resultadoDiv);
        System.out.println("Resultado módulo: " + resultadoModulo);
        
    }
    
}
