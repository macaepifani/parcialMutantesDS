package org.example.parcialmutantesDS.domain.dto;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.Setter;
import org.example.parcialmutantesDS.validators.ValidDna;

@Getter
@Setter
public class MutantRequestDto {
    @Valid
    @ValidDna
    private String[] dna;
}
