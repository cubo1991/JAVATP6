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
public class Ejercicio2 {

    public static void arrayMayorMenor() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        double n = 0.0;
        int nDecimal;
        int menor = 0;
        int mayor = 0;

        //Ingresamos valores
        for (int i = 0; i < 20; i++) {
            System.out.println("Por favor, ingrese el " + (i + 1) + " valor.");
            n = sc.nextDouble();
            nDecimal = (int)n;
            numeros.add(nDecimal);
        }
        System.out.println(numeros.size());

        //Buscamos el menor
        for (int numero : numeros) {
            if (menor == 0) {
                menor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }

        }
         //Buscamos el mayor
        for (int numero : numeros) {
            if (mayor == 0) {
                mayor = numero;
            }
            if (numero > mayor) {
                mayor = numero;
            }

        }
        int rango = mayor - menor;
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El rango es: " + rango);

    }
}
