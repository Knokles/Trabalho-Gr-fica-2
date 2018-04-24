package laboratoriografico.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;
import laboratoriografico.model.Forma;
import laboratoriografico.model.ViewPort;

/**
 *
 * @author Dionathan
 * @since 26/02/2018
 *
 */
public class JDesenho extends JPanel {

    List<Forma> formas;
    ViewPort vp;

    public JDesenho(List<Forma> formas, ViewPort vp) {
        this.formas = formas;
        this.vp = vp;
    }

    public ViewPort getVp() {
        return vp;
    }

    public void setVp(ViewPort vp) {
        this.vp = vp;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 500, 500);

        for (Forma f : formas) {
            f.desenha(g, vp);
        }
    }
}
