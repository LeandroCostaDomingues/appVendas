package com.com.LeandroCosta.appVendas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.com.LeandroCosta.appVendas.domain.Categoria;
import com.com.LeandroCosta.appVendas.repositories.CategoriaRepository;

@SpringBootApplication
public class AppVendasApplication implements CommandLineRunner {
	@ Autowired
private CategoriaRepository categoriaRepository;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(AppVendasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informatica ");
		Categoria cat2 = new Categoria(null, "Escritorio ");
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
		
		
	}

}
