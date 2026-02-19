package br.com.petz.clientepet.pet.application.api;

import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.TipoPet;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class PetClienteDetalheResponse {
    private UUID idPet;
    private UUID idClienteTutor;
    private String nomePet;
    private Porte porte;
    private TipoPet tipo;
    private String microchip;
    private String raca;
    private SexoPet sexo;
    private String pelagemCor;
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;
}
