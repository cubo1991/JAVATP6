package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio5 {
    public static void arrayListOrdenados() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numerosEnteros = new ArrayList<Integer>();
        ArrayList<Integer> numerosEnterosAsc = new ArrayList<Integer>();
        ArrayList<Integer> numerosEnterosDesc = new ArrayList<Integer>();

        //Pedimos los numeros a ingresar
        System.out.println("Por favor, ingrese 10 valores enteros");
        for(int i = 0; i < 10; i++){
            numerosEnteros.add(sc.nextInt());
        }

        //Clonamos el arrayList para ordenarlos
        numerosEnterosAsc = (ArrayList<Integer>)numerosEnteros.clone();
        numerosEnterosDesc = (ArrayList<Integer>)numerosEnteros.clone();

        //Usamos el metodo sort para ordenarlos
        Collections.sort(numerosEnterosAsc);
        Collections.sort(numerosEnterosDesc, Collections.reverseOrder());


        //Mostramos por pantalla
        System.out.println("La lista ordenada de menor a mayor es:");
        for (int numero : numerosEnterosAsc) {
            System.out.print(numero + " " );
        }
        System.out.println("La lista ordenada de mayor a menor es:");
        for (int numero : numerosEnterosDesc) {
            System.out.print(numero + " " );
        }
    }
}
