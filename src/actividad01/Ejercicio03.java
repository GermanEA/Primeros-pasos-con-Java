/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Germán Estrade
 */
public class Ejercicio03 {
    
    public static void main(String[] args) throws IOException {
        
        float num1, num2;   //Definimos nuestras variables como números decimales
        String valorIntroducido; //Definimos la variable String que capturaremos de la pantalla
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //Activamos la variable en la que almacenamos el texto introducido
        
        System.out.println("Inserte un primer número decimal:");    //Pedimos el primer número
        valorIntroducido = br.readLine();                           //Capturamos el texto escrito por teclado
        num1 = Float.parseFloat(valorIntroducido);                  //Parseamos para convertir la variable String en decimal
        
        do{                                                             //Mientras el número introducido sea igual a cero seguimos preguntando y guardando la variable
            System.out.println("Inserte un segundo número decimal:");   //Pedimos el segundo número
            valorIntroducido = br.readLine();                           //Capturamos el texto escrito por teclado
            num2 = Float.parseFloat(valorIntroducido);                  //Parseamos para convertir la variable String en decimal
        }while(num2 ==0 );
        
        System.out.println("División: " + num1 / num2);             //División cuando el segundo número es distinto de cero
    }
}
