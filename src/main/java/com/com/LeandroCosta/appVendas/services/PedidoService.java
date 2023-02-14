package com.com.LeandroCosta.appVendas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.LeandroCosta.appVendas.domain.Pedido;
import com.com.LeandroCosta.appVendas.repositories.PedidoRepository;
import com.com.LeandroCosta.appVendas.services.exceptions.ObjectNotFoundException;

@Service // classe de serviço
public class PedidoService {
	@Autowired // dependecia
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}

}
