package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.pet.domain.Pet;

import java.util.List;
import java.util.UUID;

public interface PetRepository {
    Pet salvaPet(Pet pet);
    List<Pet> buscaPetsDoClienteComID(UUID idCliente);
}
