
package ch.csbe.modul404;

public class Main {

    public static void main(String[] args) {
        var book1 = new LendedBook();
        book1.setDaysLate(40);
        book1.setAdditionalCostsPerWeek(5);

        int fees = book1.calculateFee();
        System.out.println(fees);
    }
}
