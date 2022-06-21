package ch.csbe.modul404;

public class LendedBook {
    private int additionalCostsPerWeek;
    private int daysLate;

    public int calculateFee() {
        return additionalCostsPerWeek * (daysLate / 7);
    }

    public void setAdditionalCostsPerWeek(int additionalCostsPerWeek) {
        // Data validation
        if (additionalCostsPerWeek <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less!");
        this.additionalCostsPerWeek = additionalCostsPerWeek;
    }

    public void setDaysLate(int daysLate) {
        if (daysLate < 0)
            throw new IllegalArgumentException("daysLate cannot be less than 0");
        this.daysLate = daysLate;
    }

    public int getDaysLate() {
        return daysLate;
    }

    public int getAdditionalCostsPerWeek() {
        return additionalCostsPerWeek;
    }
}
