/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.algoritmos.atividade2;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class AlgoritmosTrabalho {
 /*
 * Trabalho Atividade 2
 * Integrantes:
 * @author Raul Sá Teles Barreto
 * @author Guilherme Augusto Pinheiro
 * Curso: Analise e desenvolvimento de sistemas 
 * Turma: Noturno - B
 */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Ponto p;
        int x, y, posicao, retorno;

        System.out.print("Tamanho da lista: ");
        int tamanho = ent.nextInt();
        ListaPonto lista = new ListaPonto(tamanho);

        int resp = 0;
        while (resp != 7) {
            System.out.println("Digite o numero da operação que deseja fazer: \n"
                    + "1) Adicionar um elemento no final da coleção\n"
                    + "2) Adicionar um elemento em uma posição da coleção\n"
                    + "3} Retornar o índice da primeira ocorrência de um elemento especificado na coleção\n"
                    + "4) Remover um elemento em uma posição na coleção\n"
                    + "5) Calcular a distância dos dois pontos mais distantes na coleção\n"
                    + "6) Retornar uma coleção de pontos contido em uma circunferência\n"
                    + "7) Sair");
            System.out.println("..............");
            resp = ent.nextInt();

            switch (resp) {
                case 1:
                    System.out.print("Eixo X: ");
                    x = ent.nextInt();
                    System.out.print("Eixo Y: ");
                    y = ent.nextInt();
                    p = new Ponto(x, y);
                    lista.addLista(p);
                    lista.parada();
                    break;
                case 2:
                    System.out.print("Eixo X: ");
                    x = ent.nextInt();
                    System.out.print("Eixo Y: ");
                    y = ent.nextInt();
                    System.out.print("Posicao: ");
                    posicao = ent.nextInt();
                    p = new Ponto(x, y);
                    retorno = lista.addPosicao(p, posicao);
                    if (retorno == 0) {
                        System.out.println("Elemento adicionado na posicao " + posicao);
                    } else if (retorno == 1) {
                        System.out.println("Lista cheia! Elemento não adicionado");
                    } else {
                        System.out.println("O elemento naopode ser adicionado nessa posiçao, pois a posição anterior esta vazia!");
                    }
                    lista.parada();
                    break;
                case 3:
                    System.out.print("Eixo X do elemento: ");
                    x = ent.nextInt();
                    System.out.print("Eixo Y do elemento: ");
                    y = ent.nextInt();
                    p = new Ponto(x, y);
                    retorno = lista.busca(p);
                    if (retorno == -1) {
                        System.out.println("Esse elemento não se encontre na lista!");
                    }
                    lista.parada();
                    break;
                case 4:
                    System.out.print("Posicao: ");
                    posicao = ent.nextInt();
                    lista.removeLista(posicao);
                    System.out.println("Elemento removido na posicao " + posicao);
                    lista.parada();
                    break;
                case 5:
                    double dist = -1;
                    for (int i = 0; i <= lista.getValidos(); i++) {
                        for (int j = 1; j <= lista.getValidos(); j++) {
                            double a = lista.getPonto(i).distancia(lista.getPonto(j));
                            if (dist < a) {
                                dist = a;
                            }
                        }
                    }
                    System.out.println("A distancia dos pontos mais distantes é: " + dist);
                    lista.parada();
                    break;
                case 6:
                    lista.raio(tamanho);
                    lista.parada();
                    break;

            }
        }
    }
}
