package at.fh.ima.swengb.geometry.model.twoDimensional;

/**
 * Created by Elli on 09.11.2016.
 */
public class Diamond extends TwoDimensional{

    private double sideA;
    private double diagonalF;
    private double diagonalE;


    public Diamond() {
    }

    public Diamond(int x, int y,double sideA, double diagonalE, double diagonalF) {

        this.x=x;
        this.y=y;
        this.sideA = sideA;
        this.diagonalE = diagonalE;
        this.diagonalF = diagonalF;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getDiagonalF() {
        return diagonalF;
    }

    public void setDiagonalF(double diagonalF) {
        this.diagonalF = diagonalF;
    }

    public double getDiagonalE() {
        return diagonalE;
    }

    public void setDiagonalE(double diagonalE) {
        this.diagonalE = diagonalE;
    }

    @Override
    public double calcArea() {
        return diagonalE*diagonalF/2;
    }

    @Override
    public double calcPerimeter() {
        return 4*sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Diamond diamond = (Diamond) o;

        if (Double.compare(diamond.sideA, sideA) != 0) return false;
        if (Double.compare(diamond.diagonalF, diagonalF) != 0) return false;
        return Double.compare(diamond.diagonalE, diagonalE) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(diagonalF);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(diagonalE);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Diamond{" +
                "sideA=" + sideA +
                ", diagonalF=" + diagonalF +
                ", diagonalE=" + diagonalE +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
