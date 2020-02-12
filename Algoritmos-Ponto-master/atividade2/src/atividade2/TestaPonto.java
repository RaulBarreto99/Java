/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * @author raul.stbarreto
 */
public class TestaPonto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ponto p1  = new Ponto(1,1);
        Ponto p2  = new Ponto(1,4);
        System.out.println(p1);
        System.out.println(p2);
        boolean igual = p1.igual(p2);
        System.out.println("igual? "+igual);
        double b = p1.distancia(p2);
        System.out.println("Distancia = "+b);
    }
    
}
