/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos_trab;

/**
 *
 * @author Raul
 */
public class Ponto {

    private int x, y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

   public double distancia(Ponto p) {
        double distX = Math.pow(p.x - this.x, 2);
        double distY = Math.pow(p.y - this.y, 2);
        return Math.sqrt(distX + distY);
    }

}
