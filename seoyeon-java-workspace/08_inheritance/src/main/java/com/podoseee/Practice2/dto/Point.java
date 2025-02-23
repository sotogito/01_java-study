package com.podoseee.Practice2.dto;

public class Point {

    private static int x;
    private static int y;

    public Point(){}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y;
    }

    public void draw(){
        System.out.println("x좌표 : " + getX() + "y좌표 : " + getY());
    }
}
