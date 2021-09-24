package com.jd.auchandrive.interfaces;

import com.jd.auchandrive.models.Client;
import com.jd.auchandrive.models.Commande;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface ClientService {

    public List<Client> findAll();

    public Client create(Client p);

    public Client put(Client p);

    public void delete(Long id);

    public Optional<Client> findClientById(Long id);

    public Set<Commande> findCommandeByClient(Long id);
}
