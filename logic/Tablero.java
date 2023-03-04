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
    
    public void inicializarBombas(ArrayList<Punto> valores) {
        for(Punto p : valores) {
            tablero[p.getFila()][p.getColumna()].setEstado(Estado.BOMBA);
        }
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
