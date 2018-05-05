/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author Luis Oliva
 */
public class NaveCompleja extends NaveUnitaria {
        
        public Character orientacion;
        //este nuevo atributo solo lo tendran naves que sean de tamaño mayor a 1
        //servira para saber si el tamaño de desplegara horizontal o vertical
        //se indicara H=horizontal, V=vertical
        
        NaveCompleja()
        {
            this.orientacion=null;
            setTamaño(2); //estos metodos los hereda de la clase NaveUnitaria
            setVidas(2);
            setUbicacion(null);
        }
        
        NaveCompleja (Character orientacion, int tamaño, int vidas, Punto ubicacion)
        {
            this.orientacion=orientacion;
            setTamaño(tamaño);
            setVidas(vidas);
            setUbicacion(ubicacion);
        }
        
        public void setOrientacion(Character orientacion)
        {
            this.orientacion= orientacion;
        }
    
}
