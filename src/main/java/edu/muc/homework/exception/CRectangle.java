package edu.muc.homework.exception;

public class CRectangle extends CShape {
    private double beneath;
    private double hight;

    public double getBeneath() {
        return beneath;
    }

    public void setBeneath(double beneath) {
        this.beneath = beneath;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public CRectangle(double beneath, double hight) {
        this.beneath = beneath;
        this.hight = hight;
    }

    public double GetArea() {
        return (beneath * hight) / 2;
    }

    public static void main(String[] args) {
        CRectangle rec = new CRectangle(6.88, 7.22);
        System.out.println("ֱ矩形的面积为：" + rec.GetArea());

    }

}
