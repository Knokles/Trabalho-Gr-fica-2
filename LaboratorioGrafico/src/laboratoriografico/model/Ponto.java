package laboratoriografico.model;

/**
 *
 * @author Dionathan
 * @since 23/02/2018
 *
 */
public class Ponto {

    private double cordX;
    private double cordY;

    public Ponto() {
    }

    public Ponto(double cordX, double cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
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
    public String toString() {
        return ". (" + cordX + "," + cordY + ")";
    }

}
