package ejercicios;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList; // Importa la clase ArrayList desde java.util
import java.util.Scanner;

/**
 *
 * @author alopez
 */
public class Ejercicio3 {
      public static void arrayListNumber() {
      Scanner sc = new Scanner(System.in);
         ArrayList<Integer> numeros = new ArrayList<Integer>();
         Integer n = 0;
          int sumaTotal = 0;
          int numerosMayores =0;
          int numerosMenores =0;
         
          //Ingresamos valores
        for (int i = 0; i < 20; i++) {          
            n =  (int) (Math.random()*51)*2;
            numeros.add(n);
        }
        // Sumamos los valores y sacamos el promedio
          for (int numero : numeros) {
              sumaTotal += numero;
          }
          int promedio= sumaTotal / numeros.size();

          //Buscamos los numeros mayores y los menores al promedio
          for (int numero : numeros) {
              if(numero <= promedio){
                  numerosMenores ++;
              }
              if (numero >= promedio){
                  numerosMayores ++;
              }
          }


          //Los mostramos en pantalla
          System.out.println("El promedio aritmetico es: "+ promedio);
          System.out.println("La cantidad de numeros menores al promedio es : "+ numerosMenores);
          System.out.println("El promedio mayores es : "+ numerosMayores);


         
      }
    
}
