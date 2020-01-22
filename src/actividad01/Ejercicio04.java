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
public class Ejercicio04 {
    
    public static void main(String[] args) {
        
        /** He considerado que los recipientes son de 100ml, 
           para darle más veracidad al ejercicio, aunque ha
           habido momentos que me ha complicado el mismo. */
        
        //Definimos las variables que vamos a usar
        float container1 = 0, container2 = 0;
        int option;
        float num1 = 0, num2 = 0, num3 = 0;
        
        //Creo la variable en la que vamos a capturar lo introducido en pantalla
        Scanner sc = new Scanner(System.in);
        
        //Creo el menú, he agregado la opción de mostrar el contenido, por comodidad para la comprobación 
        do{
            System.out.println("Introduzca la operación a realizar del siguiente menú de opciones:");
            System.out.println("");
            System.out.println("1- Añadir refresco al primer recipiente.");
            System.out.println("2- Traspasar refresco del primer al segundo recipiente.");
            System.out.println("3- Quitar refresco del segundo recipiente.");
            System.out.println("4- Mostrar el estado actual de los recipientes.");
            System.out.println("0- Finalizar.");
            System.out.println("");

            //Capturo en una variable lo introducido en pantalla
            option = sc.nextInt();
            //Evalúo la opción elegida del menú
                switch(option){
                    
                    case 1:
                        do{
                            System.out.println("Inserta la cantidad a añadir, el volumen máximo del recipiente es de 100ml:");  //Pido el priemr número por pantalla
                            num1 = sc.nextFloat();                                                                              //Capturo el primer número 
                            if((num1 >=0 ) && (num1 <= 100)){                                                                //Compruebo primero que el número este entre 0 y 100 
                               if(container1 >= 100){                                                                           //Compruebo que el recipiente no esté lleno
                                    System.out.println("El recipiente 1 ya está lleno:" + container1 + " ml.");
                                }else if((container1 + num1) > 100){                                                           //Compruebo que el recipiente no revose   
                                        System.out.println("El recipiente 1 revosaría, no se añade la cantidad y sigue conteniendo: " + container1 + " ml.");
                                    
                                }else{                                                                                          //Si no revosa la cantidad se queda agregada 
                                        container1 += num1;
                                        System.out.println("El recipiente 1 contiene: " + container1 + " ml.");
                                        System.out.println("El recipiente 2 contiene: " + container2 + " ml.");
                                }   
                            }else{                                                                                              //Si el número no está entre 0 y 100, salta el error                                  
                                System.out.println("El número introducido no es válido.");      
                            }
                        }while((num1 <0 ) || (num1 > 100));                                                                     //Bucle mientras el número introducido no esté entre 0 y 100
                    break;

                    case 2:
                        do{
                            System.out.println("Inserta la cantidad a traspasar:");                                             //Pido el segundo número
                            num2 = sc.nextFloat();                                                                              //Capturo el segundo numero
                            if((num2 >= 0) && (num2 <= 100)){                                                                   //Compruebo primero que el número esté entre 0 y 100
                                if(num2 > container1){                                                                          //Compruebo si el número es mayor que la cantidad en el recipiente 1
                                    System.out.println("No puedes traspasar más cantidad de la que tiene el recipiente 1, que es: " + container1 + " ml.");
                                }else if(container2 == 100){                                                                    //Compruebo que el recipiente 2 no esté lleno
                                    System.out.println("El recipiente 2 está lleno, vacielo primero. Contiene: " + container2 + " ml.");
                                }else if((container2 + num2) > 100){                                                           //Compruebo que no va a revosar
                                    System.out.println("El recipiente 2 revosaría, no se realiza la operación. El recipiente 2 se queda: " + container2 + " ml.");
                                }else{                                                                                          //Si no revosa dejo la cantidad en el recipiente 2 y se la quito al 1
                                    container2 += num2;
                                    container1 -= num2;
                                    System.out.println("El recipiente 1 contiene: " + container1 + " ml.");
                                    System.out.println("El recipiente 2 contiene: " + container2 + " ml.");
                                }
                            }else{                                                                                              //Para cuando el número introducido no está entre 0 y 100
                                System.out.println("El número introducido no es válido");
                            }
                        }while((num2 < 0) || (num2 >100));                                                                      //Bucle mientras el número introducido no esté entre 0 y 100
                    break;

                    case 3:
                        do{                            
                            System.out.println("Inserta la cantidad a quitar:");                                                //Pido el tercer número
                            num3 = sc.nextFloat();                                                                              //Capturo el tercer número
                                                    
                            if((num3 >= 0) && (num3 <= 100)){                                                                   //Compruebo que el número esté entre 0 y 100
                                if(num3 > container2){                                                                          //Compruebo que el número no sea mayor que la cantidad en el recipiente
                                    System.out.println("No puedes quitar más cantidad de la que contiene el recipiente 2, que es: " + container2 + " ml.");
                                }else{                                                                                          //Quito la cantidad correspondiente
                                    container2 -= num3;
                                    System.out.println("El recipiente 1 contiene: " + container1 + " ml.");
                                    System.out.println("El recipiente 2 contiene: " + container2 + " ml.");
                                }
                            }else{                                                                                              //Si el número no está entre 0 y 100, salta el error
                                System.out.println("El número introducido no es válido.");
                            }
                        }while((num3 < 0) || (num3 > 100));                                                                     //Bucle mientras el número introducido no esté entre 0 y 100
                    break;
                        
                    case 4:                                                                                                     //Muestro el estado de los recipientes en el estado que se piden
                        System.out.println("El recipiente 1 contiene actualmente: " + container1 + " ml.");
                        System.out.println("El recipiente 2 contiene actualmente: " + container2 + " ml.");
                    break;

                    case 0:                                                                                                     //Muestro el estado final al finalizar el programa
                        System.out.println("El recipiente 1 finalmente contiene: " + container1 + " ml.");
                        System.out.println("El recipiente 2 finalmente contiene: " + container2 + " ml.");
                        System.out.println("Has elegido finalizar el programa.");
                    break;

                    default:                                                                                                    //Si el número introducido no pertenece a una opción del menú salta el mensaje
                        System.out.println("El número no es una de las opciones del menú, vuelve a intentarlo.");
                }
        }while(option !=0);                                                                                                     //Orden de finalizar el programa cuando se inserta el 0
        System.out.println("Finalizando el programa.");
    }
}
