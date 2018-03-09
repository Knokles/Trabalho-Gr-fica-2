package laboratoriografico.model;

/**
 *
 * @author Dionathan Luan de Vargas
 * @since 09/03/2018
 */
public class Mundo {

    private double Xwmin;
    private double Xwmax;
    private double Ywmin;
    private double Ywmax;

    public Mundo(double Xwmin, double Xwmax, double Ywmin, double Ywmax) {
        this.Xwmin = Xwmin;
        this.Xwmax = Xwmax;
        this.Ywmin = Ywmin;
        this.Ywmax = Ywmax;
    }

    public double getXwmin() {
        return Xwmin;
    }

    public void setXwmin(double Xwmin) {
        this.Xwmin = Xwmin;
    }

    public double getXwmax() {
        return Xwmax;
    }

    public void setXwmax(double Xwmax) {
        this.Xwmax = Xwmax;
    }

    public double getYwmin() {
        return Ywmin;
    }

    public void setYwmin(double Ywmin) {
        this.Ywmin = Ywmin;
    }

    public double getYwmax() {
        return Ywmax;
    }

    public void setYwmax(double Ywmax) {
        this.Ywmax = Ywmax;
    }
}
