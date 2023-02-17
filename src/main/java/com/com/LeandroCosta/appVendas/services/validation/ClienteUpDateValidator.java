package com.com.LeandroCosta.appVendas.services.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.com.LeandroCosta.appVendas.domain.Cliente;
import com.com.LeandroCosta.appVendas.dto.ClienteDTO;
import com.com.LeandroCosta.appVendas.repositories.ClienteRepository;
import com.com.LeandroCosta.appVendas.resources.exception.FieldMessage;

public class ClienteUpDateValidator implements ConstraintValidator<ClienteUpdate, ClienteDTO> {
	@Autowired
	private ClienteRepository repo;
	@Autowired
	private HttpServletRequest request; // para pegar uri do id no json

	@Override
	public void initialize(ClienteUpdate ann) {
	}

	@Override
	public boolean isValid(ClienteDTO objDto, ConstraintValidatorContext context) {
		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>) request
				.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE); // para pegar uri do json
		Integer uriId=Integer.parseInt(map.get("id"));

		List<FieldMessage> list = new ArrayList<>();
		Cliente aux = repo.findByEmail(objDto.getEmail());
		if (aux != null&& !aux.getId().equals(uriId)) {
			list.add(new FieldMessage("email", "Email Já Cadastrado"));
		}
		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getNome())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}
