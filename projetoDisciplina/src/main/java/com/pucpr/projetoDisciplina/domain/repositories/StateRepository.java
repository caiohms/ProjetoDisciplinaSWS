package com.pucpr.projetoDisciplina.domain.repositories;

import com.pucpr.projetoDisciplina.domain.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, String> {
}
