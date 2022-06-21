public class Main {

    public static void main(String[] args) {
        var circle1 = new Circle(15.12);
        System.out.println("Radius: " + circle1.getRadius() + " cm");
        System.out.println("Durchmesser: " + circle1.getDiameter() + " cm");
        System.out.println("Umfang: " + circle1.getExtent() + " cm");
        System.out.println("Flaeche: " + circle1.getArea() + " cm^2");
    }
}
