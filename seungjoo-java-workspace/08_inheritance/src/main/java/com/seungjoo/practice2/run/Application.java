package com.seungjoo.practice2.run;

import com.seungjoo.practice2.dto.Circle;
import com.seungjoo.practice2.dto.Rectangle;

public class Application {
    public static void main(String[] args) {

        Circle[] circle = new Circle[2];
        Rectangle[] rectangle = new Rectangle[2];
        circle[0] = new Circle(1,2,3);
        circle[1] = new Circle(3,3,4);

        rectangle[0] = new Rectangle(-1,-2,5,2);
        rectangle[1] = new Rectangle(-2,5,2,8);

        System.out.println("===circle===");
        for (Circle c : circle) {
            c.draw();
        }
        System.out.println("===rectangle===");
        for (Rectangle r : rectangle) {
            r.draw();
        }
    }
}
