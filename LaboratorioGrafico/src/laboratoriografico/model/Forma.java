package laboratoriografico.model;

import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;

/**
 *
 * @author Dionathan
 * @since 13/03/2018
 *
 */
public class Forma {

    private String nome;
    private Matriz arestas;
    private Color cor;
    boolean poligono;
    DecimalFormat df = new DecimalFormat("#0.00");

    public Forma(String nome, Ponto ponto, Color cor, boolean poligono) {
        arestas = new Matriz(1, 3, 0.0);

        this.nome = nome;
        this.cor = cor;
        this.arestas.setValor(1, 1, ponto.getCordX());
        this.arestas.setValor(1, 2, ponto.getCordY());
        this.arestas.setValor(1, 3, ponto.getCordZ());
        this.poligono = poligono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Matriz getArestas() {
        return arestas;
    }

    public void setArestas(Matriz arestas) {
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

    public double getPontoMedioX() {
        double pontoMedioX = 0;
        for (int i = 1; i <= arestas.getLinhas(); i++) {
            pontoMedioX += arestas.getValor(i, 1);
        }
        return pontoMedioX / arestas.getLinhas();
    }

    public double getPontoMedioY() {
        double pontoMedioY = 0;
        for (int i = 1; i <= arestas.getLinhas(); i++) {
            pontoMedioY += arestas.getValor(i, 2);
        }
        return pontoMedioY / arestas.getLinhas();
    }

    public double getPontoMedioZ() {
        double pontoMedioZ = 0;
        for (int i = 1; i <= arestas.getLinhas(); i++) {
            pontoMedioZ += arestas.getValor(i, 3);
        }
        return pontoMedioZ / arestas.getLinhas();
    }

    public void addAresta(Ponto ponto) {
        arestas.addLinha(0.0);
        arestas.setValor(arestas.getLinhas(), 1, ponto.getCordX());
        arestas.setValor(arestas.getLinhas(), 2, ponto.getCordY());
        arestas.setValor(arestas.getLinhas(), 3, ponto.getCordZ());
    }

    public void desenha(Graphics g, ViewPort vp) {
        if (arestas.getLinhas() > 1) {
            for (int i = 1; i < arestas.getLinhas(); i++) {
                Ponto pInicial = new Ponto(arestas.getValor(i, 1),
                        arestas.getValor(i, 2),
                        arestas.getValor(i, 3));
                Ponto pFinal = new Ponto(arestas.getValor(i + 1, 1),
                        arestas.getValor(i + 1, 2),
                        arestas.getValor(i + 1, 3));
                Linha linha = new Linha(pInicial, pFinal, cor);
                linha.desenha(g, vp);
            }
            if (poligono) {
                Ponto pInicial = new Ponto(arestas.getValor(arestas.getLinhas(), 1),
                        arestas.getValor(arestas.getLinhas(), 2),
                        arestas.getValor(arestas.getLinhas(), 3));
                Ponto pFinal = new Ponto(arestas.getValor(1, 1),
                        arestas.getValor(1, 2),
                        arestas.getValor(1, 3));
                Linha linha = new Linha(pFinal, pInicial, cor);
                linha.desenha(g, vp);
            }
        } else {
            Ponto p = new Ponto(arestas.getValor(1, 1),
                    arestas.getValor(1, 2),
                    arestas.getValor(1, 3));
            Linha ponto = new Linha(p, p, cor);
            ponto.desenha(g, vp);
        }
    }

    @Override
    public String toString() {
        String retorno = "";
        switch (arestas.getLinhas()) {
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
        for (int i = 1; i <= arestas.getLinhas(); i++) {
            Ponto p = new Ponto(arestas.getValor(i, 1),
                    arestas.getValor(i, 2),
                    arestas.getValor(i, 3));
            retorno += " (" + df.format(p.getCordX()) + " ; " + df.format(p.getCordY()) + " ; " + df.format(p.getCordZ()) + ")";
        }
        retorno += "]";
        return retorno;
    }
}
