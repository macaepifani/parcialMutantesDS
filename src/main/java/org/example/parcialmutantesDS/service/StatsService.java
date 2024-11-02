package org.example.parcialmutantesDS.service;

import org.example.parcialmutantesDS.domain.dto.StatsResponse;
import org.example.parcialmutantesDS.repository.MutantRepository;
import org.springframework.stereotype.Service;

@Service
public class StatsService {
    private final MutantRepository mutantRepository;

    // Inyección de dependencias por constructor
    public StatsService(MutantRepository mutantRepository) {
        this.mutantRepository = mutantRepository;
    }

    public StatsResponse getStats(){
        long humanCount = mutantRepository.countByIsMutant(false);
        long mutantCount = mutantRepository.countByIsMutant(true);
        // Si el dividendo es igual a 0, el ratio 0 (evita error por división por 0)
        double ratio = humanCount == 0 ? 0 : (double) mutantCount / humanCount;

        return new StatsResponse(humanCount, mutantCount, ratio);
    }
}
