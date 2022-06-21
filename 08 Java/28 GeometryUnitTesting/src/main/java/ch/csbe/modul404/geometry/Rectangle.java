package ch.csbe.modul404.geometry;

public class Rectangle {

    public double calculateExtent(double length, double width) {
        return 2 * length + 2 * width;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }
}
