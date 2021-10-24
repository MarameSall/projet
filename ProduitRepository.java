package com.niit.niitspringproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niit.niitspringproject.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

	
}
