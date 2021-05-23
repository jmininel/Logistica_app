package com.algaworks.logistica.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.logistica.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
	 var cliente1 = new Cliente();
		 cliente1.setId(1L);
		 cliente1.setNome("John Dwane");
		 cliente1.setTelefone("9999-9999");
		 cliente1.setEmail("john@hotmail.com");
		 
		 var cliente2 = new Cliente();
		 cliente2.setId(1L);
		 cliente2.setNome("Jane Winter");
		 cliente2.setTelefone("9999-9999");
		 cliente2.setEmail("jane@hotmail.com");
		
		
		return Arrays.asList(cliente1, cliente2);
	}

}
