package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.pet.application.api.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface PetService {
    PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);
    List<PetClienteListResponse> buscaPetDoClienteComID(UUID idCliente);
    PetClienteDetalheResponse buscaPetDoClienteComID(UUID idCliente, UUID idPet);
    void deletaPetDoClienteComID(UUID idCliente, UUID idPet);
    void alteraPetDoClienteComID(UUID idCliente, UUID idPet, PetAlteracaoRequest petAlteracaoRequest);
}
