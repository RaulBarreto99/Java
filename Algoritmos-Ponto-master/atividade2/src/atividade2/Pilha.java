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
public class Pilha {
    private char elementos[];
    private int topo;
    
    public Pilha(int n){
        elementos = new char[n];
        topo = -1;
    }
    
    public boolean isEmpty(){
        return topo == -1;
    }
    
    public boolean isFull(){
        return topo == elementos.length -1;
    }
    
    public void push(char e){
        if(!isFull()){
        topo++;
        elementos[topo] = e;
        }
    }
    
    public char pop(){
        char e = elementos[topo];
        topo--;
        return e;
    }
}
