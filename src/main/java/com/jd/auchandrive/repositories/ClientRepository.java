package com.jd.auchandrive.repositories;

import com.jd.auchandrive.models.Client;
import com.jd.auchandrive.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

    //public List<Commande> findCommandesById(Long id);
}
