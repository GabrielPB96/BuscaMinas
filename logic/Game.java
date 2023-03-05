package logic;
import java.util.ArrayList;


/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    final int TAMANIO = 9;
    final int NUMERO_BOMBAS = 10;
    private Tablero tablero;
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        tablero = new Tablero(TAMANIO);
        tablero.inicializarBombas(generarBombas());
    }
    
    private ArrayList<Punto> generarBombas() {
        ArrayList<Punto> valores = new ArrayList<Punto>();
        for(int i=0; i<NUMERO_BOMBAS; i++) {
            int f, c;
            do{
                f = (int)(Math.random()*TAMANIO);
                c = (int)(Math.random()*TAMANIO);
            }while(valores.contains(new Punto(f, c)));
            valores.add(new Punto(f, c));
        }
        return valores;
    }
    
    public void showTablero() {
        tablero.showTablero();
    }
}
