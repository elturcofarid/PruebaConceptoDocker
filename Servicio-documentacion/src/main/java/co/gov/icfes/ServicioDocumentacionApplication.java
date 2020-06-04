package co.gov.icfes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableScheduling
public class ServicioDocumentacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioDocumentacionApplication.class, args);
	}
}
