package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[finaliza] ClienteController - postCliente");
		return clienteCriado;
	}

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[inicia] ClienteController - getTodosCliente");
		List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
		log.info("[finaliza] ClienteController - getTodosCliente");
		return clientes;
	}

}
