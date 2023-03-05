package logic;


/**
 * Write a description of class Punto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto
{
    // instance variables - replace the example below with your own
    private int fila;
    private int columna;
    /**
     * Constructor for objects of class Punto
     */
    public Punto(int fila, int columna)
    {
        this.fila = fila;
        this.columna = columna;
    }
    
    public int getFila(){return this.fila;}
    public int getColumna(){return this.columna;}
    
    public boolean equals(Object otro) {
        if(otro instanceof Punto){
            Punto o = (Punto)otro;
            return o.fila == this.fila && o.columna == this.columna;
        }else {
            return false;
        }
    }
}
