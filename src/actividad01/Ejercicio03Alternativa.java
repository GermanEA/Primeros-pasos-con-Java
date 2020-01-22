/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad01;

import java.util.Scanner;


/**
 *
 * @author Germán Estrade
 */
public class Ejercicio03Alternativa {

    public static void main(String[] args) {
        
        float num1, num2; //Defino las variables que vamos a usar
              
        Scanner sc = new Scanner(System.in);   //Activamos la variable en la que almacenamos el texto introducido con Scanner
        
        System.out.println("Inserte un primer número decimal:");    //Pedimos el primer número
        num1 = sc.nextFloat();                                      //Capturamos el número escrito en pantalla
                                            
        System.out.println("Inserte un segundo número decimal:");   //Pedimos el segundo número
        num2 = sc.nextFloat();                                      //Capturamos el número escrito en pantalla
                         
        while(num2 ==0 ){                                           //Mientras el número introducido sea igual a cero seguimos preguntando y guardando la variable
            System.out.println("Inserte un segundo número decimal distinto de cero:");
            num2 = sc.nextFloat();
        }
        
        System.out.println("División: " + (num1 / num2));             //División cuando el segundo número es distinto de cero
    }
}
