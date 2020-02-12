/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.algoritmos.atividade2;

/**
 *
 * @author Raul
 */
public class Ponto {
   /*
 * Trabalho Atividade 2
 * Integrantes:
 * @author Raul Sá Teles Barreto
 * @author Guilherme Augusto Pinheiro
 * Curso: Analise e desenvolvimento de sistemas 
 * Turma: Noturno - B
 */

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
   
   public double convertx(Ponto p){
       double px = p.x;
       return px;
   }
   public double converty(Ponto p){
       double py = p.y;
       return py;
   }
   public String imprime(Ponto p){
       int py = p.y;
       int px = p.x;
       return "("+px+","+py+")";
   }

}
