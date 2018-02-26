package laboratoriografico.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;
import laboratoriografico.model.Forma;

/**
 *
 * @author Dionathan
 * @since 26/02/2018
 *
 */
public class JDesenho extends JPanel {

    List<Forma> formas;

    public JDesenho(List<Forma> formas) {
        this.formas = formas;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.yellow);
        g.drawLine(0, 250, 500, 250);
        g.drawLine(250, 0, 250, 500);
        g.setColor(Color.black);
        for (Forma f : formas) {
            f.desenha(g);
        }
    }
}
