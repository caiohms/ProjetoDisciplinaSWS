package com.pucpr.projetoDisciplina.domain.repositories;

import com.pucpr.projetoDisciplina.domain.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
