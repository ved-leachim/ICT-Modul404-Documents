package ch.csbe.modul404.geometry;

import java.text.DecimalFormat;

public class RectangularTriangle {
    DecimalFormat decimalFormat = new DecimalFormat("##.0000");

    public double calculateExtent(double a, double b, double c) {
        return a + b + c;
    }

    public double calculateArea(double g, double height) {
        return (g * height) / 2;
    }

    public double calculateGround(double area, double height) {
        return (2 * area) / height;
    }

    public double calculateHeight(double area, double ground) {
        return (2 * area) / ground;
    }

    public double calculateA(double b, double c) {
        return Double.parseDouble(decimalFormat.format(Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2))));
    }

    public double calculateB(double a, double c) {
        return Double.parseDouble(decimalFormat.format(Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2))));
    }

    public double calculateC(double a, double b) {
        return Double.parseDouble(decimalFormat.format(Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2))));
    }
}
