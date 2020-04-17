package bot.elite;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

@SpringBootTest
class EliteApplicationTests {

	@Test
	void contextLoads() {
		ZoneId zoneId = ZoneId.of("UTC+5");
		Instant instant1 = Clock.system(zoneId).instant();
		System.out.println(instant1);
	}

}
