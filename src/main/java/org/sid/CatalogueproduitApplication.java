package org.sid;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;
import org.sid.entities.Category;
import org.sid.entities.Product;
import org.sid.dao.CategoryRepository;
import org.sid.dao.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;




@SpringBootApplication
public class CatalogueproduitApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogueproduitApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CategoryRepository categoryRepository ,ProductRepository produitRepository) {
		
		ArrayList<Product> arry = new ArrayList<>();
		//Category cat = new Category("c","ord",arry);
		//categoryRepository.save(cat);
		
		//Product prdt = new Product(null,"moussa",23456,"C");
		
		 categoryRepository.deleteAll();
		return args-> {
			Stream.of("ordinateur","category").forEach(c->{
				categoryRepository.save( new Category("C",c,arry));		
			});
			
			categoryRepository.findAll().forEach(System.out::println);
		};
		
	}
}
