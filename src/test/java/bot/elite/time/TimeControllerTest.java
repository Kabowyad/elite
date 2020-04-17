package bot.elite.time;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

class TimeControllerTest {
    @Test
    public void test() {
        ZoneId zoneId = ZoneId.of("GMT+05:00");
        ZonedDateTime zdt = ZonedDateTime.now(zoneId);
        System.out.println(zdt.toString());
    }
}