package com.jd.auchandrive.repositories;

import com.jd.auchandrive.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
