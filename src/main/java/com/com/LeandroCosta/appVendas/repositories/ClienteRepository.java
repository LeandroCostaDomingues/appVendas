package com.com.LeandroCosta.appVendas.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.com.LeandroCosta.appVendas.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	// classe de acesso a dados 
	@Transactional(readOnly=true)
	Cliente findByEmail(String email);
 
}
