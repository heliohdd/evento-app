package com.heliohdd.eventoapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.heliohdd.eventoapp.model.Evento;
import com.heliohdd.eventoapp.repository.EventoRepository;

@SpringBootApplication
public class EventoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoappApplication.class, args);
	}

//	 @Bean
//	  public CommandLineRunner demo(EventoRepository repository) {
//	    return (args) -> {
//	      // save a few customers
//	      repository.save(new Evento(null, "Teste", "Local", "hoje", "agora"));
//	      repository.save(new Evento(null, "Testando", "Localidade", "hojendo", "agorando"));
//	      repository.save(new Evento(null, "Testudo", "Localizado", "amanhã", "depois"));
//	      repository.save(new Customer("Chloe", "O'Brian"));
//	      repository.save(new Customer("Kim", "Bauer"));
//	      repository.save(new Customer("David", "Palmer"));
//	      repository.save(new Customer("Michelle", "Dessler"));
//	    };
//	 }
	
}
