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
public class TestaPilha {
    public static void main(String[] args) {
        Pilha p = new Pilha(10);
        p.push('a');
        p.push('b');
        p.push('c');
        while(!p.isEmpty()){
            char e = p.pop();
            System.out.println(e + " ");
        }
    }
}
