package ch.csbe.modul404;

public class Main {
    public static void main(String[] args) {
        int baseSalary = 7000;
        int extraHours = 10;
        int balanceRate = 30;

        int wage = calculateWage(baseSalary, extraHours, balanceRate);
        System.out.println(wage);
    }

    public static int calculateWage(int baseSalery, int extraHours, int balanceRate) {
        return baseSalery + (extraHours * balanceRate);
    }
}
