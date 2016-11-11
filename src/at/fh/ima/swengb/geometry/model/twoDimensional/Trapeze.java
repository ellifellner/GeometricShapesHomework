package at.fh.ima.swengb.geometry.model.twoDimensional;

/**
 * Created by Elli on 09.11.2016.
 */
public class Trapeze extends TwoDimensional{

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double height;

    public Trapeze(int x, int y,double sideA, double sideB, double sideC, double sideD, double height) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return (sideB+sideC)/2*height;
    }

    @Override
    public double calcPerimeter() {
        return sideA+sideB+sideC+sideD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Trapeze trapeze = (Trapeze) o;

        if (Double.compare(trapeze.sideA, sideA) != 0) return false;
        if (Double.compare(trapeze.sideB, sideB) != 0) return false;
        if (Double.compare(trapeze.sideC, sideC) != 0) return false;
        if (Double.compare(trapeze.sideD, sideD) != 0) return false;
        return Double.compare(trapeze.height, height) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideD);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Trapeze{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", sideD=" + sideD +
                ", height=" + height +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
