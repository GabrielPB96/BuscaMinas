package logic;


/**
 * Write a description of class Celda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Celda
{
    private int estado;
    private Punto posicion;
    /**
     * Constructor for objects of class Celda
     */
    public Celda(int x, int y)
    {
        this.posicion = new Punto(x, y);
        this.estado = Estado.VACIO;
    }
    
    public Celda(int x, int y, int estado)
    {
        this.posicion = new Punto(x, y);
        this.estado = estado;
        this.estado = Estado.VACIO;
    }
    
    public int getEstado() {
        return this.estado;
    }
    
    public void setEstado(int nuevoEstado) {
        this.estado = nuevoEstado;
    }
    
    public void picar() {}
    public void ponerBandera(){}
}
