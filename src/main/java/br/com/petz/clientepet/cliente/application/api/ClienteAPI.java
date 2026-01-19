package br.com.petz.clientepet.cliente.application.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {
	
	ClienteResponse postCliente(ClienteRequest clienteRequest);
}
