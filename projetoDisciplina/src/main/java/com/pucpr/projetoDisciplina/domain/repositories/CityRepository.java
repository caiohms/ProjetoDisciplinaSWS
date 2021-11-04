package com.pucpr.projetoDisciplina.domain.repositories;

import com.pucpr.projetoDisciplina.domain.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, String> {

}
