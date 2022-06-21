import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double widht = inputNumber(scanner, "Please insert the width: ");
        double length = inputNumber(scanner, "Please insert the length: ");
        scanner.close();

        double extent = (length + widht) * 2;
        double area = length * widht;
        System.out.printf("Extent:  %.2f\n", extent);
        System.out.printf("Area: %.2f\n", area);
    }

    public static double inputNumber (Scanner scr, String msg) {
        String input;
        double result = 0;
        boolean hasFinished = false;
        var numberFormat = NumberFormat.getInstance(Locale.GERMAN);
        System.out.println(msg);
        do {
            input = scr.nextLine();
            try {
                result = numberFormat.parse(input).doubleValue();
                hasFinished = true;
            } catch (ParseException exception) {
                System.out.println("This is not a valid number.");
                System.out.println("Please try it again: ");
            }
        } while (!hasFinished);
        return result;
    }
}
