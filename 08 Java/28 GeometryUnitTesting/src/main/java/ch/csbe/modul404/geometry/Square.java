package ch.csbe.modul404.geometry;

public class Square {
    public double calculateExtent(double side) {
        return 4 * side;
    }

    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateSideLength(double area, double extend) {
        if (area + extend == 0 || area < 0 || extend < 0)
            throw new IllegalArgumentException("Area and extend cannot be null or negativ.");

        if (area != 0) {
            return Math.sqrt(area);
        }
        else
        {
            return extend / 4;
        }

    }


}
