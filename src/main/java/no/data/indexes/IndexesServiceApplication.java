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
			repository.save(new Index(1,0, "Region1",20.0));
			repository.save(new Index(2,0, "Region2", 80.0));
			repository.save(new Index(1,0, "Distrito1",25.0));
			repository.save(new Index(2,0, "Distrito2", 25.0));
			repository.save(new Index(1,0, "Distrito3",25.0));
			repository.save(new Index(2,0, "Distrito4", 25.0));
		};
	}

}
