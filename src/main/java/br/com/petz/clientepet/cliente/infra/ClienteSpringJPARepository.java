package br.com.petz.clientepet.cliente.infra;

import br.com.petz.clientepet.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringJPARepository extends JpaRepository <Cliente, UUID> {
}
