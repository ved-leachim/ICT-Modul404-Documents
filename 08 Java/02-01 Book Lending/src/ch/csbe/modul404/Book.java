package ch.csbe.modul404;

import java.text.DecimalFormat;

public class Book {
    int additionalCostsPerWeek = 5;
    int daysLate = 40;
    private static final DecimalFormat df = new DecimalFormat("0.0");

    public double calculateFees() {
        return Double.parseDouble(df.format(additionalCostsPerWeek * (daysLate / 7f)));
    }
}
