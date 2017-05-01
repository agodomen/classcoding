package edu.muc.homework.exception;

public class CCircle extends CShape{
    private double radium;

    public double getRadium() {
        return radium;
    }

    public void setRadium(double radium) {
        this.radium = radium;
    }

    public CCircle(double radium) {
        this.radium = radium;
    }

    public double GetArea() {
        return 3.14 * radium * radium;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CCircle circle = new CCircle(6.30);
        System.out.println("圆的面积为：" + circle.GetArea());
    }

}
