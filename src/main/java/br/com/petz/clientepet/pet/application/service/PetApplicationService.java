package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.pet.application.api.PetRequest;
import br.com.petz.clientepet.pet.application.api.PetResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
public class PetApplicationService implements PetService {
    @Override
    public PetResponse criaPet(UUID idCliente, PetRequest petRequest) {
        log.info("[start] PetApplicationService - criaPet");

        log.info("[finish] PetApplicationService - criaPet");
        return null;
    }
}
