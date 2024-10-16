package ejercicios;

import java.util.ArrayList; // Importa la clase ArrayList desde java.util
import java.util.Scanner;
/**
 *
 * @author alopez
 */



public class Ejercicio1 {


    public static void arrayListNumber() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Integer n = 0;

        System.out.println("Por favor, ingrese un valor. Cuando ingrese un valor menor a 0, dar� el ciclo por finalizado");
        while (n > -1) {
            n = sc.nextInt();
            if (n > -1) {
                numeros.add(n);
            }

        }
        System.out.println("Los n�meros son:");
        for (int numero : numeros) {
            System.out.print(numero+ " ");
        }
        System.out.println(" ");
    }
    }