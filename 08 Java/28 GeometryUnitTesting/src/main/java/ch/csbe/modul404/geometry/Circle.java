package ch.csbe.modul404.geometry;

import java.text.DecimalFormat;

public class Circle {

    DecimalFormat decimalFormat = new DecimalFormat("##.0000");
    public double calculateExtend(double r) {
        return Double.parseDouble(decimalFormat.format((2 * r) * Math.PI));
    }

    public double calculateArea(double r) {
        return Double.parseDouble(decimalFormat.format(Math.pow(r, 2) * Math.PI));
    }

    public double calculateRadius(double area, double extent) {
        if (area + extent == 0 || area < 0 || extent < 0)
            throw new IllegalArgumentException("Area and extent cannot be null or negativ.");

        if (area != 0) {
            return Double.parseDouble(decimalFormat.format(Math.sqrt(area / Math.PI)));
        }
        else
        {
            return Double.parseDouble(decimalFormat.format((extent / Math.PI) / 2));
        }
    }
}
