package ch.csbe.modul404;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        var harryPotter = new Book();
        double fees = (harryPotter.calculateFees());

        System.out.println("The fees for the Book Harry Potter are CHF " + fees);
    }
}
