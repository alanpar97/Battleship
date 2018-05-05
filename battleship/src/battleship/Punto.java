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
public class Punto {
    public int fila;
    public int columna;
    
    
    //clase para poder dar coordenadas de ubicacion y que sea atributo de la nave
    Punto ()
    {
        this.fila=0; //son simples numeros del 1-8
        this.columna=0; //en el juego las columnas son A-H
    }
    
    Punto (int columna, int fila)
    {
        this.fila=fila;
        this.columna=columna;
    }
}
