package logic;
import java.util.ArrayList;

/**
 * Write a description of class Tablero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tablero
{
    private int tamanio;
    private Celda[][] tablero;
    /**
     * Constructor for objects of class Tablero
     */
    public Tablero(int tamanio)
    {
        this.tamanio = tamanio;
        this.tablero = new Celda[tamanio][tamanio];
        inicializarTablero();
    }

    private void inicializarTablero(){
        for(int f = 0; f < tamanio; f++) {
            for(int c = 0; c < tamanio; c++) {
                tablero[f][c] = new Celda(f, c, Estado.VACIO);
            }
        }
    }

    private void inicializarEstadoCeldas() {
        for(int f=0; f<tamanio;f++){
            for(int c=0; c<tamanio;c++){
                if(tablero[f][c].getEstado() == Estado.VACIO) {
                    tablero[f][c].setEstado(contarBombas(f, c));
                }
            }
        }
    }

    private int contarBombas(int fila, int columna) {
        Punto[] movimientos = {
                new Punto(-1, -1), new Punto(-1, 0), new Punto(-1, 1),
                new Punto(0, -1), new Punto(0, 1),
                new Punto(1, -1), new Punto(1, 0), new Punto(1, 1)
            };
        int contador = 0;
        for(Punto p : movimientos) {
            int f = p.getFila(), c = p.getColumna();
            if(fila - f >= 0 && fila + f < tamanio && columna - c >= 0 && columna+c<tamanio){
                if(tablero[fila+f][columna+1].getEstado() == Estado.BOMBA) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public void inicializarBombas(ArrayList<Punto> valores) {
        for(Punto p : valores) {
            tablero[p.getFila()][p.getColumna()].setEstado(Estado.BOMBA);
        }
        inicializarEstadoCeldas();
    }

    public void picarCelda(int fila, int columna) {
        tablero[fila][columna].picar();
    }

    public void ponerBandera(int fila, int columna) {
        tablero[fila][columna].ponerBandera();
    }

    public Celda[][] getTablero() {
        return tablero;
    }
}
