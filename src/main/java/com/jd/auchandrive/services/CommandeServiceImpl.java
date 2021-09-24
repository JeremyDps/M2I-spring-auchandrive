package com.jd.auchandrive.services;

import com.jd.auchandrive.interfaces.CommandeService;
import com.jd.auchandrive.models.Commande;
import com.jd.auchandrive.repositories.CommandeRepository;

import java.util.List;
import java.util.Optional;

public class CommandeServiceImpl implements CommandeService {

    private CommandeRepository commandeRepository;

    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public List<Commande> findAll() {
        return this.commandeRepository.findAll();
    }

    @Override
    public Commande create(Commande p) {
        this.commandeRepository.save(p);
        return p;
    }

    @Override
    public Commande put(Commande p) {
        this.commandeRepository.save(p);
        return p;
    }

    @Override
    public void delete(Long id) {
        this.commandeRepository.deleteById(id);
    }

    @Override
    public Optional<Commande> findCommandeById(Long id) {
        return this.commandeRepository.findById(id);
    }
}
