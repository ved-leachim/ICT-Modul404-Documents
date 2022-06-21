package ch.csbe.modul404;

public class Employee {
    private int baseSalary;
    private int extraHours;
    private int balanceRate = 30;

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("BaseSalary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    public void setExtraHours(int extraHours) {
        if (extraHours < 0)
            throw new IllegalArgumentException("ExtraHours cannot be less than 0.");
        this.extraHours = extraHours;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public int calculateWage() {
        return baseSalary + (extraHours * balanceRate);
    }
}
