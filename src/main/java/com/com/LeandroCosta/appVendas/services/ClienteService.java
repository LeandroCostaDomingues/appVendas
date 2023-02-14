package com.com.LeandroCosta.appVendas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.LeandroCosta.appVendas.domain.Cliente;
import com.com.LeandroCosta.appVendas.repositories.ClienteRepository;
import com.com.LeandroCosta.appVendas.services.exceptions.ObjectNotFoundException;

@Service // classe de serviço
public class ClienteService {
	@Autowired // dependecia
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
