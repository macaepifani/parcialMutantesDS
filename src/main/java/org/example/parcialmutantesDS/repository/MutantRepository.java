package org.example.parcialmutantesDS.repository;

import org.example.parcialmutantesDS.domain.entities.Mutant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MutantRepository extends JpaRepository<Mutant, Long> {

    Optional<Mutant> findByDna(String dna);

    Long countByIsMutant(boolean isMutant);
}
