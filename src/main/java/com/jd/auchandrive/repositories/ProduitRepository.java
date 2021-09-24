package com.jd.auchandrive.repositories;

import com.jd.auchandrive.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
