package laboratoriografico.model;

/**
 *
 * @author Dionathan Luan de Vargas
 * @since 09/03/2018
 */
public class ViewPort {

    private int zoom;
    private int desX;
    private int desY;
    private double Xvpmin;
    private double Xvpmax;
    private double Yvpmin;
    private double Yvpmax;
    private final Mundo mundo;

    public ViewPort(Mundo mundo) {
        zoom = 1;
        desX = 0;
        desY = 0;
        Xvpmin = 0;
        Xvpmax = 500;
        Yvpmin = 0;
        Yvpmax = 500;
        this.mundo = mundo;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        if (zoom > 1) {
            this.zoom = zoom;
        }
    }

    public int getDesX() {
        return desX;
    }

    public void setDesX(int desX) {
        this.desX = desX;
    }

    public int getDesY() {
        return desY;
    }

    public void setDesY(int desY) {
        this.desY = desY;
    }

    public double getXvpmin() {
        return Xvpmin;
    }

    public void setXvpmin(double Xvpmin) {
        this.Xvpmin = Xvpmin;
    }

    public double getXvpmax() {
        return Xvpmax;
    }

    public void setXvpmax(double Xvpmax) {
        this.Xvpmax = Xvpmax;
    }

    public double getYvpmin() {
        return Yvpmin;
    }

    public void setYvpmin(double Yvpmin) {
        this.Yvpmin = Yvpmin;
    }

    public double getYvpmax() {
        return Yvpmax;
    }

    public void setYvpmax(double Yvpmax) {
        this.Yvpmax = Yvpmax;
    }

    public int convertX(double cordX) {
        double Xvp = Xvpmin
                + ((cordX - ((mundo.getXwmin() / zoom) + desX))
                / (((mundo.getXwmax() / zoom) + desX) - ((mundo.getXwmin() / zoom) + desX))
                * (Xvpmax - Xvpmin));
        return (int) Xvp;
    }

    public int convertY(double cordY) {
        double Yvp = Yvpmax
                - ((cordY - ((mundo.getYwmin() / zoom) + desY))
                / (((mundo.getYwmax() / zoom) + desY) - ((mundo.getYwmin() / zoom) + desY))
                * (Yvpmax - Yvpmin));
        return (int) Yvp;
    }
}
