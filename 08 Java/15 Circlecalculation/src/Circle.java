public class Circle {
    private double radius;
    private double diameter;
    private double extent;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        calculateDiameter();
        calculateExtend();
        calculateArea();
    }

    private void calculateDiameter() {
        this.diameter = 2 * radius;
    }

    private void calculateExtend() {
        this.extent = diameter * Math.PI;
    }

    private void calculateArea() {
        this.area = radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getExtent() {
        return extent;
    }

    public double getArea() {
        return area;
    }
}
