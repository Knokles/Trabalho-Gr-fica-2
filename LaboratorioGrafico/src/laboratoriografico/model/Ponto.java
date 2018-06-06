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
    private double cordZ;

    public Ponto() {
    }

    public Ponto(double cordX, double cordY, double cordZ) {
        this.cordX = cordX;
        this.cordY = cordY;
        this.cordZ = cordZ;
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

    public double getCordZ() {
        return cordZ;
    }

    public void setCordZ(double cordZ) {
        this.cordZ = cordZ;
    }

    @Override
    public String toString() {
        return ". (" + cordX + "," + cordY + "," + cordZ + ")";
    }

}
