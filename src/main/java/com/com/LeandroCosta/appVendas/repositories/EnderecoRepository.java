package com.com.LeandroCosta.appVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.com.LeandroCosta.appVendas.domain.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

	// classe de acesso a dados

}
