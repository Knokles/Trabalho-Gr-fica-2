package laboratoriografico.model;

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

    public Poligono(String nome, Ponto inicio, Ponto fim) {
        this.arestas = new ArrayList();
        this.nome = nome;
        arestas.add(inicio);
        arestas.add(fim);
    }

    public void addAresta(Ponto ponto) {
        arestas.add(ponto);
    }

    @Override
    public void desenha(Graphics g) {
        for (int i = 1; i < arestas.size(); i++) {
            Linha linha = new Linha(arestas.get(i - 1), arestas.get(i));
            linha.desenha(g);
        }
        Linha linha = new Linha(arestas.get(arestas.size() - 1), arestas.get(0));
        linha.desenha(g);
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
