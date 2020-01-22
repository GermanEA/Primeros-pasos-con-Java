/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad01;

/**
 *
 * @author Germán Estrade
 */
public class Ejercicio02 {
    
        
     public static void main(String[] args) {
        
        //Tipo de dato de 1 byte (8 bits)
        boolean soleado = true;
        System.out.println("La variable boolean nos devuelve solo dos posibles valores (true o false), en este caso es: " + soleado);
        
        //Tipo de dato entero de 1 byte (8 bits)
        byte numByte = 127;
        System.out.println("La variable byte nos almacena números enteros comprendidos entre -128 y 127, en este caso el número: " + numByte);
        
        //Tipo de dato carácter de 2 bytes (16 bits)
        char letraUnicode = 'g';
        System.out.println("La variable char nos permite almacenar caracteres unicode, es decir un solo caracter, en este caso es: " + letraUnicode);
        
        //Tipo de dato entero de 2 bytes (16 bits)
        short numShort = 1254;
        System.out.println("La variable short nos almacena números enteros comprendidos entre -32.768 y 32.767, en este caso el número: " + numShort );
        
        //Tipo de dato entero de 4 bytes (32 bits)
        int numInt = 142536;
        System.out.println("La variable int nos almacena números enteros comprendidos entre -2.147.483.648 y 2.147.483.647, en este caso el número: " + numInt );
        
        //Tipo de dato entero de 8 bytes (64 bits)
        long numLong = 1436142535227789L;
        System.out.println("La variable long nos almacena números enteros comprendidos entre  -9.223.372.036.854.775.808 y 9.223.372.036.854.775.807, en este caso el número: " + numLong );
               
        //Tipo de dato decimal de 4 bytes (32 bits)
        float numDecimal = 20.24565F;
        System.out.println("La variable float nos almacena números decimales con una precisión aproximada de 7 dígitos, en este caso el número decimal: " + numDecimal);
        
        //Tipo de dato decimal de 8 bytes (64 bits)
        double numDouble = 302.55;
        System.out.println("La variable double nos almacena números decimales con una precisión aproximada de 16 dígitos, en este caso el número decimal: " + numDouble);
        
        //Operadores ariméticos binarios, unarios, de asignación, relacionales y lógicos
        System.out.println("");
        System.out.println("-- Operador aritméticos binarios --");
        
        int a = 30; //Defino tres variables para hacer los cálculos
        int b = 10;
        int c = 21;
        
        System.out.println("El resultado de sumar 10 más 30 es: " + ( b+a ));
        System.out.println("El resultado de restar 30 menos 10 es: " + ( a-b ));
        System.out.println("El resultado de multiplicar 10 por 15 es: " + ( b*15 ));
        System.out.println("El resultado de dividir 10 entre 2 es: " + ( b/2 ));
        System.out.println("El resultado del resto de dividir 21 entre 2 es: "+ ( c%2 ));
       
        System.out.println("");
        System.out.println("-- Operadores aritméticos unarios --");   
        
        int d = 20; //Defino tres variables para poder usarla en los ejemplos
        int e = 10;
        int f = 5;
        
        System.out.println("El resultado de incrementar en 1 al valor 20 es: " + ++d );
        System.out.println("El resultado de decrementar en 1 al valor 10 es: " + --e );
        System.out.println("El resultado de cambiar de signo 5 es: " + -f );
        
        boolean resulBooleano = !true;
        System.out.println("El resultado de cambiar el valor booleano es: " + resulBooleano );
        
        System.out.println("");
        System.out.println("-- Operadores aritméticos de asignación --");
        
        int resultado = 100; //Defino una variable para usarla en los nuevos ejemplos
        
        System.out.println("Le asignamos un valor a una variable de nombre resultado, el cuál es: " + resultado);
        System.out.println("Al resultado le sumamos 30 y nos quedaría: " + ( resultado += 30 ));
        System.out.println("Al nuevo resultado de 130 le restamos ahora 50 y nos queda: " + ( resultado -= 50 ));
        System.out.println("Ahora multiplicamos por 2 y nos quedaría: " + ( resultado *= 2 ));
        System.out.println("Si lo dividimos el nuevo resultado por 5 nos encontramos con un valor de: " + ( resultado /= 5 ));
        System.out.println("Dividimos el nuevo número entre 6 y el resto nos daría el valor de: " + ( resultado %= 6));
        
        System.out.println("");
        System.out.println("-- Operadores relacionales --");
        
        int g = 12; //Defino una variable a utilizar
        
        System.out.println("Nuestra variable tiene un valor de: " + g );
        System.out.println("Vamos a comprobar si la variable es igual a 10: " + (g == 10));
        System.out.println("Vamos a comprobar si la variable es distinto a 10: " + (g != 10));
        System.out.println("Vamos a comprobar si la variable es mayor que 10: " + (g > 10));
        System.out.println("Vamos a comprobar si la variable es menor que 10: " + (g < 10));
        System.out.println("Vamos a comprobar si la variable es mayor o igual a 15: " + (g >= 15));
        System.out.println("Vamos a comprobar si la variable es menor o igual a 15: " + (g <= 15));
        
        System.out.println("");
        System.out.println("-- Operadores lógicos --");
        
        boolean h = true;
        boolean i = false;
        
        System.out.println("¿Son las dos variables true? " + (h && i));
        System.out.println("¿Alguna de las dos variable es true? " + (h || i));
        System.out.println("El resultado contrario de la variable h es: " + !h );
        
    }
}
