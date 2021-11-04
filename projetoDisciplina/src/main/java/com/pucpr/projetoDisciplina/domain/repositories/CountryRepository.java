package com.pucpr.projetoDisciplina.domain.repositories;

import com.pucpr.projetoDisciplina.domain.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {

}
