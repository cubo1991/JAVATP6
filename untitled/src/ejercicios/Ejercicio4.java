package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
public static void secuencialArrayList() {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    Integer n = 0;
    int numeroBuscar=-1;
    int posicion=0;
    boolean encontrado = false;

    //Ingresamos valores
    for (int i = 0; i < 50; i++) {
        n =  (int) (Math.random()*100);
        numeros.add(n);
    }

    //Pedimos el valor a buscar
    System.out.println("Por favor, ingrese un número a buscar");
    numeroBuscar = sc.nextInt();
    for (int i = 0; i < 50; i++) {
        if (numeroBuscar == numeros.get(i)) {
            posicion = i;
            encontrado = true;
            break;
        }

    }
    if (encontrado) {
        System.out.println("El numero se encuentra en la posicion "+ posicion);
    }else{
        System.out.println(("El número no se encuentra en la lista"));
    }
}
}
