package com.pucpr.projetodisciplina.domain.repositories;

import com.pucpr.projetodisciplina.domain.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
