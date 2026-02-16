package br.com.petz.clientepet.pet.application.api;

import lombok.Value;

import java.util.UUID;

@Value
public class PetResponse {
    private UUID idPet;
}
