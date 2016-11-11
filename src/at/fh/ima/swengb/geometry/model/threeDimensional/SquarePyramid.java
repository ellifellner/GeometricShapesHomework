package at.fh.ima.swengb.geometry.model.threeDimensional;

/**
 * Created by Elli on 09.11.2016.
 */
public class SquarePyramid extends ThreeDimensional{

    private double sideA;
    private double height;
    private double heightA;

    public SquarePyramid(int x, int y, int z, double sideA, double height,double heightA) {
        this.x=x;
        this.y=y;
        this.z=z;
        this.sideA = sideA;
        this.height = height;
        this.heightA = heightA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeightA() {
        return heightA;
    }

    public void setHeightA(double heightA) {
        this.heightA = heightA;
    }

    @Override
    public double calcVolume() {
        return 1.0/3.0*sideA*sideA*height;
    }

    @Override
    public double calcSurface() {
        return sideA*sideA+2*sideA*heightA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SquarePyramid that = (SquarePyramid) o;

        if (Double.compare(that.sideA, sideA) != 0) return false;
        return Double.compare(that.height, height) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                "sideA=" + sideA +
                ", height=" + height +
                ", heightA=" + heightA +
                ", volume=" + calcVolume()+
                ", surface=" + calcSurface() +
                '}';
    }
}
