package com.pucpr.projetodisciplina.domain.repositories;

import com.pucpr.projetodisciplina.domain.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, String> {

}
