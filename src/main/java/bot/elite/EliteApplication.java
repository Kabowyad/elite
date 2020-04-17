package bot.elite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// TODO @EnableTransactionManagement ?

@SpringBootApplication
public class EliteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EliteApplication.class, args);
	}

}
