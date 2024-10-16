package ejercicios;

public class Celda {
   private int fila;
   private int columna;
   private String valor;


    public void setFila(int fila) {
       this.fila = fila;
    }
    public int getFila() {
       return fila;
    }
    public void setColumna(int columna) {
        this.columna = columna;
    }
    public int getColumna() {
        return columna;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getValor() {
        return valor;
    }

    public Celda(int fila, int columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }

}
