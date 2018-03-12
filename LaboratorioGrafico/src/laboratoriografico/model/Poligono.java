package laboratoriografico.model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dionathan
 * @since 24/02/2018
 *
 */
public class Poligono extends Forma {

    private String nome;
    private List<Ponto> arestas;
    private Color cor;

    public Poligono(String nome, Ponto inicio, Ponto fim, Color cor) {
        this.arestas = new ArrayList();
        this.nome = nome;
        this.cor = cor;
        arestas.add(inicio);
        arestas.add(fim);
    }

    public void addAresta(Ponto ponto) {
        arestas.add(ponto);
    }

    @Override
    public void desenha(Graphics g, ViewPort vp) {
        for (int i = 1; i < arestas.size(); i++) {
            Linha linha = new Linha(arestas.get(i - 1), arestas.get(i), cor);
            linha.desenha(g, vp);
        }
        Linha linha = new Linha(arestas.get(arestas.size() - 1), arestas.get(0), cor);
        linha.desenha(g, vp);
    }

    @Override
    public String toString() {
        String retorno = "Δ " + nome + " [ ";
        for (Ponto p : arestas) {
            retorno += " (" + p.getCordX() + "," + p.getCordY() + ")";
        }
        retorno += "]";
        return retorno;
    }
}
