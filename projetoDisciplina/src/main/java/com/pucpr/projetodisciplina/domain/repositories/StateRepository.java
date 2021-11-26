package com.pucpr.projetodisciplina.domain.repositories;

import com.pucpr.projetodisciplina.domain.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, String> {
}
