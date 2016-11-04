package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

		//TODO: main() is missing
    public static void main(String[] args) {

        //with implementing a new instance of main I can access the other methods like fillList or printList
        Main main = new Main();
        main.doIt();
    }

    private void doIt() {

        List <GeometricShape> shapeList = new ArrayList<>();
        fillList(shapeList);
        printList(shapeList);

        List <Circle> circleList = new ArrayList<>();
        for (GeometricShape geometricShape : shapeList) {
            if (geometricShape instanceof Circle){
                circleList.add((Circle)geometricShape); //convert it to Circle and add itt to circleList
            }
        }

        System.out.println("----------- circles -----------");
        for (Circle circle : circleList) {
            System.out.println(circle);
        }
    }


    public void fillList(List<GeometricShape> shapeList) {

        shapeList.add(new Circle(1,2,2.0)); //Strg + d copies a single line and insert it
        shapeList.add(new Circle(3,1,1.0));

        shapeList.add(new RightTriangle(11,22,10.0,11.0));

        shapeList.add(new Rectangle(1,2,20.0,21.11));
    }


    public void printList(List<GeometricShape> shapeList) {

        //worst possibility to print out a list (fori)
        System.out.println("----------- for loop -----------");
        for (int pos = 0; pos < shapeList.size(); pos++) {
            System.out.println(shapeList.get(pos));
        }

        //way better (iter)
        System.out.println("----------- for each -----------");
        for (GeometricShape geometricShape : shapeList) {
            System.out.println(geometricShape);
        }

        //much more way better
        System.out.println("----------- stream1 -----------");
        shapeList
                .stream()
                .forEach(geometricShape -> System.out.println(geometricShape));

        System.out.println("----------- stream2 -----------");
        shapeList
                .stream()
                .forEach(System.out::println);

    }

}
