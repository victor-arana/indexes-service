package no.data.indexes;

import no.data.indexes.dao.IndexRepository;
import no.data.indexes.model.Index;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins="http://localhost:4200")
public class IndexesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndexesServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner init(IndexRepository repository){
		return args -> {
			repository.save(new Index(1,"Region 1", 20.0));
			repository.save(new Index(2,"Region 2", 80.0));
		};
	}

}
