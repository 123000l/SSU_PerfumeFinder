package PerfumeFinder.Test;

import java.util.logging.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class TestApplication {


	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);
		Logger logger = Logger.getLogger(TestApplication.class.getName());

		logger.info("Message 1");
	}


}
