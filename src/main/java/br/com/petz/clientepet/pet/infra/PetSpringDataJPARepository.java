package br.com.petz.clientepet.pet.infra;

import br.com.petz.clientepet.pet.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PetSpringDataJPARepository extends JpaRepository<Pet, UUID> {
    List<Pet> findByIdClienteTutor(UUID idClienteTutor);
}
