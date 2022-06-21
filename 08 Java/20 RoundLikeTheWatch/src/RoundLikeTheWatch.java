import java.time.ZoneId;
import java.time.ZonedDateTime;

public class RoundLikeTheWatch {

    public static void main(String[] args) {
        var zoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneID : zoneIds) {
            ZoneId zoneId = ZoneId.of(zoneID);
            System.out.println(ZonedDateTime.now(zoneId));
        }
    }
}
