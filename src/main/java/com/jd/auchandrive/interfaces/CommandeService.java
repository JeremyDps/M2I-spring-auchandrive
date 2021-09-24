package com.jd.auchandrive.interfaces;

import com.jd.auchandrive.models.Commande;

import java.util.List;
import java.util.Optional;

public interface CommandeService {

    public List<Commande> findAll();

    public Commande create(Commande p);

    public Commande put(Commande p);

    public void delete(Long id);

    public Optional<Commande> findCommandeById(Long id);
}
