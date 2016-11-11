package at.fh.ima.swengb.geometry.model.threeDimensional;

/**
 * Created by Elli on 09.11.2016.
 */
public class Cone extends ThreeDimensional{

    private double height;
    private double radius;
    private double side;

    public Cone(int x, int y, int z, double height, double radius, double side) {
        this.x=x;
        this.y=y;
        this.z=z;
        this.height = height;
        this.radius = radius;
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calcVolume() {
        return 1.0/3.0*Math.PI*radius*radius*height;
    }

    @Override
    public double calcSurface() {
        return Math.PI*radius*(radius+side);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cone cone = (Cone) o;

        if (Double.compare(cone.height, height) != 0) return false;
        return Double.compare(cone.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "height=" + height +
                ", radius=" + radius +
                ", side=" + side +
                ", volume=" + calcVolume() +
                ", surface=" + calcSurface() +
                '}';
    }
}
