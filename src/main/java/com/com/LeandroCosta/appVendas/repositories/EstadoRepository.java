package com.com.LeandroCosta.appVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.com.LeandroCosta.appVendas.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

	// classe de acesso a dados

}
