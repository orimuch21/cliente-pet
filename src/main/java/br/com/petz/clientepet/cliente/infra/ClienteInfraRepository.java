package br.com.petz.clientepet.cliente.infra;

import br.com.petz.clientepet.cliente.application.repository.ClienteRepository;
import br.com.petz.clientepet.cliente.domain.Cliente;
import br.com.petz.clientepet.handle.APIException;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
    private final ClienteSpringJPARepository clienteSpringDataJPARepository;

    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[inicia] ClienteInfraRepository - salva");
        try {
            clienteSpringDataJPARepository.save(cliente);
        } catch (DataIntegrityViolationException e) {
            throw APIException.build(HttpStatus.BAD_REQUEST, "Existem dados duplicados");
        }
        log.info("[finaliza] ClienteInfraRepository - salva");
        return cliente;
    }

    @Override
    public List<Cliente> buscaTodosClientes() {
        log.info("[inicia] ClienteInfraRepository - buscaTodosClientes");
        List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
        log.info("[finaliza] ClienteInfraRepository - buscaTodosClientes");
        return todosClientes;
    }

    @Override
    public Cliente buscaClientesAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteInfraRepository - buscaClientesAtravesId");
        Cliente cliente = clienteSpringDataJPARepository.findById(idCliente)
                        .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente não encontrado!"));
        log.info("[finaliza] ClienteInfraRepository - buscaClientesAtravesId");
        return cliente;
    }

    @Override
    public void deletaCliente(Cliente cliente) {
        log.info("[inicia] ClienteInfraRepository - deletaCliente");
        clienteSpringDataJPARepository.delete(cliente);
        log.info("[finaliza] ClienteInfraRepository - deletaCliente");
    }
}
