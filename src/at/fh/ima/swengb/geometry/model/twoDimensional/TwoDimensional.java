package at.fh.ima.swengb.geometry.model.twoDimensional;

import at.fh.ima.swengb.geometry.model.GeometricShape;

/**
 * Created by Elli on 09.11.2016.
 */
public abstract class TwoDimensional extends GeometricShape {

    protected int x;
    protected int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TwoDimensional that = (TwoDimensional) o;

        if (x != that.x) return false;
        return y == that.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
