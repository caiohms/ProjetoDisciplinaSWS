package com.pucpr.projetodisciplina.domain.repositories;

import com.pucpr.projetodisciplina.domain.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}
