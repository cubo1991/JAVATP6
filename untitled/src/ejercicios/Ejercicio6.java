package ejercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void matrizCuadrada() {
        Scanner sc = new Scanner(System.in);

        //Le pedimos los datos al usuario
        while (true){
            System.out.println("Por favor ingrese un valor");
            String valor = sc.nextLine();
            if(valor.equalsIgnoreCase("FIN")){
                break;
            }
            System.out.println("Por favor ingrese la fila");
            int fila = sc.nextInt();
            System.out.println("Por favor ingrese la columna");
            int columna = sc.nextInt();
            sc.nextLine();
           matriz.agregarCelda(fila, columna, valor);
        }

        System.out.println("La lista es:");
        for (Celda celda : matriz.matrizCuadrada) {
            System.out.print(celda.getValor() + " " );
        }
        System.out.println( " " );

        //Metodo para buscar un valor
        int f;
        int c;
        String resultado;
        System.out.println("Por favor ingrese la fila");
        f = sc.nextInt();
        System.out.println("Por favor ingrese la columna");
        c = sc.nextInt();
        resultado = matriz.busquedaValor(f, c);
        System.out.println(resultado);


    }




    static class matriz {
        static ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();

        public static void agregarCelda(int fila, int columna, String valor) {
            Celda celda = new Celda(fila, columna, valor);
            matrizCuadrada.add(celda);
        }
        public static String busquedaValor(int fila, int columna) {
            boolean encontrado = false;
            String mensaje= "";
            for (Celda celda : matriz.matrizCuadrada) {
                if (celda.getFila() == fila && celda.getColumna() == columna) {
                    mensaje = celda.getValor();
                    encontrado = true;
                    break;

                }
            }
           if(!encontrado){
               mensaje = "La fila y columna indicada no ha sido asignada";
               return mensaje;
           } else {
               return "El valor almacenado es " + mensaje;
           }



        }
    }

}

