package laboratoriografico.model;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Dionathan
 * @since 23/02/2018
 *
 */
public class Ponto extends Forma {

    private String nome;
    private double cordX;
    private double cordY;
    private Color cor;

    public Ponto() {
    }

    public Ponto(double cordX, double cordY, Color cor) {
        this.cordX = cordX;
        this.cordY = cordY;
        this.cor = cor;
    }

    public Ponto(String nome, double cordX, double cordY, Color cor) {
        this.nome = nome;
        this.cordX = cordX;
        this.cordY = cordY;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCordX() {
        return cordX;
    }

    public void setCordX(double cordX) {
        this.cordX = cordX;
    }

    public double getCordY() {
        return cordY;
    }

    public void setCordY(double cordY) {
        this.cordY = cordY;
    }

    @Override
    public void desenha(Graphics g, ViewPort vp) {
        g.setColor(cor);
        g.drawLine(vp.convertX(cordX), vp.convertY(cordY), vp.convertX(cordX), vp.convertY(cordY));
    }

    @Override
    public String toString() {
        return ". " + nome + " (" + cordX + "," + cordY + ")";
    }

}
