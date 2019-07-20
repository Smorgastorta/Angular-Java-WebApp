package it.formarete.tss.ProvaHibernate.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import it.formarete.tss.ProvaHibernate.controllers.VisitatoreController;
import it.formarete.tss.ProvaHibernate.database.VisitatoreService;

@Configuration
@EnableWebMvc
@SpringBootApplication
public class Application {
	@Bean
	public VisitatoreService visitatoreService() {
		return new VisitatoreService();
	}

	@Bean
	public VisitatoreController visitatoreController() {
		return new VisitatoreController();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
