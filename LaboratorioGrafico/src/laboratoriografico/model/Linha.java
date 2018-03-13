package laboratoriografico.model;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Dionathan
 * @since 23/02/2018
 *
 */
public class Linha {

    private Color cor;
    private Ponto inicio;
    private Ponto fim;

    public Linha() {
    }

    public Linha(Ponto inicio, Ponto fim, Color cor) {
        this.inicio = inicio;
        this.fim = fim;
        this.cor = cor;
    }

    public Ponto getInicio() {
        return inicio;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public Ponto getFim() {
        return fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    public void desenha(Graphics g, ViewPort vp) {
        g.setColor(cor);
        g.drawLine(vp.convertX(inicio.getCordX()), vp.convertY(inicio.getCordY()), vp.convertX(fim.getCordX()), vp.convertY(fim.getCordY()));
    }
}
