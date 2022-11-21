





// IMPORTAMOS LIBRERIAS SCANNER Y RANDOM PARA LLEVAR A CABO EL CÓDIGO

import java.util.Random;
import java.util.Scanner;

// CLASE MAIN       

public class BuclesWhileForDo {   
    public static void main(String[] args){
       
        
//VAMOS A HACER UN BUCLE WHILE QUE CUENTE DEL 1 AL 10 CON NÚMERO RANDOM TRUE
    
    
    Scanner miScanner = new Scanner(System.in); // EL SCANNER SE SUELE DECLARAR AL PRINCIPIO
     
    int numero = 0;                                     // ESTA VARIABLE RECOGE EL NUMERO DE INTENTOS
    int numeroAleatorio = new Random().nextInt(10) +1; //ESTA VARIABLE ES PARA QUE EL PROGRAMA ELIJA NUMERO ALEATORIO EMPEZANDO POR EL 1 (POR ESO EL +1) HASTA EL 10
                                                      // EL NEXTINT ES UN METODO PARA LA CLASE RANDOM
    
    
    System.out.println("ESTO ES UNA TÓMBOLA, GANAS SI ACIERTAS EL NÚMERO");
    System.out.println("INTRODUZCA AQUÍ SU NÚMERO POR FAVOR: ");
    
    
    int escribirNumero = miScanner.nextInt(); //VARIABLE CON SCANNER PARA QUE EL USUARIO INTRODUZCA VALORES
    numero++;                                //VARIABLE DE NUMERO DE INTENTOS CON SUMATORIO PARA IR RECOGIENDO LAS VECES QUE HA FALLADO
    
    
    while(numero != numeroAleatorio){
        
        System.out.println("INTÉNTELO DE NUEVO");
        System.out.print("LLEVAS "  +numero);
        System.out.println(" INTENTOS");
        escribirNumero = miScanner.nextInt();
        numero++;
        
    }
    
    System.out.println("FELICIDADES HAS GANADO LA TÓMBOLA");
    System.out.print("TU NÚMERO DE INTENTOS TOTAL ES DE " + numero);
    System.out.println(" INTENTOS.");
    
    
   
    
    
//VAMOS A HACER UN BUCLE FOR QUE IMPRIMA 10 NUMEROS, SIEMPRE TENDRÁ LA MISMA ESTRUCTURA
    
    int numeroBucleFor;
    
    for( numeroBucleFor = 1 ; numeroBucleFor <= 10 ; numeroBucleFor++){
        
        System.out.println(numeroBucleFor);
        
    }
    
    System.out.println("Aquí acaba el bucle for :) ");
    
  
//VAMOS A HACER UN BUCLE FOR QUE PREGUNTE AL USUARIO SU EDAD Y MUESTRE POR PANTALLA TODOS LOS AÑOS CUMPLIDOS
    
    
    Scanner otroScanner = new Scanner(System.in);
   
    int i;
    
    System.out.println("HOLA; ¿Qué edad tienes?");
    
    int escribirAños = otroScanner.nextInt();
    
    for( i = 1 ; i <= escribirAños ; i++ ){
        
        System.out.println("Has cumplido: " + i + " años.");
       
    }
           
   
    
  
//VAMOS A HACER UN BUCLE DO...WHILE
    
    Scanner tercerScanner = new Scanner (System.in);
    int opciones; 
     
    do {
       
        System.out.println("Escoge la opción que más te guste: 1 = ¿HAMBURGUESA o 2 = PIZZA?"); 
        
        opciones = tercerScanner.nextInt();  } 
    
    while(opciones != 1 && opciones != 2 );
     
 
 
    if(opciones == 1){  
           
        System.out.println("El menú vale 7,95€");
            
        } else{
           
        System.out.println("El menú vale 10,95€");
        
        }
     
   }
         
    }
    
    


    
    
    
    
    
    
    

