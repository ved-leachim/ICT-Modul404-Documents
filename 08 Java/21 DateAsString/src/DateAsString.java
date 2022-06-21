import java.time.LocalDate;

public class DateAsString {

    public static void main (String[] args) {
        String date = "2022-06-04";
        System.out.println(date);
        System.out.println("Type of Date is: " + date.getClass().getName());
        LocalDate dateFormat = LocalDate.parse(date);
        System.out.println(dateFormat);
        System.out.println("Type of Date is: " + dateFormat.getClass().getName());
    }
}
