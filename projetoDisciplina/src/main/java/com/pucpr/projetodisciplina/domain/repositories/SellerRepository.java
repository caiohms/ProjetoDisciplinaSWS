package com.pucpr.projetodisciplina.domain.repositories;

import com.pucpr.projetodisciplina.domain.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
