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
public class Nave {
    
    private int tamaño;
    private int vidas;
    
    Nave()
    {
        this.tamaño=1;
        this.vidas=1;
    }
    
    Nave(int tamaño, int vidas)
    {
        this.tamaño=tamaño;
        this.vidas=vidas;
    }
    
    public void removerVida()
    {
        this.vidas--;
    }
    
    public void barcoDestruido () 
    {
        this.vidas=0;
        this.tamaño=0;
        System.gc();
    }//creo que esta implementacion iria en la main class, o en una clase de acciones
    
    
    
}