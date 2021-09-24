package com.jd.auchandrive.services;

import com.jd.auchandrive.interfaces.ClientService;
import com.jd.auchandrive.models.Client;
import com.jd.auchandrive.models.Commande;
import com.jd.auchandrive.repositories.CategorieRepository;
import com.jd.auchandrive.repositories.ClientRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> findAll() {
        return this.clientRepository.findAll();
    }

    @Override
    public Client create(Client p) {
        this.clientRepository.save(p);
        return p;
    }

    @Override
    public Client put(Client p) {
        this.clientRepository.save(p);
        return p;
    }

    @Override
    public void delete(Long id) {
        this.clientRepository.deleteById(id);
    }

    @Override
    public Optional<Client> findClientById(Long id) {
        return this.clientRepository.findById(id);
    }

    @Override
    public Set<Commande> findCommandeByClient(Long id) {
        return this.clientRepository.findById(id).get().getCommandes();
    }
}
