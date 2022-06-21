import java.time.*;

public class TodayInTwoWeeks {

    public static void main (String[] main) {
        var timeStamp = LocalDateTime.now();
        var today = LocalDate.now();
        var todayInTwoWeeks = today.plusDays(14);
        System.out.println("Zeitstempel: " + timeStamp);
        System.out.println("Datum von heute " + today);
        System.out.println("Datum in zwei Wochen: " + todayInTwoWeeks);
    }
}
