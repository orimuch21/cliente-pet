package br.com.petz.clientepet.pet.application.api;

import br.com.petz.clientepet.pet.application.service.PetService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PetController implements PetAPI{
    private final PetService petService;

    @Override
    public PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest) {
        log.info("[inicia] PetController - postPet");
        log.info("[idCliente] {}", idCliente);
        PetResponse pet = petService.criaPet(idCliente, petRequest);
        log.info("[finaliza] PetController - postPet");
        return pet;
    }

    @Override
    public List<PetClienteListResponse> getPetsClienteComId(UUID idCliente) {
        log.info("[inicia] PetController - getPetsClienteComId");
        log.info("[idCliente] {}", idCliente);
        List<PetClienteListResponse> petsDoCliente = petService.buscaPetDoClienteComID(idCliente);
        log.info("[finaliza] PetController - getPetsClienteComId");
        return petsDoCliente;
    }

    @Override
    public PetClienteDetalheResponse getPetClienteComID(UUID idCliente, UUID idPet) {
        log.info("[inicia] PetController - getPetClienteComID");
        log.info("[idCliente] {} - [idPet] {}", idCliente, idPet);
        PetClienteDetalheResponse pet = petService.buscaPetDoClienteComID(idCliente, idPet);
        log.info("[finish] PetController - getPetClienteComID");
        return pet;
    }
}
