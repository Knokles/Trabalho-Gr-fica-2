/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriografico.model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dionathan
 * @since 13/03/2018
 *
 */
public class Forma {

    private String nome;
    private List<Ponto> arestas;
    private Color cor;
    boolean poligono;

    public Forma(String nome, Ponto ponto, Color cor, boolean poligono) {
        arestas = new ArrayList<>();

        this.nome = nome;
        this.cor = cor;
        this.arestas.add(ponto);
        this.poligono = poligono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ponto> getArestas() {
        return arestas;
    }

    public void setArestas(List<Ponto> arestas) {
        this.arestas = arestas;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public boolean isPoligono() {
        return poligono;
    }

    public void setPoligono(boolean poligono) {
        this.poligono = poligono;
    }

    public void addAresta(Ponto ponto) {
        arestas.add(ponto);
    }

    public void desenha(Graphics g, ViewPort vp) {
        if (arestas.size() > 1) {
            for (int i = 1; i < arestas.size(); i++) {
                Linha linha = new Linha(arestas.get(i - 1), arestas.get(i), cor);
                linha.desenha(g, vp);
            }
            if (poligono) {
                Linha linha = new Linha(arestas.get(arestas.size() - 1), arestas.get(0), cor);
                linha.desenha(g, vp);
            }
        } else {
            Linha ponto = new Linha(arestas.get(0), arestas.get(0), cor);
            ponto.desenha(g, vp);
        }
    }

    @Override
    public String toString() {
        String retorno = "";
        switch (arestas.size()) {
            case 1:
                retorno += ". ";
                break;
            case 2:
                retorno += "/ ";
                break;
            default:
                if (poligono) {
                    retorno += "Δ ";
                } else {
                    retorno += "/\\/ ";
                }
        }
        retorno += nome + " [ ";
        for (Ponto p : arestas) {
            retorno += " (" + p.getCordX() + "," + p.getCordY() + ")";
        }
        retorno += "]";
        return retorno;
    }

}
