package com.pucpr.projetoDisciplina.domain.repositories;

import com.pucpr.projetoDisciplina.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
