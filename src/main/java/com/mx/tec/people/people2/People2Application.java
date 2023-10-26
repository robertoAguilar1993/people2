package com.mx.tec.people.people2;

//import io.swagger.v3.oas.models.Components;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class People2Application {

	public static void main(String[] args) {
		SpringApplication.run(People2Application.class, args);
	}

	/*@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.components(new Components())
				.info(new Info()
						.title("Billing API")
						.version("1.0.0"));
	}*/

}
