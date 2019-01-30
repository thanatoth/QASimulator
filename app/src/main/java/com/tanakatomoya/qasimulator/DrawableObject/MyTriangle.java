package com.tanakatomoya.qasimulator.DrawableObject;

import java.util.ArrayList;

public class MyTriangle {
    private int siteX;
    private int siteY;

    private MyPointF point1;
    private MyPointF point2;
    private MyPointF point3;
    private ArrayList<MyLine> includedLines = new ArrayList<>();
    private ArrayList<MyTriangle> nextTriangles = new ArrayList<>();

    private ArrayList<Integer> colorProperty = new ArrayList<>();


    public MyTriangle(MyPointF point1, MyPointF point2, MyPointF point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;

        MyLine line1 = new MyLine(point1, point2);
        MyLine line2 = new MyLine(point2, point3);
        MyLine line3 = new MyLine(point3, point1);

        includedLines.add(line1);
        includedLines.add(line2);
        includedLines.add(line3);

    }

    public MyTriangle(){}


    //calculate median point
    public MyPointF calcCenter(){
        MyPointF centerPoint = new MyPointF();

        centerPoint.setX((point1.getX() + point2.getX() + point3.getX()) / 3);
        centerPoint.setY((point1.getY() + point2.getY() + point3.getY()) / 3);

        return centerPoint;
    }

    /**
     * getter and setter
     * @return
     */


    public void setSiteX(int siteI) { this.siteX = siteX; }

    public void setSiteY(int siteJ) { this.siteY = siteY; }

    public int getSiteX() { return siteX; }

    public int getSiteY() { return siteY; }

    public MyPointF getPoint1() {
        return point1;
    }

    public MyPointF getPoint2() {
        return point2;
    }

    public MyPointF getPoint3() {
        return point3;
    }

    public ArrayList<MyTriangle> getNextTriangles() {
        return nextTriangles;
    }

    public ArrayList<MyLine> getIncludedLines() { return includedLines; }

    /*
    //judge if triangle include a line
    public boolean isExistLine(MyLine line){
        if((line.equals(this.line1) || line.equals(this.line2)) || line.equals(this.line3)){
            return true;
        }

        return false;
    }
    */

}