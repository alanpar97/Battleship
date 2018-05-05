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
public class Tablero {
    
    public int[][] lugares;
    
    public Tablero(int[][] lugares){
        this.lugares = lugares;
    }
    
    public Tablero(){
        this.lugares = new int[8][8];
        for (int i = 0;i <8; i++){
            for (int j=0;j<8; j++)
                this.lugares[i][j] = 0;
        }
    }
    
    
}
