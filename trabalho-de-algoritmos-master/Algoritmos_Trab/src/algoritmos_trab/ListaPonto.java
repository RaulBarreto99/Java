/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos_trab;

import java.util.Formatter;
import java.util.Locale;

/**
 *
 * @author Raul
 */
public class ListaPonto {

    private Ponto pontos[];
    private int validos;

    public ListaPonto(int n) {
        this.pontos = new Ponto[n];
        this.validos = -1;
    }

    public boolean isEmpty() {
        return validos == -1;
    }

    public boolean isFull() {
        return validos == pontos.length - 1;
    }

    public Ponto imprime() {
        Ponto ponto = pontos[validos];
        validos--;
        return ponto;
    }

    public void addLista(Ponto ponto) {
        if (!isFull()) {
            validos++;
            pontos[validos] = ponto;
            System.out.println("Elemento adicionado!");
        }
        else{
            System.out.println("Lista cheia!");
        }
    }

    public int addPosicao(Ponto ponto, int posicao) {
        int retorno;
        if (!isFull()) {
            if (pontos[posicao - 1] == null) {
                if (pontos[posicao] != null) {
                    for (int i = pontos.length - 1; i > posicao; i--) {
                        if (pontos[i - 1] != null) {
                            pontos[i] = pontos[i - 1];
                        }
                    }
                    pontos[posicao] = ponto;
                    validos++;
                    return retorno = 0;
                }
                pontos[posicao] = ponto;
                validos++;
                return retorno = 0;
            }
            return retorno = 2;
        }
        return retorno = 1;
    }

    public int busca(Ponto elemento) {
        for (int i = 0; i < pontos.length; i++) {
            if (pontos[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public void removeLista(int posicao) {
        pontos[posicao] = null;
        validos--;
        for (int i = 0; i < pontos.length; i++) {
            if (pontos[i] == null) {
                pontos[i] = pontos[i + 1];
            }
        }
    }
    
    public Ponto getPonto(int posicao){
        return pontos[posicao];
    }
    
    public int getValidos(){
        return validos;
    }
    
    public ListaPonto raio(double raio, Ponto p,int tamanho){
        
        ListaPonto lista = new ListaPonto(tamanho);
        return lista;
    }
    
}
