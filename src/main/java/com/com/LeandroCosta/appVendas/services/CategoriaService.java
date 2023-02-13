package com.com.LeandroCosta.appVendas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.LeandroCosta.appVendas.domain.Categoria;
import com.com.LeandroCosta.appVendas.repositories.CategoriaRepository;

@Service   // classe de serviço 
public class CategoriaService {
	@Autowired // dependecia
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
