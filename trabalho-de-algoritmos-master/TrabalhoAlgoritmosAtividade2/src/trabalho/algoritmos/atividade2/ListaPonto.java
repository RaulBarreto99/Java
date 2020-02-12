/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.algoritmos.atividade2;

import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class ListaPonto {
/*
 * Trabalho Atividade 2
 * Integrantes:
 * @author Raul Sá Teles Barreto
 * @author Guilherme Augusto Pinheiro
 * Curso: Analise e desenvolvimento de sistemas 
 * Turma: Noturno - B
 */
    
    Scanner ent = new Scanner(System.in);

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
        } else {
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

    public Ponto getPonto(int posicao) {
        return pontos[posicao];
    }

    public int getValidos() {
        return validos;
    }

    public void raio(int tamanho) {
        System.out.println("Centro");
        System.out.print("Eixo X: ");
        int x = ent.nextInt();
        System.out.print("Eixo Y: ");
        int y = ent.nextInt();
        Ponto p2 = new Ponto(x, y);

        System.out.print("Raio: ");
        int raio = ent.nextInt();

        double maiorx = x + raio;
        double menorx = x - raio;
        double maiory = y + raio;
        double menory = y - raio;

        ListaPonto lista2 = new ListaPonto(tamanho);

        for (int i = 0; i <= getValidos(); i++) {
            if (getPonto(i).convertx(getPonto(i)) <= maiorx) {
                if (getPonto(i).convertx(getPonto(i)) >= menorx) {
                    if (getPonto(i).converty(getPonto(i)) <= maiory) {
                        if (getPonto(i).converty(getPonto(i)) >= menory) {
                            lista2.addLista(getPonto(i));
                        }
                    }
                }
            }
        }
        System.out.println("<<< Pontos dentro do raio >>>");
        for (int j = 0; j <= lista2.getValidos(); j++) {
            System.out.println("ponto[" + j + "]: " + lista2.getPonto(j).imprime(lista2.getPonto(j)));
        }
    }

    public void parada() {
        System.out.println("Pressione qualquer tecla + ENTER para continuar");
        String parada = ent.next();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
