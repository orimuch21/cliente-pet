package br.com.petz.clientepet.pet.application.api;

import br.com.petz.clientepet.cliente.application.api.ClienteListResponse;
import br.com.petz.clientepet.pet.domain.Pet;
import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.TipoPet;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
public class PetClienteListResponse {
        private UUID idPet;
        private String nomePet;
        private TipoPet tipo;
        private String raca;
        private String pelagemCor;
        private LocalDate dataNascimento;
        private LocalDateTime dataHoraDoCadastro;

        public static List<PetClienteListResponse> converte(List<Pet> petsDoCliente) {
            return petsDoCliente.stream()
                    .map(PetClienteListResponse::new)
                    .collect(Collectors.toList());
    }

        public PetClienteListResponse(Pet pet) {
            this.idPet = pet.getIdPet();
            this.nomePet = getNomePet();
            this.tipo = pet.getTipo();
            this.raca = pet.getRaca();
            this.pelagemCor = pet.getPelagemCor();
            this.dataNascimento = pet.getDataNascimento();
            this.dataHoraDoCadastro = pet.getDataHoraDoCadastro();
    }
}
