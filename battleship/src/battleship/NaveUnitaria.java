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
public class NaveUnitaria {
    
    private int tamaño;
    private int vidas;//mr parece que este atributo es redundante
    private Punto ubicacion; //este atributo es para tener las coordenadas de la nave
    
    NaveUnitaria()
    {
        this.tamaño=1;
        this.vidas=1;
        this.ubicacion=null;
    }

    NaveUnitaria(Punto ubicacion)
    {
        this.tamaño=1;
        this.vidas=1;
        this.ubicacion=ubicacion;
    }    
      
    public void setUbicacion (Punto ubicacion) 
    {
        this.ubicacion=ubicacion;
    }
    
    public void removerVida()
    {
        this.vidas--;
    }
    
    public void setTamaño(int tamaño)
    {
        this.tamaño=tamaño;
    }
    
    public int getTemaño()
    {
        return this.tamaño;
    }
    
    public void setVidas(int vidas)
    {
        this.vidas=vidas;
    }
    
    public int getVidas()
    {
        return this.vidas;
    }
    
    public void barcoDestruido () 
    {
        this.vidas=0;
        this.tamaño=0;
        System.gc(); //esto es el garbage collector
    }//creo que esta implementacion iria en la main class, o en una clase de acciones
}

