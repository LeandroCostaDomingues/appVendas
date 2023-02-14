package com.com.LeandroCosta.appVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.com.LeandroCosta.appVendas.domain.ItemPedido;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
	
	// classe de acesso a dados 
	

}
