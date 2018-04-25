/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author alanp
 */
public class Jugador {
    
    public NaveUnitaria nave1;
    public NaveCompleja nave2;
    public NaveCompleja nave3;
    public NaveCompleja nave4;
    
    Jugador ()
    {
        nave1= new NaveUnitaria();
        nave2= new NaveCompleja ();
        nave3= new NaveCompleja ();
        nave4= new NaveCompleja();
    }
    
    
    
}
