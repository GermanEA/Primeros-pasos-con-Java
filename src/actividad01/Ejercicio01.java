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
public class Ejercicio01 {
    
    public static void main(String[] args) throws IOException {
        // Declaramos dos variables en las que almacenar valores númericos
        //las variables de tipo "int" nos permiten almacenar enteros
        int total_melones;
        int total_sandias;

        //guardamos valores enteros en las variables enteras
        total_melones = 10;
        total_sandias = 20;

        //modificamos el contenido de las variables enteras	porque el granizo las ha mermado
        total_melones = total_melones - 5;
        total_sandias = total_sandias - 2;

        //mostramos por consola el valor actual de las variables enteras
        System.out.println("Quedan " + total_melones + " melones despues del granizo"); //conversion implícita a String
        System.out.println("Quedan " + total_sandias + " sandias despues del granizo"); //conversion implícita a String

        //Mostramos un mensaje al usuario pidiendole que indique un numero por consola
        System.out.println("Quantos melones te quieres comer?"); //conversion implícita a String
        //Declaramos una variable compleja de nombre "br" y de tipo "BufferedReader".
        //Las variables del tipo "BufferedReader" contienen funciones para leer datos por consola
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //utilizamos la función "readLine" de la variable "br" para leer un dato por consola
        //guardamos el número introducido en la variable "valor_escrito"
        String valor_escrito = br.readLine();

        /*Convertimos la variable "valor_escrito" a un valor entero para poder operar con él   
         * y lo almacenamos en la variable "numero_melones_comer"
         */
        int numero_melones_comer = Integer.parseInt(valor_escrito);  //conversion explícita a int

        total_melones = total_melones - numero_melones_comer;
        System.out.println("Finalmente quedan " + total_melones + " melones");
        
        //Mostramos un mensaje al usuario pidiendole que indique un numero por consola
        System.out.println("Cuantas sandias te apetece comer?");
       
        //Declaramos la variable para poder leer los datos introducidos por pantalla
        //BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in)); Esperando comprobar que manera es la correcta
       
        //guardamos el número de sandías que se van a comer
        String valor_escrito_sandias = br.readLine();
        
        //Convertimos la variable de texto en un número para poder hacer las operaciones
        int numero_sandias_comer = Integer.parseInt(valor_escrito_sandias);
       
        //Hacemos el cálculo de las sandías que les quedan después de comer
        total_sandias = total_sandias - numero_sandias_comer;
        
        //Mostramos el resultado por pantalla
        System.out.println("Ahora te quedan " + total_sandias + " sandias");
    }

}
