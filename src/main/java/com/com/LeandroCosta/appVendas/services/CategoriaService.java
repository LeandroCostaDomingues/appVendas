package com.com.LeandroCosta.appVendas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.LeandroCosta.appVendas.domain.Categoria;
import com.com.LeandroCosta.appVendas.repositories.CategoriaRepository;
import com.com.LeandroCosta.appVendas.services.exceptions.ObjectNotFoundException;

@Service // classe de serviço
public class CategoriaService {
	@Autowired // dependecia
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);

	}
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
		
	}

}
