package laboratoriografico.model;

import java.awt.Graphics;

/**
 *
 * @author Dionathan
 * @since 23/02/2018
 *
 */
public class Linha extends Forma {

    private String nome;
    private Ponto inicio;
    private Ponto fim;

    public Linha() {
    }

    public Linha(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Linha(String nome, Ponto inicio, Ponto fim) {
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    @Override
    public void desenha(Graphics g, ViewPort vp) {
        g.drawLine(vp.convertX(inicio.getCordX()), vp.convertY(inicio.getCordY()), vp.convertX(fim.getCordX()), vp.convertY(fim.getCordY()));
    }

    @Override
    public String toString() {
        return "/ " + nome + " [ (" + inicio.getCordX() + "," + inicio.getCordX() + ") (" + fim.getCordX() + "," + fim.getCordY() + " ]";
    }
}
