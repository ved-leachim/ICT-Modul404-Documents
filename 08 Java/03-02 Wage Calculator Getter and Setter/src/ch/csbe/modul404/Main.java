package ch.csbe.modul404;

public class Main {
    public static void main(String[] args) {
        var wageObj = new Employee();
        wageObj.setBaseSalary(7000);
        wageObj.setExtraHours(10);
        System.out.println("Benutzer x hat " + wageObj.getExtraHours() + "h Überzeit.");
        int wage = wageObj.calculateWage();
        System.out.println(wage);
    }
}
