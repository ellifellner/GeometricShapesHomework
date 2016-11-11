package at.fh.ima.swengb.geometry;

import at.fh.ima.swengb.geometry.model.GeometricShape;
import at.fh.ima.swengb.geometry.model.threeDimensional.Cone;
import at.fh.ima.swengb.geometry.model.threeDimensional.Sphere;
import at.fh.ima.swengb.geometry.model.threeDimensional.SquarePyramid;
import at.fh.ima.swengb.geometry.model.threeDimensional.ThreeDimensional;
import at.fh.ima.swengb.geometry.model.twoDimensional.Diamond;
import at.fh.ima.swengb.geometry.model.twoDimensional.Circle;
import at.fh.ima.swengb.geometry.model.twoDimensional.Trapeze;
import at.fh.ima.swengb.geometry.model.twoDimensional.TwoDimensional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Elli on 09.11.2016.
 */

public class Main {

    private double sumVolume;
    private double sumSurface;
    private double sumArea;
    private double sumPerimeter;

    public static void main(String[] args) {
        Main main = new Main();
        main.doIt();
    }

    private void doIt() {

        List<TwoDimensional> twoDimList = new ArrayList<>();
        fillListTwoDim(twoDimList);
        printListTwoDim(twoDimList);

        List<ThreeDimensional> threeDimList = new ArrayList<>();
        fillListThreeDim(threeDimList);
        printListThreeDim(threeDimList);

    }


    public void fillListTwoDim(List<TwoDimensional> twoDimList) {
        twoDimList.add(new Circle(1,2,2.0));
        twoDimList.add(new Circle(4,2,3.0));
        twoDimList.add(new Circle(3,2,1.0));

        twoDimList.add(new Diamond(2,3,2.0,4.0,3.0));
        twoDimList.add(new Diamond(4,2,6.7,3.4,2.4));
        twoDimList.add(new Diamond(1,4,2.5,3.7,4.6));

        twoDimList.add(new Trapeze(1,3,5.0,2.0,4.5,3.4,6.0));
        twoDimList.add(new Trapeze(4,7,2.3,2.6,3.8,5.9,7.0));
        twoDimList.add(new Trapeze(5,6,4.6,7.0,5.6,7.5,9.0));
    }
    public void fillListThreeDim(List<ThreeDimensional> threeDimList) {
        threeDimList.add(new Sphere(3,4,2,5.0));
        threeDimList.add(new Sphere(1,5,3,9.0));
        threeDimList.add(new Sphere(1,3,5,2.0));

        threeDimList.add(new SquarePyramid(2,4,3,5.7,6.5,6.7));
        threeDimList.add(new SquarePyramid(1,3,4,3.2,4.4,6.7));
        threeDimList.add(new SquarePyramid(4,7,3,7.6,3.4,2.6));

        threeDimList.add(new Cone(2,3,4,5.6,7.8,4.3));
        threeDimList.add(new Cone(1,4,3,5.6,2.3,6.5));
        threeDimList.add(new Cone(5,6,4,2.3,8.7,2.3));
    }


    public void printListTwoDim(List<TwoDimensional> twoDimList) {

        System.out.println("------------- List of Two Dimensional Shapes -------------");
        twoDimList.stream().forEach(System.out ::println);

        System.out.println("\n------------- Sum of all Areas -------------");
        for (TwoDimensional shape : twoDimList) {
            sumArea = sumArea + shape.calcArea();
        }
        System.out.println(sumArea);

        System.out.println("\n------------- Sum of all Perimeters -------------");
        for (TwoDimensional shape : twoDimList) {
            sumPerimeter = sumPerimeter + shape.calcPerimeter();
        }
        System.out.println(sumPerimeter);
    }

    public void printListThreeDim(List<ThreeDimensional> threeDimList) {

        System.out.println("\n------------- List of Three Dimensional Shapes -------------");
        threeDimList.stream().forEach(System.out ::println);

        System.out.println("\n------------- Sum of all Volumes -------------");
        for (ThreeDimensional shape : threeDimList) {
            sumVolume = sumVolume + shape.calcVolume();
        }
        System.out.println(sumVolume);

        System.out.println("\n------------- Sum of all Surfaces -------------");
        for (ThreeDimensional shape : threeDimList) {
            sumSurface = sumSurface + shape.calcSurface();
        }
        System.out.println(sumSurface);



    }

}